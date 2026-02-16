public class Cuadrado extends Poligono {
    public Cuadrado(String nombre, Segmento s1, Segmento s2, Segmento s3, Segmento s4) {
        super(nombre, 4);
        this.segmentos[0] = s1;
        this.segmentos[1] = s2;
        this.segmentos[2] = s3;
        this.segmentos[3] = s4;

        if (!this.esValido()) {
            System.out.println("Error: Los segmentos no forman una figura cerrada.");
        } else if (!ladosIguales()) {
            System.out.println("Aviso: Esto es un cuadrilátero, pero no un cuadrado (lados desiguales).");
        }
    }

    private boolean ladosIguales() {
        double longitudReferencia = segmentos[0].getLongitud();
        for (Segmento s : segmentos) {
            // Usamos un margen de error (0.001) por la precisión de double
            if (Math.abs(s.getLongitud() - longitudReferencia) > 0.001) {
                return false;
            }
        }
        return true;
    }
}