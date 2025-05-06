package Model;

import java.util.ArrayList;


public class Product {
    //atributos
    private String titulo, trailer, sinopsis, fechaEstreno, url;
    private int duracion, nVotos, sPuntuacion, id;
    private Double precio;
    private Category category;

    //getters y setters
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category genero) {
        this.category = category;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(String fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getnVotos() {
        return nVotos;
    }

    public void setnVotos(int nVotos) {
        this.nVotos = nVotos;
    }

    public int getsPuntuacion() {
        return sPuntuacion;
    }

    public void setsPuntuacion(int sPuntuacion) {
        this.sPuntuacion = sPuntuacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int idPelicula) {
        this.id = idPelicula;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    //constructores
    public Product() {
    }

    public Product(String titulo, String trailer, String sinopsis, String fechaEstreno,
                   String url, int duracion, int nVotos, int sPuntuacion, int id, Double precio) {
        this.titulo = titulo;
        this.trailer = trailer;
        this.sinopsis = sinopsis;
        this.fechaEstreno = fechaEstreno;
        this.url = url;
        this.duracion = duracion;
        this.nVotos = nVotos;
        this.sPuntuacion = sPuntuacion;
        this.id = id;
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", trailer=" + trailer + ", sinopsis=" + sinopsis + ", fechaEstreno=" + fechaEstreno + ", duracion=" + duracion + ", nVotos=" + nVotos + ", sPuntuacion=" + sPuntuacion + ", id=" + id + ", precio=" + precio + '}';
    }

    //lo mismo pero accediendo mediante los getter y setter
    public static String toCadena(Product product) {
        return "Pelicula{" +
                "\"titulo\"=" + product.getTitulo() + ", "
                + "trailer=" + product.getTrailer() + ","
                + " sinopsis=" + product.getSinopsis() + ", "
                + "fechaEstreno=" + product.getFechaEstreno() + ", "
                + "duracion=" + product.getDuracion() +
                ", nVotos=" + product.getnVotos() + ", sPuntuacion="
                + product.getnVotos() + ", id=" + product.getId() + ", precio=" + product.getPrecio() + '}';
    }

    public static String fromArrayToJson(ArrayList<Product> peliculas){
        String resp = "[";
        for (Product product : peliculas) {
            resp+= "{" +
                    "'titulo':'" + product.getTitulo() + "', "
                    + "'trailer':'" + product.getTrailer() + "',"
                    + " 'sinopsis':'" + product.getSinopsis() + "', "
                    + "'fechaEstreno':" + product.getFechaEstreno() + ", "
                    + "'duracion':" + product.getDuracion() +
                    ", 'nVotos':" + product.getnVotos() + ", 'sPuntuacion':"
                    + product.getnVotos() + ", 'id':" + product.getId() + ", "
                    + "'precio':" + product.getPrecio() + "}";
            resp+=",";
        }
        resp = resp.substring(0, resp.length()-1);
        resp+="]";
        return resp;
    }



}
