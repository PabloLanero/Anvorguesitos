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
        if( id_orderHeader !=null && !id_orderHeader.isEmpty() ){
            orderHeader.setIdOrderHeader(Integer.parseInt(id_orderHeader));
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
        String nombre = req.getParameter("user");
        String nombreUser = req.getParameter("name");


        //creo un parseador(una clase de la librería de gson)  => analiza y convierte a JSON objetos java y al revés
        JsonParser parser = new JsonParser();
        Gson gson = new Gson();

        OrderHeader newOrderheader  = gson.fromJson(parser.parse(getBody(req)), OrderHeader.class);

        OrderHeaderDao orderHeaderDao = new OrderHeaderDao();

        int idPedido = orderHeaderDao.add(newOrderheader);
        PrintWriter out = resp.getWriter();
        out.println(idPedido);

        // creo un usuario a raíz de: uso biblioteca gson --> clase parseadora --> parsea el cuerpo de la petición (JSON) a clase java de ese tipo

        /*
        body_all = parser.parse(getBody(request));
        body_order_header = body_all['name']
        OrderHeader newOrderHeader  = gson.fromJson(body_order_header, OrderHeader.class);
        for (lines body_all['lines'] as line) {
            line add newOrderHeader.id
            OrderLine = gson.fromJson(line, OrderLine.class);
        }

*/

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
