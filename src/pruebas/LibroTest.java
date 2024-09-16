package pruebas;

import libreria.Autor;
import libreria.Editorial;
import libreria.Libro;

public class LibroTest {

    // tambien podría crear un libro de esta manera, pero no estaria utilizando el metodo para crear libros
    // Libro libroHPUno = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", "Bloomsbury", 1997, 2, 20.99);

    // creo un metodo crearLibro de tipo Libro. que guardara el objeto Libro
    public Libro crearLibro() {
        return new Libro("Harry Potter y la camara secreta", "J.K. Rowling", "Bloomsbury", 1998, 
        2, 22.99);
    }

    // guardamos lo que haya en crearLibro, en un objeto de tipo Libro. Para ser utilizado mas adelante
    Libro libroHP = crearLibro(); 


    // se muestra el libro creado. utilizo el metodo getNombreLibro().equals para verificar que haya un titulo
    public void mostrarLibro(){
        if(libroHP.getNombreLibro().equals("")){
            System.out.println("No hay libros");
        }else{
            System.out.println(libroHP.toString());   // si se creo correctamente el libro, muestru su informacion
        }

    }

     // creamos un autor /////////////////////////////////////////////////////////
     public String crearAutor(){
         Autor autorUno = new Autor("Joanne", "Rowling", "31/07/1965", "Femenino", "j.k.rowling@gmail.com");
        return autorUno.toString();
     }

     public void mostrarAutor(){
        System.out.println(crearAutor());
     }

    

      // creamos una editorial ////////////////////////////////////////////////
    public String crearEditorial(){
        Editorial editorialUno = new Editorial(
        "Bloomsbury Publishing",       // Nombre de la editorial
        "+44 20 7631 5600",            // Teléfono
        "50 Bedford Square",           // Dirección
        "Londres",                     // Localidad
        "info@bloomsbury.com",         // Email
        "12345678901"                  // CUIT
    );
    return editorialUno.toString();
    }

    public void mostrarEditorial(){
        System.out.println(crearEditorial());
    }

    // metodo para agregarEjemplares
     public void agregarEjemplares(int cantidad) {
       
        // Agregar ejemplares (la suma de los ejemplares la realizo en la clase Libro)
        libroHP.setCantidadEjemplares(cantidad);
        
        // Mostrar el estado del libro despues de agregar ejemplares
        System.out.println("Se agregaron: "+cantidad+" ejemplares");
    }
}
