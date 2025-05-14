package Model.DAO;



import Model.*;
import Motorsql.IMotorSql;
import Motorsql.MotorSql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderHeaderDao implements Dao{

    private final String SQL_FINDALL = "SELECT * FROM ORDERS_HEADER WHERE 1=1";
    private IMotorSql motorSql;

    //Constructor
    public OrderHeaderDao(){
        motorSql = new MotorSql();
    }


    @Override
    public int add(Object bean) {
        return 0;
    }

    @Override
    public int delete(Object bean) {
        Integer idOrderHeader = -1;

        if(bean instanceof Integer){
            idOrderHeader = (Integer) bean;
        } else if (bean instanceof OrderHeader) {
            idOrderHeader = ((OrderHeader) bean).getIdOrderHeader();
        }

        //Si puedo asignar el id alergeno
        if(idOrderHeader >0){
            try{
                motorSql.connect();
                String sql = "DELETE FROM Hambearguesitos.ORDERS_HEADER OH WHERE OH.id_orderHeader = ? ;";
                PreparedStatement sentencia = motorSql.getConnection().prepareStatement(sql);//;
                sentencia.setInt(1,idOrderHeader);
                motorSql.setPreparedStatement(sentencia);
                motorSql.execute();
            }catch (SQLException sqlEx){

            }catch (Exception Ex){

            }
        }

        return idOrderHeader;
    }

    @Override
    public int update(Object bean) {
        return 0;
    }

    @Override
    public ArrayList findAll(Object obj, IMotorSql motorSql) {

        //Creamos la lista en la que se va a almacenar los datos
        ArrayList<OrderHeader> listOrderHeader = new ArrayList<>();
        boolean bCloseDbConnection = false;
        //Y empezamos a crear la sentencia
        String sql = "SELECT OH.id_orderHeader, OH.orderDate, OH.shippingAddress, OH.isTransactionAcepted, OH.orderStatus, OH.id_paymentMethod, " +
                "CU.id_customer, CU.firstName, EM.id_employee, EM.employeeFirstName " +
                "FROM Hambearguesitos.ORDERS_HEADER OH " +
                "INNER JOIN Hambearguesitos.CUSTOMERS CU ON CU.id_customer = OH.id_customer " +
                "INNER JOIN Hambearguesitos.EMPLOYEES EM ON EM.id_employee = OH.id_employee " +
                "WHERE 1 = 1 ";
        try{
            //Nos conectamos
            if(motorSql == null) {
                motorSql = new MotorSql();
                motorSql.connect();
                bCloseDbConnection = true;
            }
            //Y si se pasa un objeto de tipo OrderHeader, se aplicarian los filtros aqui
            if(obj !=null && obj instanceof OrderHeader){
                OrderHeader objOrderHeader = (OrderHeader) obj;
                if(objOrderHeader.getIdOrderHeader() > 0 ){
                    sql += " AND OH.id_orderHeader = "+ objOrderHeader.getIdOrderHeader()+ " ";
                }

                if(objOrderHeader.getOrderDate() !="" && objOrderHeader.getOrderDate() !=null){
                    sql += " AND OH.orderDate = " +objOrderHeader.getOrderDate()+" ";
                }



            }
            sql += ";";
            //Aqui ejecumatos la sentencia para lanzarla a la base de datos
            ResultSet rs = motorSql.executeQuery(sql);

            //Y aqui recogemos los datos para añadirlos a la lista
            while(rs.next()){
                //Creamos un objeto con las propiedades de la fila devuelta como resultado
                OrderHeader pedido = new OrderHeader();

                pedido.setIdOrderHeader(rs.getInt("id_orderHeader"));
                pedido.setShippingAddress(rs.getString("shippingAddress"));
                pedido.setOrderStatus(rs.getString("orderStatus"));
                pedido.setCustomer(new Customer(rs.getInt("id_customer"),rs.getString("firstName")));
                pedido.setEmployee(new Employee(rs.getInt("id_employee"),rs.getString("employeeFirstName")));
                pedido.setPaymentMethod(rs.getInt("id_paymentMethod"));
                pedido.setOrderDate(rs.getString("orderDate"));
                pedido.setAccepted(rs.getBoolean("isTransactionAcepted"));




                //Creamos un orderLine que tenga el pedido
                OrderLine orderLine = new OrderLine(pedido);
                OrderLineDao orderLineDao = new OrderLineDao();
                ArrayList<OrderLine> orderLineArrayList = orderLineDao.findAll(orderLine, motorSql);
                pedido.setListOrderLine(orderLineArrayList);

                //Y lo añadimos a la lista
                listOrderHeader.add(pedido);
            }


        }catch (SQLException sqlEx){
            System.out.println(sqlEx.getMessage());
        }catch (Exception ex){
            System.out.println("Ha habido un problema "+ ex.getMessage());
        }finally {
            if(bCloseDbConnection) {
                motorSql.disconnect();
            }
        }




        return listOrderHeader;
    }
}
