package Model.DAO;

import Model.Customer;
import Motorsql.IMotorSql;
import Motorsql.MotorSql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * This class is designed to control the access to the data in the database and control how it works
 */
public class CustomerDao implements Dao{

    private final String SQL_FINDALL = "SELECT * FROM CUSTOMERS CU WHERE 1=1";
    private final String SQL_DELETE = "DELETE * FROM CUSTOMERS WHERE ";
    private final String SQL_INSERT = "INSERT INTO CUSTOMERS (firstName, lastName, emailCustomer, phoneCustomer, passwordCustomer, isRegistered) VALUES (?, ?, ?, ?, ?, ?)";

    private IMotorSql motorSql;



    // constructor que automaticamente crea motor
    public CustomerDao(){
        motorSql = new MotorSql();
    }

    ////////////////////////////      METODOS CRUD     ////////////////////////////////////////////



    @Override
    public int add(Object obj, IMotorSql motorSql) {
        //flag exito
        int iRet = 0;
        boolean bCloseDbConnection = false;
        try
        {
            //0. conectamos a la bbdd
            if (motorSql == null) {
                motorSql = new MotorSql();
                motorSql.connect();
                bCloseDbConnection = true;
            }

            //1. casteamos obj a customer
            Customer customer = (Customer)obj;

            //3. preparamos sentencia sql
            PreparedStatement sentenciaPreparada = motorSql.getConnection().prepareStatement(SQL_INSERT);

            //4. asignamos valores al insert
            sentenciaPreparada.setString( 1,customer.getFirstName());
            sentenciaPreparada.setString( 2,customer.getLastName());
            sentenciaPreparada.setString( 3, customer.getEmailCustomer());
            sentenciaPreparada.setString( 4, customer.getPhoneCustomer());
            sentenciaPreparada.setString( 5, customer.getPasswordCustomer());
            sentenciaPreparada.setBoolean( 6,customer.isRegistered());

            //si funciona seteamos variable de exito
            iRet = sentenciaPreparada.executeUpdate();

            ResultSet resultSet = motorSql.executeQuery("SELECT LAST_INSERT_ID() FROM CUSTOMERS;");
            while(resultSet.next()){
                iRet = resultSet.getInt("LAST_INSERT_ID()");
            }

        }catch (SQLException sqlEx){
            System.out.println(sqlEx.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            if (bCloseDbConnection) {
                motorSql.disconnect();
            }
        }

        return iRet;
    }

    @Override
    public int delete(Object obj) {
        //inicializamos el valor de ielement a -1 para que no interfiera
        Integer id_customer =  -1;
        boolean filasAfectadas = false;
        String sqlSimple = SQL_DELETE+ "ID_CUSTOMER = ?";

        //1º casting
        if (obj instanceof Integer) {
            id_customer = (Integer)obj;
        }else if(obj instanceof Customer){
            id_customer = ((Customer) obj).getIdCustomer();
        }


        //si puedo asignar el id_customer, procedo a borrar
        if (id_customer>0){
            try {
                motorSql.connect();

                PreparedStatement sentenciaPreparada = motorSql.getConnection().prepareStatement(sqlSimple);

                sentenciaPreparada.setInt(1, id_customer);

                 filasAfectadas = motorSql.execute();

            }catch(SQLException sqlEx){

            }finally {
                motorSql.disconnect();
            }
        }


        return filasAfectadas ? 1:0;
    }

    @Override
    public int update(Object bean) {
        return 0;
    }

    @Override
    public ArrayList findAll(Object obj, IMotorSql motorSql) {
        //inicializo array de customers
        ArrayList <Customer> listCustomers = new ArrayList<>();

        //Para la conexion
        boolean bCloseDbConnection = false;
        //sentencia sql
        String sqlSimple = SQL_FINDALL;

        //inicializamos el valor de ielement a -1 para que no interfiera
        Integer id_customer =  -1;


        //Variables para logearse
        String name = "";
        String password ="";
        //casting
        if (obj instanceof Integer) {
            id_customer = (Integer)obj;
        }else if(obj instanceof Customer){
            Customer customer = (Customer) obj;
            id_customer = customer.getIdCustomer();
            name = customer.getFirstName();
            password = customer.getPasswordCustomer();
        }


        try
        {
           //nos conectamos
            if (motorSql == null) {
                motorSql = new MotorSql();
                motorSql.connect();
                bCloseDbConnection = true;
            }

           //si tiene filtro, lo añadimos para construir la sentencia
           if(id_customer > 0){
               sqlSimple += " AND CU.id_customer = ? ";
           }

            if(!name.isEmpty() && name != null){
                sqlSimple += " AND CU.isRegistered = true AND CU.firstName = ? ";
            }

            if(!password.isEmpty() && password != null){
                sqlSimple += " AND CU.isRegistered = true AND CU.passwordCustomer = ? ";
            }


            sqlSimple += ";";

            //creamos la sentencia prpearada para ejecutar
            PreparedStatement sentenciaPreparada = motorSql.getConnection().prepareStatement(sqlSimple);

            //Vamos a ir añadiendo los valores, en funcion de los valores comprobados, se añadiran en EL MISMO ORDEN
            //Para ello utilizaremos una variable propia que cuente el orden que deben añadirse los valores
            int orden = 1;

            //asignamos el valor al interrogante
            if(id_customer > 0){
               sentenciaPreparada.setInt(orden++,id_customer);
            }

            if(!name.isEmpty() && name != null){
                sentenciaPreparada.setString(orden++,name);
            }

            if(!password.isEmpty() && password != null){
                sentenciaPreparada.setString(orden++,password);
            }

           //realizamos select
            ResultSet rs = sentenciaPreparada.executeQuery();

           //creamos objeto con el  rs
            while(rs.next()){
                Customer customer = new Customer();
                customer.setIdCustomer(rs.getInt("id_customer"));
                customer.setFirstName(rs.getString("firstName"));
                customer.setLastName(rs.getString("lastName"));
                customer.setEmailCustomer(rs.getString("emailCustomer"));
                customer.setPhoneCustomer(rs.getString("phoneCustomer"));
                customer.setPasswordCustomer(rs.getString("passwordCustomer"));
                customer.setRegistered(rs.getBoolean("isRegistered"));
                listCustomers.add(customer);


            }


        }catch (SQLException sqlEx){
            System.out.println(sqlEx.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            if (bCloseDbConnection) {
                motorSql.disconnect();
            }
        }




        return listCustomers;
    }
}

/*
Get all hambuerguers GET /hamburguers
Get hambuerger by id GET /hamburguers/{id}
Create hamburguer POST /hambuerguers
Update hambuerguer PUT/PATCH /hamburguers/{id}
Delete hamburger DELETE /hamburguers/{id}
*/


























