import java.util.UUID;

public class Demogorgon extends CharacterBase {
    // Atributos
    private int teeth;

    // Constructor
    public Demogorgon(String name, int age, int hp, UUID idPrimaryKey, Faction faction, int level, int teeth) {
        super(name, age, hp, idPrimaryKey, faction, level);
        this.teeth = teeth;
    }

    // @Override
    @Override
    public void performTurn(CharacterBase target) {
        int damage = atack();
        target.recieveDmg(damage);
        System.out.println(getName() + " hits " + target.getName());
    }
    @Override
    public Role getRole() {
        return Role.BOSS;
    }
    @Override
    public int atack() {
        return 19 + (teeth / 10);
    }
    @Override
    public void battleCry() {
        System.out.println("SCREEEEECH");
    }
    @Override
    public void specialSkill() { // NUEVO
        System.out.println("Demogorgon SPECIAL -> Rage bite! teeth=" + teeth);
    }
}
