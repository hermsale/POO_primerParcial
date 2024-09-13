package libreria;

public class Editorial {
    // Editorial:
    // • Nombre
    // • Teléfono
    // • Dirección
    // • Localidad
    // • E-mail
    // • CUIT 

    private String nombreEditorial;
    private String telefonoEditorial;
    private String direccionEditorial;
    private String localidad;
    private String email;
    private String cuit;
    
    public Editorial(String nombreEditorial, String telefonoEditorial, String direccionEditorial, String localidad,
            String email, String cuit) {
        this.nombreEditorial = nombreEditorial;
        this.telefonoEditorial = telefonoEditorial;
        this.direccionEditorial = direccionEditorial;
        this.localidad = localidad;
        this.email = email;
        this.cuit = cuit;
    }

    
    public String getNombreEditorial() {
        return nombreEditorial;
    }
    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }
    public String getTelefonoEditorial() {
        return telefonoEditorial;
    }
    public void setTelefonoEditorial(String telefonoEditorial) {
        this.telefonoEditorial = telefonoEditorial;
    }
    public String getDireccionEditorial() {
        return direccionEditorial;
    }
    public void setDireccionEditorial(String direccionEditorial) {
        this.direccionEditorial = direccionEditorial;
    }
    public String getLocalidad() {
        return localidad;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCuit() {
        return cuit;
    }
    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    // this.nombreEditorial = nombreEditorial;
    // this.telefonoEditorial = telefonoEditorial;
    // this.direccionEditorial = direccionEditorial;
    // this.localidad = localidad;
    // this.email = email;
    // this.cuit = cuit;
    @Override
    public String toString() {
        return "Datos Editorial\n Nombre Editorial: " + getNombreEditorial() + ", Telefono: " + getTelefonoEditorial() + ", Direccion: " + getDireccionEditorial()+ ", Localidad: " + getLocalidad() + ", Email: "+getEmail()+", CUIT: "+getCuit();
    }
}
