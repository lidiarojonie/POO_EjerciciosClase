import java.util.ArrayList;
import java.util.Objects;

public class Abuelo extends Persona {
    // Atributos
    private int id_abuelo;
    private String DNI;
    private String nombre_carinyoso;
    private Relacion relacion;
    private int pension;
    private ArrayList<Nieto> nietos= new ArrayList<>();

    // Constructor
    public Abuelo(String nombre, String apellidos, Genero genero, String fecha_nacimiento, int telefono, String direccion, int id_abuelo, String DNI, String nombre_carinyoso, Relacion relacion, int pension) {
        super(nombre, apellidos, genero, fecha_nacimiento, telefono, direccion);
        this.id_abuelo = id_abuelo;
        this.DNI = DNI;
        this.nombre_carinyoso = nombre_carinyoso;
        this.relacion = relacion;
        this.pension = pension;
    }

    // Metodos
    public void addnietos(Nieto nieto){
        nietos.add(nieto);
    }

    // Getter and Setter
    public int getId_abuelo() {
        return id_abuelo;
    }
    public void setId_abuelo(int id_abuelo) {
        this.id_abuelo = id_abuelo;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public Relacion getRelacion() {
        return relacion;
    }
    public void setRelacion(Relacion relacion) {
        this.relacion = relacion;
    }
    public String getNombre_carinyoso() {
        return nombre_carinyoso;
    }
    public void setNombre_carinyoso(String nombre_carinyoso) {
        this.nombre_carinyoso = nombre_carinyoso;
    }
    public int getPension() {
        return pension;
    }
    public void setPension(int pension) {
        this.pension = pension;
    }

    // To String
    @Override
    public String toString() {
        return "Abuelo{" +
                "id_abuelo=" + id_abuelo +
                ", DNI='" + DNI + '\'' +
                ", nombre_carinyoso='" + nombre_carinyoso + '\'' +
                ", relacion=" + relacion +
                ", pension=" + pension +
                "} " + super.toString();
    }

    // Equals
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Abuelo abuelo)) return false;
        if (!super.equals(o)) return false;
        return id_abuelo == abuelo.id_abuelo && pension == abuelo.pension && Objects.equals(DNI, abuelo.DNI) && Objects.equals(nombre_carinyoso, abuelo.nombre_carinyoso) && relacion == abuelo.relacion;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id_abuelo, DNI, nombre_carinyoso, relacion, pension);
    }
}
