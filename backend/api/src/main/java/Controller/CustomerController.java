package Controller;

import Model.Customer;
import Model.DAO.CustomerDao;
import com.google.gson.Gson;
import com.google.gson.JsonParser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;


@WebServlet(name = "CustomerController", urlPatterns = {"/Customer"})
public class CustomerController extends HttpServlet {


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


        ArrayList<Customer> listCustomers = new ArrayList<>();
        CustomerDao customerDao = new CustomerDao();

        listCustomers = customerDao.findAll(new Customer(), null);



        //convertir a JSON
        String json = gson.toJson(listCustomers);
        out.println(json);
        out.close();


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        //la respuesta tendrá un formato de texto plano con esa codificación
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");

        //creo un parseador(una clase de la librería de gson)  => analiza y convierte a JSON objetos java y al revés
        JsonParser parser = new JsonParser();
        Gson gson = new Gson();

        // creo un usuario a raíz de: uso biblioteca gson --> clase parseadora --> parsea el cuerpo de la petición (JSON) a clase java de ese tipo
        Customer newCustomer  = gson.fromJson(parser.parse(getBody(request)), Customer.class);

        //lo transformamos a json para ver por consola que se ha creado
        System.out.println(gson.toJson(newCustomer));

        //enviamos respuesta al usuario
        response.getWriter().print("hola " + newCustomer.getFirstName() +  " tu usuario se ha agregado correctamente"+ "\r\n");

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
