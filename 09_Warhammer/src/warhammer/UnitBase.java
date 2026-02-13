package warhammer;
import java.util.Objects;

public abstract class UnitBase implements Combatant{
    // Atributos
    private String name;
    private String faction;
    private int hp;

    // Constructor
    public UnitBase(String name, String faction, int hp) {
        this.name = name;
        this.faction = faction;
        this.hp = Math.max(0, hp);
    }

    // Getter and setter
    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }
    public String getFaction() { return faction; }
    public void setFaction(String faction) {
        this.faction = faction;
    }
    public int getHp() { return hp; }
    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    // Metodo común a todos: recibir daño
    public void receiveDamage(int dmg) {
        if (dmg < 0) dmg = 0;
        setHp(this.hp - dmg);
    }

    // OJO: attack() y battleCry() NO están implementados aquí:
    // obligamos a las hijas a definirlos (por eso abstract + implements)
    @Override
    public abstract int attack();
    @Override
    public abstract void battleCry();
    @Override
    public boolean isAlive() {
        return hp > 0;
    }

    // Equals y hash
    // Igualdad base: mismo nombre + facción (puedes ajustar)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UnitBase)) return false;
        UnitBase unitBase = (UnitBase) o;
        return Objects.equals(name, unitBase.name) &&
                Objects.equals(faction, unitBase.faction);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, faction);
    }

    // To String
    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", faction='" + faction + '\'' +
                ", hp=" + hp +
                '}';
    }
}
