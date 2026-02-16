public class Punto {
    // Atributos
    protected int x;
    protected int y;

    // Constructor
    public Punto(){
        x=0;
        y=0;
    }
    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }

    // Getters y Setters
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    // To String
    @Override
    public String toString() {
        // Retorna algo como (2,2)
        return "(" + x + "," + y + ")";
    }
}
