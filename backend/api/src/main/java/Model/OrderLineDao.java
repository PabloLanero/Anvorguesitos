package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderLineDao implements Dao{

    private final String SQL_FINDALL = "SELECT ORL.* FROM Hambearguesitos.ORDERS_LINE ORL WHERE 1 = 1 ";
    private IMotorSql motorSql;

    public OrderLineDao(){
        motorSql = new MotorSql();
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
    public ArrayList findAll(Object bean) {
        ArrayList<OrderLine> orderLineArrayList = new ArrayList<>();
        String sqlSimple = SQL_FINDALL;
        Integer idOrderHeader = -1;

        if( bean instanceof Integer){
            idOrderHeader = (Integer) bean;
        } else if (bean instanceof OrderLine) {
            OrderLine orderLine = (OrderLine) bean;
            if(orderLine.getOrderHeader() != null){
                idOrderHeader = orderLine.getOrderHeader().getIdOrderHeader();
            }
        }


        try{
            motorSql.connect();
            if (idOrderHeader >0){
                sqlSimple += " AND ORL.id_orderHeader = ? ";
            }

            PreparedStatement preparedStatement = motorSql.getConnection().prepareStatement(sqlSimple);

            int orden = 1;
            if(idOrderHeader > 0)preparedStatement.setInt(orden++, idOrderHeader);

            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                OrderLine orderLine = new OrderLine();
                orderLine.setIdOrderLine(rs.getInt("id_orderLine"));
                Integer idProducto = rs.getInt("id_product");
                ProductDao productDao = new ProductDao();
                ArrayList<Product> productoArrayList = productDao.findAll(idProducto);
                orderLine.setProduct(productoArrayList.get(0));
                orderLine.setCuantity(rs.getInt("orderQuantity"));
                orderLineArrayList.add(orderLine);
            }


        }catch (SQLException sqlEx){
            System.out.println(sqlEx.getMessage());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        return orderLineArrayList;
    }
}
