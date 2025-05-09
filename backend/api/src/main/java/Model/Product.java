package Model;

import java.util.ArrayList;


public class Product {
    //atributos
    private String productTitle, description, imagePath;
    private int idProduct;
    private Double price;
    private Category category;
    private ArrayList<Ingredient> ingredients = new ArrayList<>();

    //Constructors
    public Product (int idProduct, String productTitle, String description, Category category, ArrayList<Ingredient> ingredients, String imagePath, Double price) {
        this.idProduct = idProduct;
        this.productTitle = productTitle;
        this.description = description;
        this.category = category;
        this.ingredients = ingredients;
        this.imagePath = imagePath;
        this.price = price;
    }
    public Product (){}

    public Product(String productTitle, String description, String imagePath, Double price, Category category, ArrayList<Ingredient> ingredients) {
        this.productTitle = productTitle;
        this.description = description;
        this.imagePath = imagePath;
        this.price = price;
        this.category = category;
        this.ingredients = ingredients;
    }

    //getters y setters
    public Category getCategory () {
        return category;
    }
    public void setCategory (Category category) {
        this.category = category;
    }
    public String getDescription () {
        return description;
    }
    public void setDescription (String description) {
        this.description = description;
    }
    public int getIdProduct () {
        return idProduct;
    }
    public void setIdProduct (int idProduct) {
        this.idProduct = idProduct;
    }
    public String getImagePath () {
        return imagePath;
    }
    public void setImagePath (String imagePath) {
        this.imagePath = imagePath;
    }
    public ArrayList<Ingredient> getIngredients () {
        return ingredients;
    }
    public void setIngredients (ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
    public Double getPrice () {
        return price;
    }
    public void setPrice (Double price) {
        this.price = price;
    }
    public String getProductTitle () {
        return productTitle;
    }
    public void setProductTitle (String productTitle) {
        this.productTitle = productTitle;
    }

    //ToString

    @Override
    public String toString () {
        return "\"Product\"={" +
                "\"category\"=" + category +
                ", \"productTitle\"='" + productTitle + '\'' +
                ", \"description\"='" + description + '\'' +
                ", \"imagePath\"='" + imagePath + '\'' +
                ", \"idProduct\"=" + idProduct +
                ", \"price\"=" + price +
                ", \"ingredients\"=" + ingredients +
                '}';
    }
}
