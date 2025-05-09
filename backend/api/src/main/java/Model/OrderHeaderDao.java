package Model;

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
    public int delete(Integer e) {
        return 0;
    }

    @Override
    public int update(Object bean) {
        return 0;
    }

    @Override
    public ArrayList  findAll(Object bean) {
        ArrayList<OrderHeader> listOrderHeader = new ArrayList<>();
        String sql = "SELECT OH.id_orderHeader, OH.orderDate, OH.shippingAddress, OH.isTransactionAcepted, OH.orderStatus, PM.id_paymentMethod, PM.paymentMethodName, " +
                "CU.id_customer, CU.firstName, EM.id_employee, EM.employeeFirstName " +
                "FROM Hambearguesitos.ORDERS_HEADER OH " +
                "INNER JOIN Hambearguesitos.PAYMENT_METHODS PM ON PM.id_paymentMethod = OH.id_paymentMethod " +
                "INNER JOIN Hambearguesitos.CUSTOMERS CU ON CU.id_customer = OH.id_customer " +
                "INNER JOIN Hambearguesitos.EMPLOYEES EM ON EM.id_employee = OH.id_employee " +
                "WHERE 1 = 1 ";
        try{
            motorSql.connect();
            if(bean !=null){

            }
            sql += ";";
            ResultSet rs = motorSql.executeQuery(sql);
            while(rs.next()){
                OrderHeader pedido = new OrderHeader(
                            //Aqui se instancia la parte del pedido
                        rs.getInt("id_orderHeader"),rs.getString("shippingAddress"),rs.getString("orderStatus"),
                            //Aqui se crea el cliente del pedido
                        new Customer(rs.getInt("id_customer"),rs.getString("firstName")),
                            //Aqui se crea el empleado del pedido
                        new Employee(rs.getInt("id_employee"),rs.getString("employeeFirstName")),
                            //Aqui se crea el metodo de pago
                        new PaymentMethod(rs.getInt("id_paymentMethod"),rs.getString("paymentMethodName")),
                            //Aqui se termina de crear el objeto de pedido

                        rs.getString("orderDate"),rs.getBoolean("isTransactionAcepted"));
                listOrderHeader.add(pedido);
            }
            return listOrderHeader;

        }catch (SQLException sqlEx){
            System.out.println(sqlEx.getMessage());
        }catch (Exception ex){
            System.out.println("Ha habido un problema "+ ex.getMessage());
        }




        return listOrderHeader;
    }
}
