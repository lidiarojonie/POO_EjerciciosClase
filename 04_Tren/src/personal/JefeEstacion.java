package personal;

public class JefeEstacion {
    //ATRIBUTOS
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String DNI;

    //CONSTRUCTOR
    public JefeEstacion() {

    }
    //FIN CONSTRUCTOR

    //GETTER AND SETTER
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido1() {
        return apellido1;
    }
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getApellido2() {
        return apellido2;
    }
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}