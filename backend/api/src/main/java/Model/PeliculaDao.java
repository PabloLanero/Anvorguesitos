package Model;

import java.lang.invoke.MethodHandles;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PeliculaDao implements IDao {
    private final String SQL_FIND_ALL = "SELECT * FROM PELICULAS WHERE 1=1 ";

    @Override
    public int add(Object bean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int delete(Integer e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int update(Object bean) {


        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    /*public ArrayList<Pelicula> findAll(Object bean) {
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        MotorSQL motor = new MotorSQL();
        try {
            motor.connect();
            String sql = SQL_FIND_ALL;
            if (bean != null) {
                if (((Pelicula)bean).getId() != 0) {
                    sql += " AND ID_PELICULA='" + ((Pelicula)bean).getId() + "'";
                }
                if (((Pelicula)bean).getTitulo() != null) {
                    sql += " AND TITULO='" + ((Pelicula)bean).getTitulo() + "'";
                }
                if (((Pelicula)bean).getPrecio() > 0) {
                    sql += " AND PRECIO=" + ((Pelicula)bean).getPrecio() + "";
                }
                if (((Pelicula)bean).getTrailer() != null) {
                    sql += " AND TRAILER='" + ((Pelicula)bean).getTrailer() + "'";
                }
                if (((Pelicula)bean).getSinopsis() != null) {
                    sql += " AND SINOPSIS LIKE('%" + ((Pelicula)bean).getSinopsis() + "%')";
                }
                if (((Pelicula)bean).getnVotos() != 0) {
                    sql += " AND N_VOTOS='" + ((Pelicula)bean).getnVotos() + "'";
                }
                if (((Pelicula)bean).getsPuntuacion() != 0) {
                    sql += " AND S_PUNTUACION='" + ((Pelicula)bean).getsPuntuacion() + "'";
                }
                if (((Pelicula)bean).getFechaEstreno() != null) {
                    sql += " AND FECHA_ESTRENO='" + ((Pelicula)bean).getFechaEstreno() + "'";
                }
                if (((Pelicula)bean).getUrl()!= null) {
                    sql += " AND URL='" + ((Pelicula)bean).getUrl() + "'";
                }
            }
            ResultSet rs = motor.executeQuery(sql);

            while (rs.next())
            {
                Pelicula pelicula = new Pelicula();
                pelicula.setId(rs.getInt("Id"));
                pelicula.setTitulo(rs.getString("Titulo"));
                pelicula.setPrecio(rs.getDouble("Precio"));
                pelicula.setTrailer(rs.getString("Trailer"));
                pelicula.setSinopsis(rs.getString("Sinopsis"));
                pelicula.setnVotos(rs.getInt("Votos"));
                pelicula.setsPuntuacion(rs.getInt("Puntuacion"));
                pelicula.setFechaEstreno(rs.getString("FechaEstreno"));
                pelicula.setUrl(rs.getString("Url"));
                Genero genero = new Genero();
                genero.setIdGenero(rs.getInt("IdGenero"));
                pelicula.setGenero(genero);

                peliculas.add(pelicula);
            }

        }catch (Exception ex)
        {
            peliculas.clear();
        }
        finally {
            motor.disconnect();
        }
        return peliculas;
    }*/
    public ArrayList<Pelicula> findAll(Object bean)
    {
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(new Pelicula("Titanic", 5.99, 295, "https://www.youtube.com/watch?v=jnFxtSuZRpU", "Una joven (Kate Winslet) de sociedad abandona a su arrogante pretendiente (Billy Zane) por un artista (Leonardo DiCaprio) humilde en el transatlántico que se hundió durante su viaje inaugural.", 200, 900, "1997", "titanic"));
        peliculas.add(new Pelicula("Mision imposible: Fallout", 0.99, 148, "https://www.youtube.com/embed/vDX_r9MH5Z0", "Un traficante de armas y un grupo de terroristas pretenden realizar un triple ataque nuclear con tres artefactos de plutonio, los cuales se pierden. Ethan Hunt y su equipo tendrán que recuperarlos antes de que caigan en las manos equivocadas.", 100, 300, "2018", "mision_imposible"));
        peliculas.add(new Pelicula("Interstellar", 9.99, 169, "https://www.youtube.com/watch?v=NqniWGlg5kU", "Un grupo de exploradores hacen uso de un orificio recién descubierto para superar las limitaciones de los viajes espaciales humanos y conquistar las vastas distancias relacionadas con los viajes interestelares.", 500, 2200, "2014", "interstellar"));
        peliculas.add(new Pelicula("El Padrino", 7.99, 178, "https://www.youtube.com/watch?v=gCVj1LeYnsc", "Una adaptación ganadora del Premio de la Academia, de la novela de Mario Puzo acerca de la familia Corleone.", 500, 2400, "1972", "padrino"));
        peliculas.add(new Pelicula("La forma del agua", 3.99, 183, "https://www.youtube.com/watch?v=FMNTFFhR__g", "Elisa es una joven muda que se enamora de un hombre anfibio que está recluido en un acuario en un laboratorio secreto, propiedad del Gobierno, en el que ella trabaja limpiando. Llevada por el amor, Elisa trama un plan para liberar al mutante.", 100, 400, "2017", "agua"));
        peliculas.add(new Pelicula("Tres anuncios en las afueras", 4.99, 175, "https://www.youtube.com/watch?v=uLr4jog9EX8", "Una mujer cuya hija fue asesinada se enfrenta a la policía usando los carteles publicitarios para denunciar que han pasado meses desde que se cometió el crimen y no solo no han resuelto nada, sino que parecen no tener interés en hacerlo.", 50, 165, "2017", "anuncios"));
        peliculas.add(new Pelicula("It", 7.99, 195, "https://www.youtube.com/watch?v=xKJmEC5ieOk", "Varios niños de una pequeña ciudad del estado de Maine se alían para combatir a una entidad diabólica que adopta la forma de un payaso y desde hace mucho tiempo emerge cada 27 años para sac", 100, 400, "2017", "agua"));
        
        return peliculas;
    }
}
