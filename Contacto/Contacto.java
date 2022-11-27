package Archivo;

public class Contacto {
    private String identificacion;
    private String nombre;
    private String apellidos;

    public Contacto(String identificacion, String nombre, String apellidos) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
}
