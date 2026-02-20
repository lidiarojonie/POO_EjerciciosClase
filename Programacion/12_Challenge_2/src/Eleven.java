import java.util.UUID;

public class Eleven extends CharacterBase {
    // Atributos
    private int psychicPower;

    // Constructor
    public Eleven(String name, int age, int hp, UUID idPrimaryKey, Faction faction, int level, int psychicPower) {
        super(name, age, hp, idPrimaryKey, faction, level);
        this.psychicPower = psychicPower;
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
        return 18 + (psychicPower / 10);
    }
    @Override
    public void battleCry() {
        System.out.println("I can do it");
    }
    @Override
    public void specialSkill() { // NUEVO
        System.out.println("Eleven SPECIAL -> Telekinesis! power=" + psychicPower);
    }
}
