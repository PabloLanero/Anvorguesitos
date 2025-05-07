package Model;

public class Employee {
    private int idEmployee;
    private String employeeFirstName, employeeLastName, hiringDate, emailEmployee, phoneEmployee,passwordEmployee;
    private double salary;
    private Job job;
    private Store store;

    //Constructor


    public Employee (int idEmployee, String employeeFirstName, String employeeLastName, String emailEmployee, String phoneEmployee, Store store, Job job, String hiringDate, double salary, String passwordEmployee) {
        this.idEmployee = idEmployee;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.emailEmployee = emailEmployee;
        this.phoneEmployee = phoneEmployee;
        this.store = store;
        this.job = job;
        this.hiringDate = hiringDate;
        this.salary = salary;
        this.passwordEmployee = passwordEmployee;
    }

    public Employee () {}

    //Getter y Setters
    public String getEmailEmployee () {
        return emailEmployee;
    }
    public void setEmailEmployee (String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }
    public String getEmployeeFirstName () {
        return employeeFirstName;
    }
    public void setEmployeeFirstName (String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }
    public String getEmployeeLastName () {
        return employeeLastName;
    }
    public void setEmployeeLastName (String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }
    public String getHiringDate () {
        return hiringDate;
    }
    public void setHiringDate (String hiringDate) {
        this.hiringDate = hiringDate;
    }
    public int getIdEmployee () {
        return idEmployee;
    }
    public void setIdEmployee (int idEmployee) {
        this.idEmployee = idEmployee;
    }
    public Job getJob () {
        return job;
    }
    public void setJob (Job job) {
        this.job = job;
    }
    public String getPasswordEmployee () {
        return passwordEmployee;
    }
    public void setPasswordEmployee (String passwordEmployee) {
        this.passwordEmployee = passwordEmployee;
    }
    public String getPhoneEmployee () {
        return phoneEmployee;
    }
    public void setPhoneEmployee (String phoneEmployee) {
        this.phoneEmployee = phoneEmployee;
    }
    public double getSalary () {
        return salary;
    }
    public void setSalary (double salary) {
        this.salary = salary;
    }
    public Store getStore () {
        return store;
    }
    public void setStore (Store store) {
        this.store = store;
    }

    //ToString

    @Override
    public String toString () {
        return "Employee{" +
                "\"emailEmployee\"='" + emailEmployee + '\'' +
                ", \"idEmployee\"=" + idEmployee +
                ", \"employeeFirstName\"='" + employeeFirstName + '\'' +
                ", \"employeeLastName\"='" + employeeLastName + '\'' +
                ", \"hiringDate\"='" + hiringDate + '\'' +
                ", \"phoneEmployee\"='" + phoneEmployee + '\'' +
                ", \"passwordEmployee\"='" + passwordEmployee + '\'' +
                ", \"salary\"=" + salary +
                ", \"job\"=" + job +
                ", \"store\"=" + store +
                '}';
    }
}
