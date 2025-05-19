package Model.DAO;

import Model.Employee;
import Motorsql.IMotorSql;
import Motorsql.MotorSql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class EmployeeDao implements Dao{

    private final String SQL_FINDALL = "SELECT * FROM EMPLOYEES WHERE 1=1 ";
    private final String SQL_DELETE = "DELETE * FROM EMPLOYEES WHERE ";

    private IMotorSql motorSql;

    // constructor que automaticamente crea motor
    public EmployeeDao(){
        motorSql = new MotorSql();
    }



    ////////////////////////////      METODOS CRUD     ////////////////////////////////////////////

    @Override
    public int add(Object bean, IMotorSql motorSql) {
        return 0;
    }

    @Override
    public int delete(Object bean) {
        return 0;
    }

    @Override
    public int update(Object bean) {
        return 0;
    }

    @Override
    public ArrayList findAll(Object obj, IMotorSql motorSql) {
        //creo arraylist
        ArrayList<Employee> listEmployee = new ArrayList<>();

        //Para la conexion
        boolean bCloseDbConnection = false;

        //sentencia sql
        String sqlSimple = SQL_FINDALL;

        //inicializamos el valor del id a -1 para evitar problemas
        Integer id_employee = -1;
        String correo = "";
        String password = "";

        //casting
        if(obj instanceof Integer){
            id_employee = ((Integer) obj);
        } else if (obj instanceof Employee) {
            id_employee = ((Employee)obj).getIdEmployee();
        }


        try{
            //nos conectamos
            if (motorSql == null) {
                motorSql = new MotorSql();
                motorSql.connect();
                bCloseDbConnection = true;
            }

            //si tiene filtro, lo aplicamos
            if(id_employee > 0){
                sqlSimple+=" AND EMPLOYEES.id_employee = ?";
            }

            if(correo !=null && !correo.isEmpty() ){
                sqlSimple += " AND EMPLOYEES.emailEmployee = ? ";
            }


            if(password !=null && !password.isEmpty()){
                sqlSimple += " AND EMPLOYEES.passwordEmployee = ? ";
            }

            sqlSimple += ";";

            //creamos la snetencia preparada para ejecutar
            PreparedStatement sentenciaPreparada = motorSql.getConnection().prepareStatement(sqlSimple);

            //Vamos a ir añadiendo los valores, en funcion de los valores comprobados, se añadiran en EL MISMO ORDEN
            //Para ello utilizaremos una variable propia que cuente el orden que deben añadirse los valores
            int orden = 1;

            //asignamos le valor al interrogante
            if(id_employee > 0){
                sentenciaPreparada.setInt(orden++,id_employee);
            }

            if(!correo.isEmpty() && correo != null){
                sentenciaPreparada.setString(orden++,correo);
            }

            if(!password.isEmpty() && password != null){
                sentenciaPreparada.setString(orden++,password);
            }

            //realizamos select
            ResultSet rs = sentenciaPreparada.executeQuery();

            //creamos el objeto con el resultset

            while(rs.next()){
                Employee employee = new Employee();

                employee.setIdEmployee(rs.getInt("id_employee"));
                employee.setEmployeeFirstName(rs.getString("employeeFirstName"));
                employee.setEmployeeLastName(rs.getString("employeeLastName"));
                employee.setHiringDate(rs.getString("hiringDate"));
                employee.setEmailEmployee(rs.getString("emailEmployee"));
                employee.setPhoneEmployee(rs.getString("phoneEmployee"));
                employee.setSalary(rs.getDouble("salary"));

                listEmployee.add(employee);
            }


            //creamos objeto con el rs
        }catch (SQLException sqlEx){
            System.out.println(sqlEx.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            if (bCloseDbConnection) {
                motorSql.disconnect();
            }
        }


        return listEmployee;
    }
}








































