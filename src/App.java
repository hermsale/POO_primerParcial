import libreria.Autor;
import libreria.Editorial;
import libreria.Libro;

public class App {
    public static void main(String[] args) throws Exception {

        // creamos un autor
        Autor autorUno = new Autor("Joanne", "Rowling", "31/07/1965", "Femenino", "j.k.rowling@example.com");
        // Autor autorDos = new Autor("John", "Tolkien", "03/01/1892", "Masculino", "j.r.r.tolkien@example.com");

        // creamos dos libros
        Libro libroHPUno = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", "Bloomsbury", 1997, 2, 20.99);
        Libro libroHPDos = new Libro("Harry Potter y la camara secreta", "J.K. Rowling", "Bloomsbury", 1998, 2, 22.99);


        // creamos una editorial
        Editorial editorialUno = new Editorial(
        "Bloomsbury Publishing",       // Nombre de la editorial
        "+44 20 7631 5600",            // Teléfono (ficticio)
        "50 Bedford Square",           // Dirección (real)
        "Londres",                     // Localidad
        "info@bloomsbury.com",         // Email (ficticio)
        "12345678901"                  // CUIT (inventado)
    );

        System.out.println(libroHPDos.toString());
        libroHPDos.setCantidadEjemplares(-1);
        System.out.println(libroHPDos.toString());
    }
}
