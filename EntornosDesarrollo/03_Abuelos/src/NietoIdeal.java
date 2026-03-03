import java.util.ArrayList;

public class NietoIdeal extends Nieto {
    // Atributos
    private ArrayList<String> habilidades;

    // Constructor
    public NietoIdeal(String nombre, String apellidos, Genero genero, String fecha_nacimiento, int telefono, String direccion, int id_nieto, int paga_semanal, String aficion) {
        super(nombre, apellidos, genero, fecha_nacimiento, telefono, direccion, id_nieto, paga_semanal, aficion);
        this.habilidades = new ArrayList<>();
    }

    // Metodos
    public void addHabilidad(String habilidad) {
        this.habilidades.add(habilidad);
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    // Metodos heredados
    @Override
    public int calculoPaga() {
        // Paga base + 5€ por cada habilidad
        return super.calculoPaga() + (habilidades.size() * 5);
    }

    // To String
    @Override
    public String toString() {
        return super.toString() + " [Nieto Ideal, Habilidades: " + habilidades.size() + "]";
    }
}