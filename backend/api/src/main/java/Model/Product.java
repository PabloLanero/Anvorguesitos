package Model;

import java.util.ArrayList;


public class Product {
    //atributos
    private String productTitle, description, imagePath;
    private int idProduct;
    private Double price;
    private Category category;
    private ArrayList<Ingredients> ingredients = new ArrayList<>();

    //Constructors



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
    public ArrayList<Ingredients> getIngredients () {
        return ingredients;
    }
    public void setIngredients (ArrayList<Ingredients> ingredients) {
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
}
