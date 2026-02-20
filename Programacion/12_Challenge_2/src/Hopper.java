import java.util.UUID;

public class Hopper extends CharacterBase {
    // Atributos
    private int extraAmmo;

    // Constructor
    public Hopper(String name, int age, int hp, UUID idPrimaryKey, Faction faction, int level, int extraAmmo) {
        super(name, age, hp, idPrimaryKey, faction, level);
        this.extraAmmo = extraAmmo;
    }

    // @Override
    @Override
    public void performTurn(CharacterBase target) {
        int damage = atack();
        target.recieveDmg(damage);
        System.out.println(getName() + " hits " + target.getName());
    }
    @Override
    public int atack() {
        return 10 + Math.min(5, extraAmmo / 10);
    }
    @Override
    public void battleCry() {
        System.out.println("Stay behind me");
    }
    @Override

    // Metodos
    public void specialSkill() { // NUEVO
        if (extraAmmo > 0) {
            extraAmmo--;
            System.out.println("Hopper SPECIAL -> Shoot! ammo left=" + extraAmmo);
        } else {
            System.out.println("Hopper SPECIAL -> No ammo!");
        }
    }
}
