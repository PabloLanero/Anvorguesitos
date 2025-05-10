package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public interface IMotorSql {
    public void connect();

    public boolean execute();  //dml y ddl     --> devuelve un int: numero de filas afectadas

    public boolean execute(PreparedStatement stmt);

    public int execute(String sql);

    public ResultSet executeQuery(String sql);  //select    --> devuelve un ResultSet: objeto con los datos de la consulta

    public void disconnect();  //cierra conexion para liberar recursos

    public Connection getConnection();

    public void setPreparedStatement(PreparedStatement stmt);
}

/*Este código define una interfaz llamada IMotorSql, que actúa como una abstracción para manejar operaciones en una base de datos utilizando JDBC en Java.*/


/**RESULTSET
 * Es un conjunto de resultados generado dinámicamente tras una consulta SQL.
 * Solo existe mientras la consulta está activa y se recorre con rs.next().
 * Se usa en Java para procesar datos desde la base de datos.
 */

/* execute
 * ejecuta consultas Data Definition Languaje --> create table, drop table, alter table
 * y Data Manipultaiton Languaje --> insert, update, delete
 * */


