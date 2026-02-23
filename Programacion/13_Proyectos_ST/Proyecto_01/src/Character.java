public abstract class Character {
    // Atributos
    protected String name;
    protected int hp;

    // Constructor
    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    // Getters
    public String getName() { return name; }
    public int getHp() { return hp; }

    // --- POLIMORFISMO: cada clase define su comportamiento ---
    public abstract void action(String target);

    // --- SOBRECARGA (misma firma, distinto parámetro) ---
    public void action() {
        action("NADIE");
    }

    // puntos que da cada acción (simple para corregir rápido)
    public abstract int pointsPerAction();

    // --- SOBRESCRITURA: toString() personalizado ---
    @Override
    public String toString() {
        return "Character{name='" + name + "', hp=" + hp + "}";
    }
}