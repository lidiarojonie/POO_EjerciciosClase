public class Eleven extends CharacterBase{
    // Atributos
    private int poderes;

    // Constructor
    public Eleven(String name, int age, int hp, int poderes, int danyo) {
        super(name, age, hp, danyo);
        this.poderes = poderes;
    }
    public Eleven(String name, int age, int hp, int poderes) {
        super(name, age, hp);
        this.poderes = poderes;
    }
    public Eleven(String name, int age, int hp, int poderes, int danyo, String idPrimaryKey) {
        super(name, age, hp, idPrimaryKey);
        this.poderes = poderes;
    }
    public Eleven(String name, int age, String idPrimaryKey) {
        super(name, age, idPrimaryKey);
    }

    // Metodos
    public void useTelekinesis(){
        System.out.println("Eleven uses telekinesis!");
    }

    // Getter and Setter
    public int getPoderes() {
        return poderes;
    }
    public void setPoderes(int poderes) {
        this.poderes = poderes;
    }

    // To String
    @Override
    public String toString() {
        return super.toString() +
                "Eleven{" +
                "poderes=" + poderes +
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
