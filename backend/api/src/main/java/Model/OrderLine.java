package Model;

public class OrderLine {
    private int idOrderLine, cuantity;
    private Product product;

    //Constructors


    //Getter y Setters

    public int getIdOrderLine () {
        return idOrderLine;
    }
    public void setIdOrderLine (int idOrderLine) {
        this.idOrderLine = idOrderLine;
    }
    public int getCuantity () {
        return cuantity;
    }
    public void setCuantity (int cuantity) {
        this.cuantity = cuantity;
    }
    public Product getProduct () {
        return product;
    }
    public void setProduct (Product product) {
        this.product = product;
    }

    //ToString

}
