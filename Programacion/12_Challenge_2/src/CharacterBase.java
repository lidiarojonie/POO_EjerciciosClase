import java.util.UUID;

public abstract class CharacterBase implements Fighter, CombatAction {
    // Atributos
    private String name;
    private int age;
    private int hp;
    private UUID idPrimaryKey;
    private Faction faction;
    private int level;
    private CharacterBase next; // Recursividad

    // Constructor
    public CharacterBase(String name, int age, int hp, UUID idPrimaryKey, Faction faction, int level) {
        this.name = name;
        this.age = age;
        this.hp = hp;
        this.idPrimaryKey = idPrimaryKey;
        this.faction = faction;
        this.level = level;
        this.next = null;
    }

    // @Override
    @Override
    public abstract void performTurn(CharacterBase target);
    @Override
    public UUID getIdPrimaryKey() {
        return idPrimaryKey;
    }
    @Override
    public Role getRole() {
        return Role.HERO; // por defecto
    }
    @Override
    public String getName() { // CAMBIO -> lo damos aquí para no repetir en hijos
        return name;
    }
    @Override
    public abstract int atack();        // CAMBIO -> ahora queda centralizado (obliga a hijas)
    @Override
    public abstract void battleCry();   // CAMBIO
    @Override
    public abstract void specialSkill();// NUEVO -> polimorfismo real SIN instanceof

    //Metodos
    public void levelUp() {
        level++;
        hp += 10;
    }
    public void recieveDmg(int dmg) {
        hp -= dmg;
        if (hp < 0) hp = 0;
    }
    public void showCard() {
        System.out.printf(
                "%-36s | %-12s | %-10s | %5d | %5d | %-7s%n",
                idPrimaryKey.toString(),
                name,
                faction.name(),
                level,
                hp,
                getRole().name()
        );
    }
    public static void printHeader() {
        System.out.printf(
                "%-36s | %-12s | %-10s | %5s | %5s | %-7s%n",
                "ID", "name", "faction", "level", "hp", "role"
        );
        System.out.println("---------------------------------------------------------------------------------------------");
    }

    // Getters
    public int getHp() { return hp; }
    public Faction getFaction() { return faction; }
    public int getLevel() { return level; }

    // Getter and Setter
    public CharacterBase getNext() {
        return next;
    }
    public void setNext(CharacterBase next) {
        this.next = next;
    }
}
