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


@WebServlet(name = "ProductController", urlPatterns = {"/Product"})
public class ProductController extends HttpServlet {


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
        //aplicar filtros si existen
        String parametro = req.getParameter("id_product");

        //creamos un nuevo producto, si existe un filtro,  lo asignaremos
        Product producto = new Product();


        if(parametro!=null && !parametro.isEmpty()){
            producto.setIdProduct(Integer.parseInt(parametro));
        }

        ArrayList<Product> listProducts = new ArrayList<>();
        ProductDao productDao = new ProductDao();

        //llamamos con el argumento de producto porque si es nulo, buscará todos
        listProducts = productDao.findAll(producto,null);



        //convertir a JSON
        String json = gson.toJson(listProducts);
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
        String nombre = req.getParameter("user");
        String nombreUser = req.getParameter("name");


    }









}

/*

@WebServlet("/api/orders")
public class OrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Leer el cuerpo de la solicitud (JSON)
        BufferedReader reader = request.getReader();
        StringBuilder jsonBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            jsonBuilder.append(line);
        }
        String json = jsonBuilder.toString();

        // Convertir JSON a objeto Java usando Gson
        Gson gson = new Gson();
        Order order = gson.fromJson(json, Order.class);

        // Simulación de respuesta
        response.setContentType("application/json");
        response.getWriter().write("{\"message\": \"Orden recibida\", \"userId\": " + order.getUserId() + "}");
    }
}

 */