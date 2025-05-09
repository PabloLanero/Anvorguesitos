package Controller;

import Model.OrderHeader;
import Model.OrderHeaderDao;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

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

        resp.setContentType("application/json;charset=UTF-8");
        resp.setHeader("Access-Control-Allow-Origin", "*");
        resp.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        resp.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
        resp.setHeader("Access-Control-Max-Age", "3600");
        PrintWriter out =  resp.getWriter();
        ArrayList<OrderHeader> listOrderHeader = new ArrayList<>();
        OrderHeaderDao oHDao = new OrderHeaderDao();

        listOrderHeader = oHDao.findAll(new OrderHeaderDao());

        String resultado= "{";
        for(OrderHeader oH : listOrderHeader){
            resultado += oH.toString()+",\n";
        }
        System.out.print(resultado.charAt(515));
        System.out.print(resultado.charAt(516));
        System.out.print(resultado.charAt(517));
        System.out.print(resultado.charAt(518));
        System.out.print(resultado.charAt(519));
        System.out.print(resultado.charAt(520));
        System.out.print(resultado.charAt(521));
        System.out.print(resultado.charAt(522));
        System.out.print(resultado.charAt(523));
        System.out.print(resultado.charAt(524));
        System.out.print(resultado.charAt(525));
        System.out.print(resultado.charAt(526));

        System.out.println(resultado.substring(0,resultado.length()-1)+'}');
        out.println(resultado.substring(0,resultado.length()-2)+'}');

    }
}
