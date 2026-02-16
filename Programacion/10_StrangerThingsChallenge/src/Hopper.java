public class Hopper extends CharacterBase{
    // Atributos
    private int ammo;

    // Constructor
    public Hopper(String name, int age, int hp, String idPrimaryKey, String faction, int level, String role, int danyo, int ammo) {
        super(name, age, hp, idPrimaryKey, faction, level, role, danyo);
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

}
