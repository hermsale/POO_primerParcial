// import libreria.Autor;
// import libreria.Editorial;
// import libreria.Libro;
import pruebas.LibroTest;

public class App {
    public static void main(String[] args) throws Exception {

         
        LibroTest pruebaLibro = new LibroTest();
        // se crea un libro utilizando el metodo crearLibro
        pruebaLibro.mostrarAutor();
        pruebaLibro.mostrarEditorial();
        pruebaLibro.crearLibro();

        // se imprime el libro
        pruebaLibro.mostrarLibro();
        // agrego tres ejemplares al libro ya cargado
        pruebaLibro.agregarEjemplares(3);
        pruebaLibro.mostrarLibro();
    }
}
