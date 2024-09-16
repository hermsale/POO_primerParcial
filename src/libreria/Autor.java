package libreria;

public class Autor {
    // • Nombre
    // • Apellido
    // • Fecha de nacimiento
    // • Sexo
    // • E-mail
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String sexo;
    private String email;

    

    public Autor(String nombre, String apellido, String fechaNacimiento, String sexo, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.email = email;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // this.nombre = nombre;
    // this.apellido = apellido;
    // this.fechaNacimiento = fechaNacimiento;
    // this.sexo = sexo;
    // this.email = email;
    @Override
    public String toString() {
        return "Ficha del Autor del Libro\n" +
               "-------------------------\n" +
               " * Nombre: " + getNombre() + "\n" +
               " * Apellido: " + getApellido() + "\n" +
               " * Fecha de Nacimiento: " + getFechaNacimiento() + "\n" +
               " * Sexo: " + getSexo() + "\n" +
               " * Email: " + getEmail() + "\n" +
               "-------------------------";
    }
    
}
