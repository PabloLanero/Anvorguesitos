package Model;

public class OrderLine {
    private int idOrderLine, cuantity;
    private Product product;
    private OrderHeader orderHeader;

    //Constructors
    public OrderLine (int idOrderLine, int cuantity, Product product, OrderHeader orderHeader) {
        this.idOrderLine = idOrderLine;
        this.cuantity = cuantity;
        this.product = product;
        this.orderHeader = orderHeader;
    }

    public OrderLine(OrderHeader orderHeader, int cuantity, Product product) {
        this.orderHeader = orderHeader;
        this.cuantity = cuantity;
        this.product = product;
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
    public OrderHeader getOrderHeader () {
        return orderHeader;
    }
    public void setOrderHeader (OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }

    //ToString
    @Override
    public String toString () {
        return "\"OrderLine\":{" +
                "\"cuantity\":" + cuantity +
                ", \"idOrderLine\":" + idOrderLine +
                ", \"product\":" + product +
                ", \"orderHeader\":" + orderHeader +
                '}';
    }
}
