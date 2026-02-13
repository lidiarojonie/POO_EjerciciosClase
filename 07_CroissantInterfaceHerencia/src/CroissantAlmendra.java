import interfaces.CroissantActions;
import interfaces.Cubierta;
import interfaces.Horneable;

public class CroissantAlmendra
        extends Croissant
        implements Horneable, Cubierta {
    // ATRIBUTOS NUEVOS
    private int porcentajeAlmendra;

    // CONSTRUCTOR DEPENDIENTE DE CLASE PADRE
    public CroissantAlmendra(int id, String nombre, double precio, int peso, int porcentajeAlmendra) {
        super(id, nombre, precio, peso);
        this.porcentajeAlmendra = porcentajeAlmendra;
    }

    // MÉTODOS
    @Override
    public void hornear() {
        System.out.println("Croissant horneado. ");
    }

    @Override
    public void coberturaTopping() {
        System.out.println("Croissant cubierto de almendra. ");
    }

    public void modificarGramos(int gramos){
        super.setGramos(gramos);
        // Bonito academicamente, no para empresa
            // super.gramos = gramos;
    }

    // GETTER AND SETTER
    public int getPorcentajeAlmendra() {
        return porcentajeAlmendra;
    }
    public void setPorcentajeAlmendra(int porcentajeAlmendra) {
        this.porcentajeAlmendra = porcentajeAlmendra;
    }

    // TO STRING
    @Override
    public String toString() {
        return "CroissantAlmendra{" +
                "porcentajeAlmendra=" + porcentajeAlmendra +
                "} " + super.toString();
    }
}
