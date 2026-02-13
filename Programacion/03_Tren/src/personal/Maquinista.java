package personal;

public class Maquinista {
    // ATRIBUTOS
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String DNI;
    private double suledoMensual;
    private String rango;

    //CONSTRUCTOR
    public Maquinista() {

    }

    public Maquinista(String nombre) {
        this.nombre = nombre;
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
    public double getSuledoMensual() {
        return suledoMensual;
    }
    public void setSuledoMensual(double suledoMensual) {
        this.suledoMensual = suledoMensual;
    }
    public String getRango() {
        return rango;
    }
    public void setRango(String rango) {
        this.rango = rango;
    }
}