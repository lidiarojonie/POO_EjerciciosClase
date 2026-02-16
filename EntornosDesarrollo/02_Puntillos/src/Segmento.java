public class Segmento {
    // Atributos
    private Punto p1;
    private Punto p2;

    // Constructor
    public Segmento(Punto p1, Punto p2) {
        if (p1.getX() == p2.getX() && p1.getY() == p2.getY()) {
            throw new IllegalArgumentException("Un segmento requiere dos puntos distintos.");
        }
        this.p1 = p1;
        this.p2 = p2;
    }

    // Metodos
    public double getLongitud() {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    // Getters y Setters
    public Punto getP1() {
        return p1;
    }
    public void setP1(Punto p1) {
        this.p1 = p1;
    }
    public Punto getP2() {
        return p2;
    }
    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    // To String
    @Override
    public String toString() {
        // Retorna algo como (2,2)-(1,2)
        return p1.toString() + "-" + p2.toString();
    }
}
