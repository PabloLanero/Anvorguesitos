package Model;

public class Ingredients {
    private int idIngredient;
    private String ingredientName;
    private String allergen;

    //Constructors


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

}
