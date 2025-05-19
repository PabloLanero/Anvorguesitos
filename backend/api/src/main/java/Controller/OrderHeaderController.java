package Controller;

import Model.Customer;
import Model.OrderHeader;
import Model.DAO.OrderHeaderDao;
import Model.OrderLine;
import com.google.gson.Gson;
import com.google.gson.JsonParser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
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
        OrderHeader orderHeader = new OrderHeader();
        String id_orderHeader = req.getParameter("idOrder");
        String id_user = req.getParameter("idUser");
        if( id_orderHeader !=null && !id_orderHeader.isEmpty() ){
            orderHeader.setIdOrderHeader(Integer.parseInt(id_orderHeader));
        }

        if(id_user !=null && !id_user.isEmpty()) {
            Customer customer = new Customer();
            customer.setIdCustomer(Integer.parseInt(id_user));
            orderHeader.setCustomer(customer);
        }

        listOrderHeader = oHDao.findAll(orderHeader, null);




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
        
      

        //creo un parseador(una clase de la librería de gson)  => analiza y convierte a JSON objetos java y al revés
        JsonParser parser = new JsonParser();
        Gson gson = new Gson();
        OrderHeader newOrderheader  = gson.fromJson(parser.parse(getBody(req)), OrderHeader.class);
        OrderHeaderDao orderHeaderDao = new OrderHeaderDao();
        int idPedido = orderHeaderDao.add(newOrderheader, null);
        System.out.println(idPedido);
        PrintWriter out = resp.getWriter();
        out.println(idPedido);

        

    }






    //función que recoge y lee los datos del post y los envuelve en un string
    private static String getBody(HttpServletRequest request)  {

        String body = null;
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = null;

        try {
            InputStream inputStream = request.getInputStream();
            if (inputStream != null) {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                char[] charBuffer = new char[128];
                int bytesRead = -1;
                while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
                    stringBuilder.append(charBuffer, 0, bytesRead);
                }
            } else {
                stringBuilder.append("");
            }
        } catch (IOException ex) {
            // throw ex;
            return "";
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException ex) {

                }
            }
        }

        body = stringBuilder.toString();
        return body;
    }



}
