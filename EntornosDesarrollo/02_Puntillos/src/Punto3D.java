public class Punto3D extends Punto{
    // Atributos
    private int z;

    // Constructor
    public Punto3D(){
        super();
        this.z = 0;
    }
    public Punto3D(int x,int y,int z){
        super(x, y);
        this.z = z;
    }

    // Métodos
    public void imprime_coordenadas() {
        System.out.println("("+x+", "+y+", "+z+")");
    }

    // Getters y Setters
    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }
}
