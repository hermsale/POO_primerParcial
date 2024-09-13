// import libreria.Autor;
// import libreria.Editorial;
// import libreria.Libro;
import pruebas.LibroTest;

public class App {
    public static void main(String[] args) throws Exception {

         
        LibroTest pruebaLibro = new LibroTest();
        // se crea un libro utilizando el metodo crearLibro
        pruebaLibro.crearLibro();
        // se imprime el libro
        pruebaLibro.mostrarLibro();
        // se imprime los datos del autor
        pruebaLibro.mostrarAutor();
        // se imprime los datos de la editorial
        pruebaLibro.mostrarEditorial();

        // agrego tres ejemplares al libro ya cargado
        pruebaLibro.agregarEjemplares(3);

    }
}
