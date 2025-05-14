package Model.DAO;

import java.util.ArrayList;

//E: Representa el tipo de entidad que se manipulará (Ejemplo: Usuario, Producto)
//I: Representa el tipo de identificador de la entidad (Ejemplo: Integer, String, etc.).


public interface Dao <E,I>{


    public int add(E obj);
    public int delete (I e);
    public int update(E obj);
    public ArrayList<E> findAll(E obj, IMotorSql motorSql);
}
