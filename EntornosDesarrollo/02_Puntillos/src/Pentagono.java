public class Pentagono extends Poligono {
    public Pentagono(String nombre, Segmento s1, Segmento s2, Segmento s3, Segmento s4, Segmento s5) {
        super(nombre, 5);
        this.segmentos[0] = s1;
        this.segmentos[1] = s2;
        this.segmentos[2] = s3;
        this.segmentos[3] = s4;
        this.segmentos[4] = s5;

        if (!this.esValido()) {
            System.out.println("Error: El pentágono no es válido o no cierra.");
        }
    }
}
