package Model.DAO;

import Motorsql.IMotorSql;
import Motorsql.MotorSql;
import Model.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDao implements Dao{

    private final String SQL_FINDALL = "SELECT * FROM PRODUCTS WHERE 1=1 ";
    private final String SQL_DELETE = "DELETE * FROM PRODUCTS WHERE ";
    private IMotorSql motorSql;




    // constructor que automaticamente crea motor
    public ProductDao(){
        motorSql = new MotorSql();
    }

    ////////////////////////////      METODOS CRUD     ////////////////////////////////////////////


    @Override
    public int add(Object bean, IMotorSql motorSql) {
        return 0;
    }

    @Override
    public int delete(Object obj) {
        Integer id_product = -1;
        boolean nFilasAfectadas = false;
        String sqlSimple = SQL_DELETE + " PRODUCTS.id_product = ?";

        //1º casting

        if(obj instanceof Integer){
            id_product = (Integer) obj;
        } else if (obj instanceof Product) {
            id_product = ((Product) obj).getIdProduct();
        }

        //2º si puedo asignar el id_customer, procedo a borrar
        if(id_product>0){
            try{
                motorSql.connect();

                PreparedStatement sentenciaPreparada = motorSql.getConnection().prepareStatement(sqlSimple);
                sentenciaPreparada.setInt(1,id_product);
                nFilasAfectadas = motorSql.execute();
            }catch(SQLException sqlEx){
                System.out.println(sqlEx.getMessage());
            } catch (Exception ex) {
                System.out.println(ex);
            }finally {
                motorSql.disconnect();
            }
        }

        return nFilasAfectadas ? 1:0;
    }

    @Override
    public int update(Object bean) {
        return 0;
    }

    @Override
    public ArrayList findAll(Object obj, IMotorSql motorSql) {
        //creo arraylist
        ArrayList<Product> listProducts = new ArrayList<>();

        //sentencia sql
        String sqlSimple = SQL_FINDALL;

        //inicializamos el valor de ielement a -1 para que no interfiera
        Integer id_product =  -1;
        boolean bCloseDbConnection = false;

        //casting
        if (obj instanceof Integer) {
            id_product = (Integer)obj;
        }else if(obj instanceof Product){
            id_product = ((Product) obj).getIdProduct();

        }


        try{
            //nos conectamos
            if (motorSql == null)
            {
            motorSql = new MotorSql();
                motorSql.connect();
                bCloseDbConnection = true;
            }
            //si tiene filtro, lo añadimos para construir la sentencia
            if(id_product > 0){
                sqlSimple += " AND PRODUCTS.id_product = ?";
            }


            sqlSimple += ";";

            //creamos la sentencia prpearada para ejecutar
            PreparedStatement sentenciaPreparada = motorSql.getConnection().prepareStatement(sqlSimple);


            //asignamos el valor al interrogante
            if(id_product > 0){
                sentenciaPreparada.setInt(1,id_product);
            }

            //realizamos select
            ResultSet rs = sentenciaPreparada.executeQuery();


            //creamos objeto con el  rs
            while(rs.next()){
                Product product = new Product();
                product.setIdProduct(rs.getInt("id_product"));
                product.setProductTitle(rs.getString("productTitle"));
                product.setDescription(rs.getString("description"));
                product.setPrice(rs.getDouble("price"));

                //manejo enum
                product.setCategory(rs.getInt("id_productCategory"));



                product.setImagePath(rs.getString("imagePath"));
                product.setIngredients(new IngredientDao().findAll(product,motorSql));

                listProducts.add(product);


            }



        }catch (SQLException sqlEx){
            System.out.println(sqlEx.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
        if (bCloseDbConnection ) {
            motorSql.disconnect();
        }
        }




        return listProducts;
    }
}








































