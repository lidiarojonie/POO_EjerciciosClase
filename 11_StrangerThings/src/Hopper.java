public class Hopper extends CharacterBase{
    // Atributos
    private int ammo;

    // Constructor
    public Hopper(String name, int age, int hp, int ammo) {
        super(name, age, hp);
        this.ammo = ammo;
    }

    // To String
    @Override
    public String toString() {
        return super.toString() +
                "Hopper{" +
                "ammo=" + ammo +
                "} ";
    }

    // Implemets
    @Override
    public int attack() {
        return 0;
    }
    @Override
    public void battleCry() {
        System.out.println("Stay behind me.");
    }
    @Override
    public boolean isAlive() {
        return false;
    }
}
