public class Steve extends CharacterBase{
    // Atributos
    private int helados;

    //Constructor
    public Steve(String name, int age, int hp, String idPrimaryKey, String faction, int level, String role, int danyo, int helados) {
        super(name, age, hp, idPrimaryKey, faction, level, role, danyo);
        this.helados = helados;
    }

    // Metodos
    public void swingBat(){
        System.out.println("Steve swings the bat!");
    }

    // Getter and Setter
    public int getHelados() {
        return helados;
    }
    public void setHelados(int helados) {
        this.helados = helados;
    }

    // To String
    @Override
    public String toString() {
        return super.toString() +
                "Steve{" +
                "helados=" + helados +
                "} ";
    }

    // Implements
    @Override
    public int attack() {
        return 11;
    }
    @Override
    public void battleCry() {
        System.out.println("Harrington's got this.");
    }
}
