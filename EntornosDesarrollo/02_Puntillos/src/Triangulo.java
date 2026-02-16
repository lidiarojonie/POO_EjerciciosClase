public class Triangulo extends Poligono{

    public Triangulo(String nombre, Segmento s1, Segmento s2, Segmento s3) {
        // El '3' le dice a la clase padre cuántos lados esperar
        super(nombre, 3);
        this.segmentos[0] = s1;
        this.segmentos[1] = s2;
        this.segmentos[2] = s3;

        // Aquí llamaríamos a la validación de la Nota 2
        if (!esValido()) {
            System.out.println("Error: Los segmentos no forman una figura cerrada.");
        }
    }
}
