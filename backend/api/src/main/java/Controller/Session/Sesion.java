package Controller.Session;


import Model.Customer;
import Model.Employee;

/**
 * json += "{\n" +
 *                         "   \"name\": " + custom.getFirstName() +'\n'+
 *                         "   \"lastName\": "+custom.getLastName()+",\n" +
 *                         "   \"email\": "+custom.getEmailCustomer()+",\n" +
 *                         "   \"mobilePhone\": "+custom.getPhoneCustomer()+",\n" +
 *                         "   \"admin\": false,\n" +
 *                         "   \"id\": "+custom.getIdCustomer()+",\n" +
 *                         "}";
 */

public class Sesion {

    String firstName, lastName, email, mobilePhone;
    int id;
    boolean admin;

    public Sesion (Customer customer){
        setAdmin(false);
        setEmail(customer.getEmailCustomer());
        setFirstName(customer.getFirstName());
        setLastName(customer.getLastName());
        setMobilePhone(customer.getPhoneCustomer());
        setId(customer.getIdCustomer());
    }

    public Sesion (Employee employee){
        setAdmin(true);
        setEmail(employee.getEmailEmployee());
        setFirstName(employee.getEmployeeFirstName());
        setLastName(employee.getEmployeeLastName());
        setMobilePhone(employee.getPhoneEmployee());
        setId(employee.getIdEmployee());
    }

    public Sesion(){};
    //Setter y getters


    public boolean isAdmin () {
        return admin;
    }
    public void setAdmin (boolean admin) {
        this.admin = admin;
    }
    public String getEmail () {
        return email;
    }
    public void setEmail (String email) {
        this.email = email;
    }
    public String getFirstName () {
        return firstName;
    }
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    public int getId () {
        return id;
    }
    public void setId (int id) {
        this.id = id;
    }
    public String getLastName () {
        return lastName;
    }
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    public String getMobilePhone () {
        return mobilePhone;
    }
    public void setMobilePhone (String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    //Metodo ToString


    @Override
    public String toString () {
        return "Sesion{" +
                "admin=" + admin +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", id=" + id +
                '}';
    }
}
