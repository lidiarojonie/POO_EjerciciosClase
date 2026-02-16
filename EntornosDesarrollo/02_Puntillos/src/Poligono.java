public abstract class Poligono {
    // Atributos
    protected String nombre;
    protected Segmento[] segmentos;

    // constructor
    public Poligono(String nombre, int numLados) {
        this.nombre = nombre;
        this.segmentos = new Segmento[numLados];
    }

    // Metodos
    public void setSegmento(int indice, Segmento s) {
        if (indice >= 0 && indice < segmentos.length) {
            this.segmentos[indice] = s;
        }
    }

    public boolean esValido() {
        for (int i = 0; i < segmentos.length; i++) {
            Segmento actual = segmentos[i];
            Segmento siguiente = segmentos[(i + 1) % segmentos.length];

            // Solo comprobamos, no imprimimos nada aquí
            if (actual == null || siguiente == null) return false;
            if (!puntosSonIguales(actual.getP2(), siguiente.getP1())) {
                return false;
            }
        }

        return true;
    }

    // Metodo auxiliar para comparar coordenadas de puntos
    private boolean puntosSonIguales(Punto a, Punto b) {
        return a.getX() == b.getX() && a.getY() == b.getY();
    }

    public void imprimirFormatoEspecial() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ejemplo de ").append(this.getClass().getSimpleName().toLowerCase()).append(": ");

        for (int i = 0; i < segmentos.length; i++) {
            sb.append("S").append(i + 1).append(": ");
            sb.append(segmentos[i].toString());

            // Añadimos espacio entre segmentos, excepto en el último
            if (i < segmentos.length - 1) {
                sb.append("  ");
            }
        }
        System.out.println(sb.toString());
    }

    public void imprimirInfo() {
        System.out.println("Polígono: " + nombre);
        for (int i = 0; i < segmentos.length; i++) {
            System.out.print("Lado " + (i+1) + ": ");
            // Aquí llamarías a un metodo de imprimir en Segmento
        }
    }
}