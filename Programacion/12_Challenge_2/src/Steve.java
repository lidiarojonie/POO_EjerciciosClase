import java.util.UUID;

public class Steve extends CharacterBase {
    //Atributos
    private int batDurability;

    // Constructor
    public Steve(String name, int age, int hp, UUID idPrimaryKey, Faction faction, int level, int batDurability) {
        super(name, age, hp, idPrimaryKey, faction, level);
        this.batDurability = batDurability;
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
        return 11 + (batDurability / 20);
    }
    @Override
    public void battleCry() {
        System.out.println("Harrington´s got this");
    }
    @Override
    public void specialSkill() { // NUEVO
        System.out.println("Steve SPECIAL -> Swing bat! durability=" + batDurability);
        batDurability = Math.max(0, batDurability - 5);
    }
}
