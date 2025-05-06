package Controller.Actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.*;

import java.util.ArrayList;

public class PeliculaAction implements IAction {
    @Override
    //ACTION=PELICULA.FIND_ALL+Title="La Perseguida hasta el catre"+Duracion="12"
    public String execute(HttpServletRequest request, HttpServletResponse response, String action) {
        String strReturn ="";
        switch (action)
        {
            case "FIND_FIRST":
                //strReturn
                break;
            case "FIND_ALL":
                Product peli = new Product();
                peli.setTitulo("La Perseguida hasta el catre");
                peli.setDuracion(12);
                strReturn = findAll(peli);
                //strReturn = findAll();
                break;
            default:
                strReturn = "ERROR. Invalid Action";
        }
        return strReturn;
    }

    private String findAll(Product peli ) {

        PeliculaDao peliculaDao = new PeliculaDao();
        ArrayList<Product> peliculas = peliculaDao.findAll(peli);
        Product pel = new Product();
        //ArrayList<Pelicula> peliculas = peliculaDao.findAll(null);
       //         ArrayList<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(pel);
        return Product.toArrayJSon(peliculas);
    }
}
