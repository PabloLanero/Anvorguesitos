package Model;

import java.util.ArrayList;

public class OrderHeader {

    private int idOrderHeader;
    private String orderDate, shippingAddress, orderStatus;
    private boolean accepted;
    private PaymentMethod paymentMethod;
    private Customer customer;
    private Employee employee;
    private ArrayList<OrderLine> orderLine = new ArrayList<OrderLine>();

    //Constructor


    //Getter y Setters
    public boolean isAccepted () {
        return accepted;
    }
    public void setAccepted (boolean accepted) {
        this.accepted = accepted;
    }
    public Customer getCustomer () {
        return customer;
    }
    public void setCustomer (Customer customer) {
        this.customer = customer;
    }
    public Employee getEmployee () {
        return employee;
    }
    public void setEmployee (Employee employee) {
        this.employee = employee;
    }
    public int getIdOrderHeader () {
        return idOrderHeader;
    }
    public void setIdOrderHeader (int idOrderHeader) {
        this.idOrderHeader = idOrderHeader;
    }
    public String getOrderDate () {
        return orderDate;
    }
    public void setOrderDate (String orderDate) {
        this.orderDate = orderDate;
    }
    public ArrayList<OrderLine> getOrderLine () {
        return orderLine;
    }
    public void setOrderLine (ArrayList<OrderLine> orderLine) {
        this.orderLine = orderLine;
    }
    public String getOrderStatus () {
        return orderStatus;
    }
    public void setOrderStatus (String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public PaymentMethod getPaymentMethod () {
        return paymentMethod;
    }
    public void setPaymentMethod (PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public String getShippingAddress () {
        return shippingAddress;
    }
    public void setShippingAddress (String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    //ToString

}
