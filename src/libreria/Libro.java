package libreria;

public class Libro {
    // Libro:
    // • Nombre del libro
    // • Autor
    // • Editorial
    // • Año de publicación
    // • Cantidad de ejemplares
    // • Costo 

    private String nombreLibro;
    private String autor;
    private String editorial;
    private int anioPublicacion;
    private int cantidadEjemplares;
    private double costo;

    
    public Libro(String nombreLibro, String autor, String editorial, int anioPublicacion, int cantidadEjemplares,
            double costo) {
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.cantidadEjemplares = cantidadEjemplares;
        this.costo = costo;
    }


    public String getNombreLibro() {
        return nombreLibro;
    }
    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }
    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }


    @Override
    public String toString() {
        return "nombre del libro: " + getNombreLibro() + ", autor: " + getAutor() + ", editorial: " + getEditorial()
                + ", anio Publicacion: " + getAnioPublicacion() + ", cantidad de ejemplares: " + getCantidadEjemplares() + ", costo: "
                + getCosto()+" u$d";
    }

    
}
