import java.util.ArrayList;

public class NietoRevoltoso extends Nieto {
    // Atributos
    private ArrayList<String> travesuras;

    // Constructor
    public NietoRevoltoso(String nombre, String apellidos, Genero genero, String fecha_nacimiento, int telefono, String direccion, int id_nieto, int paga_semanal, String aficion) {
        super(nombre, apellidos, genero, fecha_nacimiento, telefono, direccion, id_nieto, paga_semanal, aficion);
        this.travesuras = new ArrayList<>();
    }

    // Metodos
    public void addTravesura(String travesura) {
        this.travesuras.add(travesura);
    }

    public ArrayList<String> getTravesuras() {
        return travesuras;
    }

    // Metodos heredados
    @Override
    public int calculoPaga() {
        // Paga base - 5€ por cada travesura (chandrío)
        return super.calculoPaga() - (travesuras.size() * 5);
    }

    // To String
    @Override
    public String toString() {
        return super.toString() + " [Nieto Revoltoso, Travesuras: " + travesuras.size() + "]";
    }
}