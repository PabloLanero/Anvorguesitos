//localización
package Controller.Actions;

//imports
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.*;
import java.util.ArrayList;


//definición
public class CategoryAction implements IAction{
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response, String action) {

        String strReturn = "";

        switch (action) {
            case "FIND_ALL":
                strReturn = findAll(request, response);
                break;
        }
        return strReturn;
    }

    private String findAll(HttpServletRequest request, HttpServletResponse response){

        //CategoryDao peliculaDao = new CategoryDao();
        //ArrayList<Category> Categories = CategoryDao.findAll(null);
        return null; //Category.toArrayJson(Categories);
    }






}
