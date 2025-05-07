package Model;

public class Ingredient {
    private int idIngredient;
    private String ingredientName;
    private String allergen;

    //Constructors


    public Ingredient (int idIngredient, String ingredientName, String allergen) {
        this.idIngredient = idIngredient;
        this.ingredientName = ingredientName;
        this.allergen = allergen;
    }

    public Ingredient () {};

    //Getter y Setters
    public int getIdIngredient () {
        return idIngredient;
    }
    public void setIdIngredient (int idIngredient) {
        this.idIngredient = idIngredient;
    }
    public String getIngredientName () {
        return ingredientName;
    }
    public void setIngredientName (String ingredientName) {
        this.ingredientName = ingredientName;
    }
    public String getAllergen () {
        return allergen;
    }
    public void setAllergen (String allergen) {
        this.allergen = allergen;
    }

    //ToString

    @Override
    public String toString () {
        return "Ingredient{" +
                "\"allergen\"='" + allergen + '\'' +
                ", \"idIngredient\"=" + idIngredient +
                ", \"ingredientName\"='" + ingredientName + '\'' +
                '}';
    }
}
