public class Demogorgon extends CharacterBase{
    // Atributos
    private int dientes;

    // Constructor
    public Demogorgon(String name, int age, int hp, int dientes) {
        super(name, age, hp);
        this.dientes = dientes;
    }

    // Metodos
    @Override
    public int attack() {
        return 19;
    }
    @Override
    public void battleCry() {
        System.out.println("*SCREEECH*");
    }
    @Override
    public boolean isAlive() {
        return false;
    }

    // Getter and setter
    public int getDientes() {
        return dientes;
    }
    public void setDientes(int dientes) {
        this.dientes = dientes;
    }

    // To String
    @Override
    public String toString() {
        return super.toString() +
                "Demogorgon{" +
                "dientes=" + dientes +
                "} ";
    }
}
