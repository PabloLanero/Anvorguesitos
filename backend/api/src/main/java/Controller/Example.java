package Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Example", urlPatterns = {"/Ejemplo"})
public class Example extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("application/json;charset=UTF-8");
        resp.setHeader("Access-Control-Allow-Origin", "*");
        resp.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        resp.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
        resp.setHeader("Access-Control-Max-Age", "3600");

        PrintWriter out = resp.getWriter();
        out.print("{\"results\":[\n" +
                "{\n" +
                "\"id_product\": 1 , \n" +
                "\"productTitle\": \"Queen of the Pyrenees\",\n" +
                "\"description\": \"The majesty of the Pyrenees in every bite. Tender and juicy Ternasco de Aragón lamb, accompanied by creamy Tronchón cheese, roasted Tudela asparagus, and a unique truffle sauce that adds a sophisticated touch. All served on rustic handmade bread that enhances the local flavors. A tribute to the heart of the Aragonese Pyrenees.\",\n" +
                "\"price\": 16.50,\n" +
                "\"id_productCategory\": 1,\n" +
                "\"image\": \"../Images/products/burgers/1_hamburguesa---queen-of-the-pyrenees----the-majesty.png\"\n" +
                "\n" +
                "},\n" +
                "{\n" +
                "\"id_product\": 2,\n" +
                "\"productTitle\": \"Under the Skies of Belchite\",\n" +
                "\"description\": \"Inspired by the lands of Belchite, this burger brings together the best of the garden and tradition. Jiloca beef with a hint of Belchite honey and Fraga mustard creates the perfect balance of sweet and tangy. Served with caramelized onions, local Raf tomatoes, and spelt bread. An explosion of flavors that takes you straight to Belchite.\",\n" +
                "\"price\": 14.50,\n" +
                "\"id_productCategory\": 1,\n" +
                "\"image\": \"../Images/products/burgers/2_hamburguesa----under-the-shadow-of-the-muela----th.png\"\n" +
                "},\n" +
                "{\n" +
                "\"id_product\": 3,\n" +
                "\"productTitle\": \"The Shadow of Moncayo\",\n" +
                "\"description\": \"The shadow cast by Moncayo inspires this burger, combining the best of the mountains with the freshness of the garden. Juicy Aragonese chicken breast, accompanied by Moncayo fresh cheese, Tudela asparagus, and a refreshing Aragonese yogurt sauce. All served on seed bread, perfectly balancing the flavors.\",\n" +
                "\"price\": 15.00,\n" +
                "\"id_productCategory\": 1,\n" +
                "\"image\": \"../Images/products/burgers/3_hamburguesa----the-shadow-of-moncayo----the-shadow.png\"\n" +
                "},\n" +
                "            {\n" +
                "                \"id_product\": 4,\n" +
                "                \"productTitle\": \"Ebro River\",\n" +
                "                \"description\": \"A tribute to the majestic Ebro River. Ebro River trout with a smoky touch, accompanied by roasted Piquillo peppers and a drizzle of extra virgin olive oil. The smoothness of Manchego cheese and the freshness of field lettuce make this burger a unique experience, all on rye bread.\",\n" +
                "                \"price\": 17.00,\n" +
                "                \"id_productCategory\": 1,\n" +
                "                \"image\": \"https://cdn-icons-png.flaticon.com/512/73/73775.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id_product\": 5,\n" +
                "                \"productTitle\": \"Land of Biescas\",\n" +
                "                \"description\": \"In honor of the lands of Biescas, this burger combines the intensity of Albarracín lamb with the creamy touch of Manchego cheese and the richness of sun-dried tomatoes. A rosemary sauce and rustic village bread complete this mountain-inspired recipe. The flavor of the highlands in every bite.\",\n" +
                "                \"price\": 18.00,\n" +
                "                \"id_productCategory\": 1,\n" +
                "                \"image\": \"https://cdn-icons-png.flaticon.com/512/73/73775.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id_product\": 6,\n" +
                "                \"productTitle\": \"The Hoya of Huesca\",\n" +
                "                \"description\": \"Inspired by the fertile Hoya of Huesca, this burger features Barbastro beef paired with Piquillo peppers and a mild sweet mustard sauce. Combined with Moncayo fresh cheese and a touch of caramelized onions on rustic bread, this is a blend of traditional flavors with a modern twist.\",\n" +
                "                \"price\": 14.00,\n" +
                "                \"id_productCategory\": 1,\n" +
                "                \"image\": \"https://cdn-icons-png.flaticon.com/512/73/73775.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id_product\": 7,\n" +
                "                \"productTitle\": \"Fields of Jiloca\",\n" +
                "                \"description\": \"Known for its authentic flavors, the fields of Jiloca are reflected in this burger. Jiloca beef accompanied by Tronchón cheese, sun-dried tomatoes, and a fresh mix of spinach leaves, all topped with Belchite honey sauce and served on spelt bread. A tribute to Aragonese land.\",\n" +
                "                \"price\": 13.50,\n" +
                "                \"id_productCategory\": 1,\n" +
                "                \"image\": \"https://cdn-icons-png.flaticon.com/512/73/73775.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id_product\": 8,\n" +
                "                \"productTitle\": \"Dawn of the Maestre\",\n" +
                "                \"description\": \"A dawn in the Maestre lands is reflected in this burger full of freshness and contrast. Local pork with Moncayo fresh cheese, Piquillo peppers, and a touch of Belchite honey and sweet mustard create a perfectly balanced and delicious flavor. Served on rye bread for a gourmet experience.\",\n" +
                "                \"price\": 16.00,\n" +
                "                \"id_productCategory\": 1,\n" +
                "                \"image\": \"https://cdn-icons-png.flaticon.com/512/73/73775.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id_product\": 9,\n" +
                "                \"productTitle\": \"The Matarraña Lamb\",\n" +
                "                \"description\": \"The richness of Matarraña is found in this burger made with Ternasco de Aragón lamb, accompanied by Manchego cheese, caramelized onions, and a hint of Fraga mustard sauce. The seed bread and arugula leaves complement the blend of flavors, creating a unique taste of the land.\",\n" +
                "                \"price\": 17.50,\n" +
                "                \"id_productCategory\": 1,\n" +
                "                \"image\": \"https://cdn-icons-png.flaticon.com/512/73/73775.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id_product\": 10,\n" +
                "                \"productTitle\": \"Wind of Teruel\",\n" +
                "                \"description\": \"The wind of Teruel brings the strength of tradition. This burger combines wild boar meat from the Sierra de Guara, with Manchego cheese, sun-dried tomatoes, and a touch of sweet mustard sauce. All served on rustic bread, evoking the wild flavors of Teruel in every bite.\",\n" +
                "                \"price\": 14.50,\n" +
                "                \"id_productCategory\": 1,\n" +
                "                \"image\": \"https://cdn-icons-png.flaticon.com/512/73/73775.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id_product\": 11,\n" +
                "                \"productTitle\": \"Essence of the Gállego\",\n" +
                "                \"description\": \"The essence of the Gállego land is found in this burger of Gállego goat meat, paired with Manchego cheese, Raf tomatoes, and a mild rosemary sauce. Served on rustic bread, this is a taste of authenticity from the region.\",\n" +
                "                \"price\": 15.00,\n" +
                "                \"id_productCategory\": 1,\n" +
                "                \"image\": \"https://cdn-icons-png.flaticon.com/512/73/73775.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id_product\": 12,\n" +
                "                \"productTitle\": \"Under the Shadow of the Muela\",\n" +
                "                \"description\": \"The Muela inspires this burger made with rabbit meat from La Muela, a touch of apple compote, and sweet mustard sauce. Served with spinach leaves, Raf tomatoes, and a drizzle of extra virgin olive oil, all on rye bread. A delicate and flavorful mix that takes you to the calm of the lands under the shadow of the Muela.\",\n" +
                "                \"price\": 13.00,\n" +
                "                \"id_productCategory\": 1,\n" +
                "                \"image\": \"https://cdn-icons-png.flaticon.com/512/73/73775.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id_product\": 13,\n" +
                "                \"productTitle\": \"The Green Alfranca\",\n" +
                "                \"description\": \"The freshness of the Alfranca fields is reflected in this burger. Beef paired with Moncayo fresh cheese, arugula sprouts, and a touch of extra virgin olive oil on seed bread. A combination of fresh and tasty ingredients for a light yet delicious experience.\",\n" +
                "                \"price\": 14.00,\n" +
                "                \"id_productCategory\": 1,\n" +
                "                \"image\": \"https://cdn-icons-png.flaticon.com/512/73/73775.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id_product\": 14,\n" +
                "                \"productTitle\": \"Skies of the Sierra de Guara\",\n" +
                "                \"description\": \"The majesty of the skies of the Sierra de Guara is reflected in this burger made with wild boar meat, Tronchón cheese, Piquillo peppers, and a mild rosemary sauce. Served on rustic bread, this burger offers robust and authentic mountain flavors.\",\n" +
                "                \"price\": 18.00,\n" +
                "                \"id_productCategory\": 1,\n" +
                "                \"image\": \"https://cdn-icons-png.flaticon.com/512/73/73775.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id_product\": 15,\n" +
                "                \"productTitle\": \"Barbastro Estate\",\n" +
                "                \"description\": \"A journey to the Barbastro Estate with this burger made from local Barbastro beef, Manchego cheese, sun-dried tomatoes, and a hint of Belchite honey. The perfect combination of local flavors on rye bread, ideal for savoring the best of the land.\",\n" +
                "                \"price\": 15.50,\n" +
                "                \"id_productCategory\": 1,\n" +
                "                \"image\": \"https://cdn-icons-png.flaticon.com/512/73/73775.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id_product\": 16,\n" +
                "                \"productTitle\": \"Gourmet French Fries\",\n" +
                "                \"description\": \"Crispy, golden fries cooked to perfection, drizzled with extra virgin olive oil and fresh rosemary. The ideal side for any burger.\",\n" +
                "                \"price\": 4.00,\n" +
                "                \"id_productCategory\": 2,\n" +
                "                \"image\": \"https://cdn-icons-png.flaticon.com/512/73/73775.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id_product\": 17,\n" +
                "                \"productTitle\": \"Crispy Onion Rings\",\n" +
                "                \"description\": \"Golden, battered onion rings, seasoned with local spices, crispy on the outside and tender on the inside.\",\n" +
                "                \"price\": 5.00,\n" +
                "                \"id_productCategory\": 2,\n" +
                "                \"image\": \"https://cdn-icons-png.flaticon.com/512/73/73775.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id_product\": 18,\n" +
                "                \"productTitle\": \"Fresh Salad\",\n" +
                "                \"description\": \"A fresh mix of lettuce, arugula, Raf tomatoes, and caramelized onions, dressed with extra virgin olive oil and balsamic vinegar.\",\n" +
                "                \"price\": 5.00,\n" +
                "                \"id_productCategory\": 2,\n" +
                "                \"image\": \"https://cdn-icons-png.flaticon.com/512/73/73775.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id_product\": 19,\n" +
                "                \"productTitle\": \"Water\",\n" +
                "                \"description\": \"A refreshing bottle of water to accompany your meal.\",\n" +
                "                \"price\": 2.00,\n" +
                "                \"id_productCategory\": 3,\n" +
                "                \"image\": \"https://cdn-icons-png.flaticon.com/512/73/73775.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id_product\": 20,\n" +
                "                \"productTitle\": \"Cola Soda\",\n" +
                "                \"description\": \"A classic Coca-Cola, sweet and refreshing.\",\n" +
                "                \"price\": 1.50,\n" +
                "                \"id_productCategory\": 3,\n" +
                "                \"image\": \"https://cdn-icons-png.flaticon.com/512/73/73775.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id_product\": 21,\n" +
                "                \"productTitle\": \"Lemon Soda\",\n" +
                "                \"description\": \"A refreshing orange soda with a sweet and tangy taste.\",\n" +
                "                \"price\": 1.50,\n" +
                "                \"id_productCategory\": 3,\n" +
                "                \"image\": \"https://cdn-icons-png.flaticon.com/512/73/73775.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id_product\": 22,\n" +
                "                \"productTitle\": \"Orange Soda\",\n" +
                "                \"description\": \"A refreshing lemon soda, perfect for a hot day.\",\n" +
                "                \"price\": 1.50,\n" +
                "                \"id_productCategory\": 3,\n" +
                "                \"image\": \"https://cdn-icons-png.flaticon.com/512/73/73775.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id_product\": 23,\n" +
                "                \"productTitle\": \"Cariñena Red Wine\",\n" +
                "                \"description\": \"A smooth red wine from the Cariñena region, perfect for pairing with any meal.\",\n" +
                "                \"price\": 6.00,\n" +
                "                \"id_productCategory\": 3,\n" +
                "                \"image\": \"https://cdn-icons-png.flaticon.com/512/73/73775.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id_product\": 24,\n" +
                "                \"productTitle\": \"Somontano White Wine\",\n" +
                "                \"description\": \"A crisp and aromatic white wine from the Somontano region, ideal for seafood or chicken dishes.\",\n" +
                "                \"price\": 6.00,\n" +
                "                \"id_productCategory\": 3,\n" +
                "                \"image\": \"https://cdn-icons-png.flaticon.com/512/73/73775.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id_product\": 25,\n" +
                "                \"productTitle\": \"Beer\",\n" +
                "                \"description\": \"A refreshing local beer from the Ambar brewery.\",\n" +
                "                \"price\": 2.00,\n" +
                "                \"id_productCategory\": 3,\n" +
                "                \"image\": \"https://cdn-icons-png.flaticon.com/512/73/73775.png\"\n" +
                "            }\n" +
                "        ]}");
        System.out.println("Entro aqui");
    }
}
