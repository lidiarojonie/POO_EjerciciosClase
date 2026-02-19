import java.util.UUID;

public class Demogorgon extends CharacterBase {

    private int teeth;

    public Demogorgon(String name, int age, int hp, UUID idPrimaryKey, Faction faction, int level, int teeth) {
        super(name, age, hp, idPrimaryKey, faction, level);
        this.teeth = teeth;
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
