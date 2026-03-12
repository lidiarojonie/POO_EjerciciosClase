public abstract class ContenidoBase {
    // Atributos
    private String id;
    private String titulo;
    private int edadMinima;
    private Calidad calidad;

    // Cconstructor
    public ContenidoBase(String id, String titulo, int edadMinima, Calidad calidad) {
        this.id = id;
        this.titulo = titulo;
        this.edadMinima = edadMinima;
        this.calidad = calidad;
    }

    // Metodos
    public void info(ContenidoBase contenidoBase) {
        System.out.println(contenidoBase.toString());
    }
    public abstract void reproducir();
    public abstract int puntosPorReproduccion();

    // Getters and setters
    public String getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getEdadMinima() {
        return edadMinima;
    }
    public Calidad getCalidad() {
        return calidad;
    }

    // To String
    @Override
    public String toString() {
        return "ContenidoBase{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", edadMinima=" + edadMinima +
                ", calidad=" + calidad +
                '}';
    }
}
