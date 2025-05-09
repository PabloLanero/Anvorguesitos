package Controller;

import Controller.Actions.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;


import javax.servlet.annotation.WebServlet;
//es una importación en Java que permite utilizar la anotación @WebServlet.
//Registra un servlet de manera automática.
// Especifica la URL en la que el servlet responderá.
//Simplifica la configuración de servlets en aplicaciones Java EE o Jakarta EE.

@WebServlet(name = "Controller", urlPatterns = {"/Controller"})   //quiere decir que responde a http://localhost:8080/Controller
public class Controller extends HttpServlet {

    protected void processRequest (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { //processrequest maneja las solicitudes  get y post para evitar duplicar codigo
        response.setContentType("text/plain;charset=UTF-8"); //Define el tipo de contenido que se enviará al usuario
        PrintWriter out = response.getWriter();

        String action = request.getParameter("ACTION");   //Extrae el valor de ACTION desde la solicitud HTTP.ej "PELICULA.FIND_ALL."
        String[] arrayAction = new String[2]; //crea un array de dos posiciones para dividir el action entre el sujeto y la accion  [pelicula, find_all]
        if (action != "") {
            arrayAction = action.split("\\."); //[0] PELICULA <-> [1] FIND_ALL  //parte por los puntos
        }
        switch (arrayAction[0].toUpperCase()) {
            case "PRODUCTO": {
                //out.print(new ProductAction().execute(request, response, arrayAction[1]));
                break;
            }
            default: {
                System.out.println(action);
                throw new ServletException(action + " not valid action");
            }
        }

        System.out.println(action);
    }
}