package Model;

import java.util.ArrayList;

//E: Representa el tipo de entidad que se manipulará (Ejemplo: Usuario, Producto)
//I: Representa el tipo de identificador de la entidad (Ejemplo: Integer, String, etc.).


public interface Dao <E,I>{
    public int add(E bean);
    public int delete (Integer e);
    public int update(E bean);
    public ArrayList<E> findAll(E bean);
}
