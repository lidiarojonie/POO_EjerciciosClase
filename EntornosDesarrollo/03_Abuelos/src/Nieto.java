import java.util.Objects;

public class Nieto extends Persona{
    // Atributos
    private int id_nieto;
    private int paga_semanal;
    private String aficion;
    private Abuelo[] abuelos =  new Abuelo[4];

    // Constructor
    public Nieto(String nombre, String apellidos, Genero genero, String fecha_nacimiento, int telefono, String direccion, int id_nieto, int paga_semanal, String aficion) {
        super(nombre, apellidos, genero, fecha_nacimiento, telefono, direccion);
        this.id_nieto = id_nieto;
        this.paga_semanal = paga_semanal;
        this.aficion = aficion;
    }

    // Metodos

    // Getter and Setter
    public int getId_nieto() {
        return id_nieto;
    }
    public void setId_nieto(int id_nieto) {
        this.id_nieto = id_nieto;
    }
    public int getPaga_semanal() {
        return paga_semanal;
    }
    public void setPaga_semanal(int paga_semanal) {
        this.paga_semanal = paga_semanal;
    }
    public String getAficion() {
        return aficion;
    }
    public void setAficion(String aficion) {
        this.aficion = aficion;
    }

    // To String
    @Override
    public String toString() {
        return "Nieto{" +
                "id_nieto=" + id_nieto +
                ", paga_semanal=" + paga_semanal +
                ", aficion='" + aficion + '\'' +
                "} " + super.toString();
    }

    // Equals
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Nieto nieto)) return false;
        return id_nieto == nieto.id_nieto && paga_semanal == nieto.paga_semanal && Objects.equals(aficion, nieto.aficion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id_nieto, paga_semanal, aficion);
    }
}
