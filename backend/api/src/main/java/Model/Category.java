package Model;

public class Category {
    private int idCategory;
    private String category;

    //Constructors
    public Category(int idCategory, String category) {
        this.idCategory = idCategory;
        this.category = category;
    }
    public Category() {
    }

    //Getter y Setters
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

    //ToString


    @Override
    public String toString () {
        return "Category{" +
                "\"category\"='" + category + '\'' +
                ", \"idCategory\"=" + idCategory +
                '}';
    }
}