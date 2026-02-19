import java.util.UUID;

public class Steve extends CharacterBase {
    private int batDurability;

    public Steve(String name, int age, int hp, UUID idPrimaryKey, Faction faction, int level, int batDurability) {
        super(name, age, hp, idPrimaryKey, faction, level);
        this.batDurability = batDurability;
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
