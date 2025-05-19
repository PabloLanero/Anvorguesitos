package Controller;

import Controller.Session.Sesion;
import Model.Customer;
import Model.DAO.CustomerDao;
import Model.Employee;
import Model.DAO.EmployeeDao;
import com.google.gson.Gson;
import com.google.gson.JsonParser;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;

@WebServlet(name = "LoginController", urlPatterns = {"/Login"})
public class LoginController extends HttpServlet {



    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Configurar CORS
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        // Permitir CORS para todas las rutas
        response.setHeader("Access-Control-Allow-Origin", "*"); // O usa un origen específico

        //tomo datos del navegador

        PrintWriter out = response.getWriter();


        //creo un parseador(una clase de la librería de gson)  => analiza y convierte a JSON objetos java y al revés
        JsonParser parser = new JsonParser();
        Gson gson = new Gson();

        // creo un usuario a raíz de: uso biblioteca gson --> clase parseadora --> parsea el cuerpo de la petición (JSON) a clase java de ese tipo
        Sesion session  = gson.fromJson(parser.parse(getBody(request)), Sesion.class);

//parseo los datos y miro si es trabajador o cliente

        if(session.getName().isEmpty() || session.getPassword().isEmpty()){
            session = null;
        }else{

            if(session.getName().contains("@anvorguesitos.com")){
                System.out.println("entro a employees");
                //AQUI, LA VARIABLE name ES EL CORREO
                Employee emp = new Employee(session.getName(),session.getPassword());

                

                EmployeeDao empDao = new EmployeeDao();

                ArrayList<Employee> employeeArrayList = empDao.findAll(emp, null);
                if(!employeeArrayList.isEmpty()){
                    session = new Sesion(employeeArrayList.get(0));
                    System.out.println(gson.toJson(session));
                }else{
                    System.out.println(gson.toJson(""));
                    session = null;
                }
            }else{
                System.out.println("entro a clientes");
                Customer customer = new Customer(session.getName(),session.getPassword());

                System.out.println("customer:" + customer);

                CustomerDao customerDao = new CustomerDao();
                ArrayList<Customer> customerArrayList = customerDao.findAll(customer, null);
                if(!customerArrayList.isEmpty()){
                    session = new Sesion(customerArrayList.get(0));
                    System.out.println(gson.toJson(session));
                }else{
                    System.out.println(gson.toJson(""));
                    session = null;
                }

            }
        }


        //enviamos respuesta al usuario
        response.getWriter().print(gson.toJson(session));
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


