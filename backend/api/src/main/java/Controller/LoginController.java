package Controller;

import Controller.Session.Sesion;
import Model.Customer;
import Model.DAO.CustomerDao;
import Model.Employee;
import Model.DAO.EmployeeDao;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "LoginController", urlPatterns = {"/Login"})
public class LoginController extends HttpServlet {

    Gson gson = new Gson();

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("application/json;charset=UTF-8");
        resp.setHeader("Access-Control-Allow-Origin", "*");
        resp.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        resp.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
        resp.setHeader("Access-Control-Max-Age", "3600");

        String name = req.getParameter("name");
        String password = req.getParameter("password");
        PrintWriter out = resp.getWriter();
        if(name.contains("@")){
            //AQUI, LA VARIABLE name ES EL CORREO
            Employee emp = new Employee(name,password);
            EmployeeDao empDao = new EmployeeDao();
            ArrayList<Employee> employeeArrayList = empDao.findAll(emp, null);

            Sesion sesion = new Sesion(employeeArrayList.get(0));
            out.println(gson.toJson(sesion));
        }else{
            Customer customer = new Customer(name,password);
            CustomerDao customerDao = new CustomerDao();

            ArrayList<Customer> customerArrayList = customerDao.findAll(customer, null);
            Sesion sesion = new Sesion(customerArrayList.get(0));


            out.println(gson.toJson(sesion));

        }

    }
}
