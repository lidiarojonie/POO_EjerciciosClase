public class Eleven extends CharacterBase{
    // Atributos
    private int levelPoderes;

    // Constructor
    public Eleven(String name, int age, int hp, String idPrimaryKey, String faction, int level, String role, int danyo, int levelPoderes) {
        super(name, age, hp, idPrimaryKey, faction, level, role, danyo);
        this.levelPoderes = levelPoderes;
    }

    // Metodos
    public void useTelekinesis(){
        System.out.println("Eleven uses telekinesis!");
    }

    // Getter and Setter
    public int getLevelPoderes() {
        return levelPoderes;
    }
    public void setLevelPoderes(int levelPoderes) {
        this.levelPoderes = levelPoderes;
    }

    // To String
    @Override
    public String toString() {
        return super.toString() +
                "Eleven{" +
                "poderes=" + levelPoderes +
                "} ";
    }

    // Implements
    @Override
    public int attack() {
        return 18;
    }
    @Override
    public void battleCry() {
        System.out.println("I can do it.");
    }
}
