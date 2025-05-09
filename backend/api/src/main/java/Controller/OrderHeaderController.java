package Controller;

import Model.OrderHeader;
import Model.OrderHeaderDao;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "OrderHeaderController", urlPatterns = {"/OrderHeader"})
public class OrderHeaderController extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out =  resp.getWriter();
        ArrayList<OrderHeader> listOrderHeader = new ArrayList<>();
        OrderHeaderDao oHDao = new OrderHeaderDao();

        listOrderHeader = oHDao.findAll(new OrderHeaderDao());

        String resultado= "";
        for(OrderHeader oH : listOrderHeader){
            resultado += oH.toString();
        }
        System.out.println(resultado);

        out.println(resultado);

    }
}
