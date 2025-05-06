package Model;

import java.sql.Connection; //→ Conectarse a la base de datos.
import java.sql.DriverManager;  //-> que se encarga de gestionar los controladores JDBC (Java Database Connectivity) y establecer conexiones con bases de datos.
import java.sql.ResultSet; //→ Obtener los resultados de una consulta SQL.
import java.sql.SQLException;
import java.sql.Statement;//→ Ejecutar sentencias SQL.



public class MotorSql implements IMotorSql {


    //creamos objetos de los elementos de las importaciones anteriores
    private Connection conn; //conector
    private Statement st;//ejecutar sentencias
    private ResultSet rs; //tabla virtual


    // ¿Dónde está la Base de Datos?
    private static final String URL = "jdbc:derby://localhost:1527/api";
    private static final String CONTROLADOR = "org.apache.derby.jdbc.ClientDriver";
    private static final String USER = "Anvorguesitos1234@";
    private static final String PASS = "Anvorguesitos1234@";


    //metodos a implementar
    @Override
    public void connect() {
        try {
            Class.forName(CONTROLADOR);
            //En JDBC, cada base de datos necesita un driver específico que actúa como un puente entre Java y la base de datos.
            //carga dinámicamente el controlador JDBC necesario para conectarse.

            conn = DriverManager.getConnection(URL, USER, PASS);  //elemento de conexion que crea una conexión con bbdd

            st = conn.createStatement();

        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override

    // Consultas DDL - Data Definition Language    // Consultas DML - Data Manipulation Language
    public int execute(String sql) {
        int resp = 0;
        try {
            resp = st.executeUpdate(sql);   //executeUpdate(sql) es un método de Statement (st) que ejecuta consultas dml y ddl
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return resp;
    }

    @Override
    public ResultSet executeQuery(String sql) {   //para selects
        try {
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }


    @Override
    public void disconnect() {
        try {
            if (rs != null) {    //ResultSet almacena los resultados de una consulta SELECT. Si no se cierra correctamente, puede generar fugas de memoria.
                rs.close();
            }
            if (st != null) {   //lib recursos
                st.close();
            }
            if (conn != null) {   //lib recursos
                conn.close();
            }
        } catch (SQLException ex) {
        }
    }
}
