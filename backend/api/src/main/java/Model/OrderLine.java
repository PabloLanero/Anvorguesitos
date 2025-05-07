package Model;

public class OrderLine {
    private int idOrderLine, cuantity;
    private Product product;

    //Constructors
    public OrderLine (int idOrderLine, Product product, int cuantity) {
        this.idOrderLine = idOrderLine;
        this.product = product;
        this.cuantity = cuantity;
    }

    public OrderLine () {
    }
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

    @Override
    public String toString () {
        return "OrderLine{" +
                "\"cuantity\"=" + cuantity +
                ", \"idOrderLine\"=" + idOrderLine +
                ", \"product\"=" + product +
                '}';
    }
}
