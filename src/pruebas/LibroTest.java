package pruebas;

import libreria.Autor;
import libreria.Editorial;
import libreria.Libro;

public class LibroTest {

    // prueba unitaria para agregarEjemplar
    // public static void main(String[] args) {
    //     LibroTest test = new LibroTest();
    //     test.agregarEjemplares();
    // }

    // constructor 
    public LibroTest(){
        	// this.mostrarLibro();
            // this.mostrarAutor();
            // this.mostrarEditorial();
    }

    public String CrearLibro(){
        Libro libroHPDos = new Libro("Harry Potter y la camara secreta", "J.K. Rowling", "Bloomsbury", 1998, 2, 22.99);
        return libroHPDos.toString();
    }

    // se muestra el libro creado
    public void mostrarLibro(){
        System.out.println(CrearLibro());      
    }

     // creamos un autor /////////////////////////////////////////////////////////
     public String crearAutor(){
         Autor autorUno = new Autor("Joanne", "Rowling", "31/07/1965", "Femenino", "j.k.rowling@example.com");
        return autorUno.toString();
     }

     public void mostrarAutor(){
        System.out.println(crearAutor());
     }

    

      // creamos una editorial ////////////////////////////////////////////////
    public String crearEditorial(){
        Editorial editorialUno = new Editorial(
        "Bloomsbury Publishing",       // Nombre de la editorial
        "+44 20 7631 5600",            // Teléfono (ficticio)
        "50 Bedford Square",           // Dirección (real)
        "Londres",                     // Localidad
        "info@bloomsbury.com",         // Email (ficticio)
        "12345678901"                  // CUIT (inventado)
    );
    return editorialUno.toString();
    }

    public void mostrarEditorial(){
        System.out.println(crearEditorial());
    }

// metodo para agregarEjemplares
     public void agregarEjemplares() {
        // Crear un nuevo libro
        Libro libroHPUno = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", "Bloomsbury", 1997, 2, 20.99);
        
        // Mostrar el estado inicial del libro
        System.out.println("Estado inicial del libro:");
        System.out.println(libroHPUno.toString());
        
        // Agregar 2 ejemplares (la suma de los ejemplares la realizo en la clase Libro)
        libroHPUno.setCantidadEjemplares(3);
        
        // Mostrar el estado del libro despues de agregar ejemplares
        System.out.println("Despues de agregar 3 ejemplares:");
        System.out.println(libroHPUno.toString());
    }
}
