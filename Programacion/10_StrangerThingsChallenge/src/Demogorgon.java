public class Demogorgon extends CharacterBase{
    // Atributos
    private int dientes;

    // Constructor
    public Demogorgon(String name, int age, int hp, String idPrimaryKey, String faction, int level, String role, int danyo, int dientes) {
        super(name, age, hp, idPrimaryKey, faction, level, role, danyo);
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
