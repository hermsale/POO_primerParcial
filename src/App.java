// import libreria.Autor;
// import libreria.Editorial;
// import libreria.Libro;
import java.util.Scanner;

import pruebas.LibroTest;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        LibroTest pruebaLibro = new LibroTest();
        // se crea un libro utilizando el metodo crearLibro
        pruebaLibro.mostrarAutor();
        pruebaLibro.mostrarEditorial();
        pruebaLibro.crearLibro();

        // se imprime el libro
        pruebaLibro.mostrarLibro();

        System.out.print("¿Cuanto ejemplares desea agregar?: ");
        cantidad = sc.nextInt();
       
        pruebaLibro.agregarEjemplares(cantidad);
        pruebaLibro.mostrarLibro();

        sc.close();
    }
}
