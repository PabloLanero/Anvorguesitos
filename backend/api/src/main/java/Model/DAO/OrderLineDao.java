package Model.DAO;

import Model.OrderLine;
import Model.Product;
import Motorsql.IMotorSql;
import Motorsql.MotorSql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderLineDao implements Dao{

    private final String SQL_FINDALL = "SELECT ORL.id_orderLine, ORL.orderQuantity, PRO.id_product, PRO.productTitle, PRO.imagePath\n" +
            " FROM Hambearguesitos.ORDERS_LINE ORL INNER JOIN PRODUCTS PRO ON ORL.id_product = PRO.id_product WHERE 1 = 1 ";
    private IMotorSql motorSql;

    public OrderLineDao(){
        motorSql = new MotorSql();
    }

    @Override
    public int add(Object obj) {

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
    public ArrayList findAll(Object bean, IMotorSql motorSql) {
        ArrayList<OrderLine> orderLineArrayList = new ArrayList<>();
        String sqlSimple = SQL_FINDALL;
        Integer idOrderHeader = -1;


        boolean bCloseDbConnection = false;
        if( bean instanceof Integer){
            idOrderHeader = (Integer) bean;
        } else if (bean instanceof OrderLine) {
            OrderLine orderLine = (OrderLine) bean;
            if(orderLine.getOrderHeader() != null){
                idOrderHeader = orderLine.getOrderHeader().getIdOrderHeader();
            }
        }


        try{
            if (motorSql ==null) {
                motorSql.connect();
                bCloseDbConnection = true;

            }
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
                Product product = new Product();
                product.setIdProduct(rs.getInt("id_product"));
                product.setProductTitle(rs.getString("productTitle"));
                product.setImagePath(rs.getString("imagePath"));

                orderLine.setProduct(product);
                orderLine.setCuantity(rs.getInt("orderQuantity"));
                orderLineArrayList.add(orderLine);
            }


        }catch (SQLException sqlEx){
            System.out.println(sqlEx.getMessage());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            if (bCloseDbConnection)
            {motorSql.disconnect();}
        }
        return orderLineArrayList;
    }
}
