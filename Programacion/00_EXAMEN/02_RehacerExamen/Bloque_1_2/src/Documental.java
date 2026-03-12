public class Documental extends ContenidoBase implements ConBonus{
    // Constructor
    public Documental(String id, String titulo, int edadMinima, Calidad calidad) {
        super(id, titulo, edadMinima, calidad);
    }

    // Metodos heredados
    @Override
    public void reproducir() {
        System.out.println("Log de documental");
    }
    @Override
    public int puntosPorReproduccion() {
        return 3;
    }

    // Interfaces
    @Override
    public String bonus() {
        return "El documento tiene bonus";
    }

}
