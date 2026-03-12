public class Serie extends ContenidoBase implements Descargable{
    // Constructor
    public Serie(String id, String titulo, int edadMinima, Calidad calidad) {
        super(id, titulo, edadMinima, calidad);
    }

    // Metodos heredados
    @Override
    public void reproducir() {
        System.out.println("Log de serie");
    }
    @Override
    public int puntosPorReproduccion() {
        return 1;
    }

    // Interfaces
    @Override
    public void descargar() {
        System.out.println("Se ha descargado la serie " + getTitulo());
    }
}
