public class Pelicula extends ContenidoBase implements PremiumFeature{
    // Constructor
    public Pelicula(String id, String titulo, int edadMinima, Calidad calidad) {
        super(id, titulo, edadMinima, calidad);
    }

    // Metodos heredados
    @Override
    public void reproducir() {
        System.out.println("Log de película");
    }
    @Override
    public int puntosPorReproduccion() {
        return 2;
    }

    // Interfaces
    @Override
    public String bonus() {
        return "La pelicula tiene bonus";
    }

    @Override
    public void descargar() {
        System.out.println("Se ha descargado la pelicula " + getTitulo());
    }
}
