import java.util.UUID;

public class Dustin extends CharacterBase{
    // Atributos
    private int gadgets;

    // Constructor
    public Dustin(String name, int age, int hp, UUID idPrimaryKey, Faction faction, int level, int gadgets) {
        super(name, age, hp, idPrimaryKey, faction, level);
        this.gadgets = gadgets;
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
        return 10 + Math.min(5, gadgets / 10);
    }
    @Override
    public void battleCry() {
        System.out.println("Let me try");
    }
    @Override

    // Metodos
    public void specialSkill() { // NUEVO
        if (gadgets > 0) {
            gadgets--;
            System.out.println("Dustin SPECIAL -> Shoot! gadgets left=" + gadgets);
        } else {
            System.out.println("Dustin SPECIAL -> No ammo!");
        }
    }
}
