package Motorsql;



import java.sql.*;

public class MotorSql implements IMotorSql {


    //creamos objetos de los elementos de las importaciones anteriores
    private Connection conn; //conector
    private Statement st;//ejecutar sentencias
    private ResultSet rs; //tabla virtual
    private PreparedStatement preparedStatement;


    // ¿Dónde está la Base de Datos?
    private static final String URL = "jdbc:mysql://hambearguesitos.c10gecgoy05t.us-east-1.rds.amazonaws.com:3306/Hambearguesitos";;
    private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "admin";
    private static final String PASS = "Anvorguesitos1234.";


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
    public boolean execute () {
        boolean bRet = false;
        if(preparedStatement !=null){
            try {
                 bRet = preparedStatement.execute();
            }catch (SQLException ex){

                bRet= false;
            }
        }
        return bRet;
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
            rs = null;
        }
        return rs;
    }


    @Override
    public void disconnect () {
        try{
            if(rs != null && !rs.isClosed()){
                rs.close();
            }

            if(st != null && !st.isClosed()){
                st.close();
            }

            if(conn != null && conn.isClosed()){
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Connection getConnection(){
        return conn;
    }

    @Override
    public void setPreparedStatement(PreparedStatement stmt){
        preparedStatement = stmt;
    }

    @Override
    public boolean execute(PreparedStatement stmt){
        setPreparedStatement(stmt);
        return execute();
    }

}
