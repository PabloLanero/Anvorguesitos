package Model;

public class Customer {

    private int idCustomer;
    private String firstName, lastName, emailCustomer, phoneCustomer, passwordCustomer;
    private boolean registered;

    //Constructors
    public Customer (int idCustomer, String firstName, String lastName, String emailCustomer, String phoneCustomer, String passwordCustomer, boolean registered) {
        this.idCustomer = idCustomer;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailCustomer = emailCustomer;
        this.phoneCustomer = phoneCustomer;
        this.passwordCustomer = passwordCustomer;
        this.registered = registered;
    }
    public Customer(boolean registered, String passwordCustomer, String phoneCustomer, String emailCustomer, String lastName, String firstName) {
        this.registered = registered;
        this.passwordCustomer = passwordCustomer;
        this.phoneCustomer = phoneCustomer;
        this.emailCustomer = emailCustomer;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Customer(int idCustomer, String firstName){
        this.idCustomer = idCustomer;
        this.firstName = firstName;

    }

    public Customer (String firstName, String passwordCustomer) {
        this.firstName = firstName;
        this.passwordCustomer = passwordCustomer;
    }

    public Customer(){}



    //Setter y getters
    public String getEmailCustomer () {
        return emailCustomer;
    }
    public void setEmailCustomer (String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }
    public String getFirstName () {
        return firstName;
    }
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    public int getIdCustomer () {
        return idCustomer;
    }
    public void setIdCustomer (int idCustomer) {
        this.idCustomer = idCustomer;
    }
    public String getLastName () {
        return lastName;
    }
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    public String getPasswordCustomer () {
        return passwordCustomer;
    }
    public void setPasswordCustomer (String passwordCustomer) {
        this.passwordCustomer = passwordCustomer;
    }
    public String getPhoneCustomer () {
        return phoneCustomer;
    }
    public void setPhoneCustomer (String phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }
    public boolean isRegistered () {
        return registered;
    }
    public void setRegistered (boolean registered) {
        this.registered = registered;
    }

    //ToString
    @Override
    public String toString () {
        return "\"Customer\":{" +
                "\"emailCustomer\":\"" + emailCustomer + '\"' +
                ", \"idCustomer\":\"" + idCustomer + '\"' +
                ", \"firstName\":\"" + firstName + '\"' +
                ", \"lastName\":\"" + lastName + '\"' +
                ", \"phoneCustomer\":\"" + phoneCustomer + '\"' +
                ", \"passwordCustomer\":\"" + passwordCustomer + '\"' +
                ", \"registered\":\"" + registered + '\"' +
                '}';
    }
}
