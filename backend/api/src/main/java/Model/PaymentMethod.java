package Model;

public class PaymentMethod {

    private int idPaymentMethod;
    private String paymentMethod;

    //Constructors
    public PaymentMethod (int idPaymentMethod, String paymentMethod) {
        this.idPaymentMethod = idPaymentMethod;
        this.paymentMethod = paymentMethod;
    }

    public PaymentMethod (){}

    //Getter y Setters
    public int getIdPaymentMethod () {
        return idPaymentMethod;
    }
    public void setIdPaymentMethod (int idPaymentMethod) {
        this.idPaymentMethod = idPaymentMethod;
    }
    public String getPaymentMethod () {
        return paymentMethod;
    }
    public void setPaymentMethod (String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    //ToString

    @Override
    public String toString () {
        return "\"PaymentMethod\":{" +
                "\"idPaymentMethod\":\"" + idPaymentMethod + '\"'+
                ", \"paymentMethod\":\"" + paymentMethod + '\"' +
                '}';
    }
}
