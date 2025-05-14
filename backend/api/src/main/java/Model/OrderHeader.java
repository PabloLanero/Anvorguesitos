package Model;

import java.util.ArrayList;

public class OrderHeader {
    //enum
    enum PaymentMethod{CREDITCARD, CASH};

    private int idOrderHeader;
    private String orderDate, shippingAddress, orderStatus;
    private boolean accepted;
    private PaymentMethod paymentMethod;
    private Customer customer;
    private Employee employee;
    private ArrayList<OrderLine> listOrderLine = new ArrayList<OrderLine>();

    //Constructor
    public OrderHeader (int idOrderHeader, String shippingAddress, String orderStatus, Customer customer, Employee employee, ArrayList<OrderLine> listOrderLine, PaymentMethod paymentMethod, String orderDate, boolean accepted) {
        this.idOrderHeader = idOrderHeader;
        this.shippingAddress = shippingAddress;
        this.orderStatus = orderStatus;
        this.customer = customer;
        this.employee = employee;
        this.listOrderLine = listOrderLine;
        this.paymentMethod = paymentMethod;
        this.orderDate = orderDate;
        this.accepted = accepted;
    }

    public OrderHeader (int idOrderHeader, String shippingAddress, String orderStatus, Customer customer, Employee employee, PaymentMethod paymentMethod, String orderDate, boolean accepted) {
        this.idOrderHeader = idOrderHeader;
        this.shippingAddress = shippingAddress;
        this.orderStatus = orderStatus;
        this.customer = customer;
        this.employee = employee;
        this.paymentMethod = paymentMethod;
        this.orderDate = orderDate;
        this.accepted = accepted;
    }
    public OrderHeader(ArrayList<OrderLine> listOrderLine, Employee employee, Customer customer, PaymentMethod paymentMethod, boolean accepted, String orderStatus, String shippingAddress, String orderDate) {
        this.listOrderLine = listOrderLine;
        this.employee = employee;
        this.customer = customer;
        this.paymentMethod = paymentMethod;
        this.accepted = accepted;
        this.orderStatus = orderStatus;
        this.shippingAddress = shippingAddress;
        this.orderDate = orderDate;
    }

    public OrderHeader(int id){
        setIdOrderHeader(id);
    }

    public OrderHeader () {
    }



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
    public ArrayList<OrderLine> getListOrderLine () {
        return listOrderLine;
    }
    public void setListOrderLine (ArrayList<OrderLine> listOrderLine) {
        this.listOrderLine = listOrderLine;
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
    public void setPaymentMethod (int paymentMethod) {
        switch (paymentMethod){
            case 1:
                this.paymentMethod = PaymentMethod.CREDITCARD;
                break;
            case 2:
                this.paymentMethod = PaymentMethod.CASH;
                break;
        }

    }
    public String getShippingAddress () {
        return shippingAddress;
    }
    public void setShippingAddress (String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    //ToString

    @Override
    public String toString () {
        return "\"OrderHeader\":{" +
                "\"accepted\":" + accepted +
                ", \"idOrderHeader\":" + idOrderHeader +
                ", \"orderDate\": \"" + orderDate + '\"' +
                ", \"shippingAddress\":\"" + shippingAddress + '\"' +
                ", \"orderStatus\":\"" + orderStatus + '\"' +
                ", \"paymentMethod\":\"" + paymentMethod + '\"' +
                ", \"customer\":{" + customer +
                ", \"employee\":{" + employee + 
                ", \"orderLine\":\"" + listOrderLine +"\""+
                '}';
    }
}
