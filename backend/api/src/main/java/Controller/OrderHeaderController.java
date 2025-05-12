package Controller;

import Model.Job;
import Model.OrderHeader;
import Model.OrderHeaderDao;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
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

    //variable gson
    Gson gson = new Gson();

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

        listOrderHeader = oHDao.findAll(new OrderHeader());




        String json = gson.toJson(listOrderHeader);
        out.println(json);


    }

    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("application/json;charset=UTF-8");
        resp.setHeader("Access-Control-Allow-Origin", "*");
        resp.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        resp.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
        resp.setHeader("Access-Control-Max-Age", "3600");
        String nombre = req.getParameter("user");
        String nombreUser = req.getParameter("name");


    }



}
