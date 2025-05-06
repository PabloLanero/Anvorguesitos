package Model;

public class Category {
    private int idCategory;
    private String category;

    public Category(int idCategory, String category) {
        this.idCategory = idCategory;
        this.category = category;
    }

    public Category() {
    }

    public int getidCategory() {
        return idCategory;
    }

    public void setidCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getcategory() {
        return category;
    }

    public void setcategory(String category) {
        this.category = category;
    }


}