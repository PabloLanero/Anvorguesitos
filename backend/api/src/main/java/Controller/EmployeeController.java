package Controller;

import Model.*;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


@WebServlet(name = "EmployeeController", urlPatterns = {"/Employee"})
public class EmployeeController extends HttpServlet{

    //variable gson
    Gson gson = new Gson();



    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //politics
        resp.setContentType("application/json;charset=UTF-8");
        resp.setHeader("Access-Control-Allow-Origin", "*");
        resp.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        resp.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
        resp.setHeader("Access-Control-Max-Age", "3600");


        PrintWriter out =  resp.getWriter();
        //aplicar filtros si existen
        String parametro = req.getParameter("id_employee");

        //creamos un nuevo empleado, si existe un filtro, lo aplicaremos
        Employee employee = new Employee();


        if(parametro!=null && !parametro.isEmpty() ){
            employee.setIdEmployee(Integer.parseInt(parametro));
        }

        ArrayList<Employee> listEmployees = new ArrayList<>();
        EmployeeDao employeeDao = new EmployeeDao();

        //llamamos con el argumento de producto porque si es nulo, buscará todos
        listEmployees = employeeDao.findAll(employee, null);



        //convertir a JSON
        String json = gson.toJson(listEmployees);
        out.println(json);
        out.close();

    }


    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("application/json;charset=UTF-8");
        resp.setHeader("Access-Control-Allow-Origin", "*");
        resp.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        resp.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
        resp.setHeader("Access-Control-Max-Age", "3600");


    }


}