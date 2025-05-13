package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerDao implements Dao{

    private final String SQL_FINDALL = "SELECT * FROM CUSTOMERS CU WHERE 1=1";
    private final String SQL_DELETE = "DELETE * FROM CUSTOMERS WHERE ";
    private IMotorSql motorSql;



    // constructor que automaticamente crea motor
    public CustomerDao(){
        motorSql = new MotorSql();
    }

    ////////////////////////////      METODOS CRUD     ////////////////////////////////////////////



    @Override
    public int add(Object bean) {
        return 0;
    }

    @Override
    public int delete(Object obj) {
        //inicializamos el valor de ielement a -1 para que no interfiera
        Integer id_customer =  -1;
        boolean nFilasAfectadas = false;
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

                 nFilasAfectadas = motorSql.execute();


            }catch(SQLException sqlEx){

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
    public ArrayList findAll(Object obj) {
        //inicializo array de customers
        ArrayList <Customer> listCustomers = new ArrayList<>();

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
           motorSql.connect();

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
            motorSql.disconnect();
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


























