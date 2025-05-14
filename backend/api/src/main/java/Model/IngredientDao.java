package Model;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class IngredientDao implements Dao{

    private final String SQL_FINDALL = "SELECT * FROM INGREDIENTS WHERE 1=1";
    private IMotorSql motorSql;

    public IngredientDao(){
        motorSql= new MotorSql();
    }

    @Override
    public int add(Object bean) {
        return 0;
    }

    @Override
    public int delete(Object bean) {
        return 0;
    }

    @Override
    public int update(Object bean) {
        return 0;
    }

    @Override
    public ArrayList findAll(Object obj, IMotorSql motorSql) {

        ArrayList<Ingredient> listIngredients = new ArrayList<>();

        //sentencia sql
        String sqlSimple = SQL_FINDALL;

        Integer id_ingredient = -1;
        Integer id_productFiltered = -1;

        if(obj instanceof Integer){
            id_ingredient = (Integer)id_ingredient;
        }else if (obj instanceof Ingredient){
            id_ingredient = ((Ingredient)obj).getIdIngredient();
        }else if (obj instanceof Product){
            //devolvemos los ingredientes del producto
            id_productFiltered = ((Product)obj).getIdProduct();
            sqlSimple = "SELECT ING.*, INP.id_product FROM Hambearguesitos.INGREDIENTS ING INNER JOIN INGREDIENTS_PRODUCTS INP ON INP.id_ingredient = ING.id_ingredient WHERE 1 = 1 ";

        }

        try
        {
            if (motorSql == null) {
                motorSql.connect();
            }


            if(id_ingredient > 0 && id_productFiltered == -1) {
                sqlSimple += "AND INGREDIENT.id_ingredient = ?";
            }else if(id_productFiltered > 0 && id_ingredient == -1){
                //queremos obtener los alergenos
                sqlSimple += "AND INP.id_product = ?";
            }


            sqlSimple += ";";

            PreparedStatement sentenciaPreparada = motorSql.getConnection().prepareStatement(sqlSimple);


            if(id_ingredient > 0){
                sentenciaPreparada.setInt(1,id_ingredient);
            }else if(id_productFiltered > 0){
                sentenciaPreparada.setInt(1,id_productFiltered);
            }

            ResultSet rs = sentenciaPreparada.executeQuery();

            while(rs.next()){
                Ingredient ingredient = new Ingredient();

                ingredient.setIdIngredient(rs.getInt("id_ingredient"));
                ingredient.setIngredientName(rs.getString("ingredientName"));
                ingredient.setAllergen(rs.getString("allergen"));

                listIngredients.add(ingredient);
            }

        }catch (SQLException sqlEx){
            System.out.println(sqlEx.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            if (motorSql

                    != null) {
                motorSql.disconnect();
            }
        }

        return listIngredients;
    }



}
