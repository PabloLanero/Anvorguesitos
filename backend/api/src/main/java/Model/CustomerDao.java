package Model;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerDao implements Dao{

    private final String SQL_FINDALL = "SELECT * FROM CUSTOMERS WHERE 1=1";
    private final String SQL_DELETE = "DELETE * FROM CUSTOMERS WHERE ";
    private IMotorSql motorSql;


    //////////////////////////// TEORÍA METODOS CRUD SINTAXIS ANTON/////////////////////////////////////////////


    @Override
    public int add(Object bean) {
        return 0;
    }

    @Override
    public int delete(Integer e) {
        //inicializamos el valor de ielement a -1 para que no interfiera
        //1º Comprobar el tipo de objeto ( E o I) para asignarlo al id_customer
        Integer id_customer =  -1;

        if (e instanceof Integer) {
            id_customer = (Integer)e;
        }else if(e instanceof Customer){
            id_customer = ((Customer) e).getId();
        }

        //si puedo asignar el id_customer, procedo a borrar
        if (id_customer>0){
            try {
                motorSql.connect();
                SQL_DELETE+="ID_CUSTOMER = ?";
                motorSql.execute(SQL_DELETE);


            }catch(SQLException sqlEx){

            }finally {
                motorSql.disconnect();
            }
        }





        return 0;
    }

    @Override
    public int update(Object bean) {
        return 0;
    }

    @Override
    public ArrayList findAll(Object bean) {
        return null;
    }
}
