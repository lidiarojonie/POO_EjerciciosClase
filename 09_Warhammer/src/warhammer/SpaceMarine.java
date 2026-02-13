package warhammer;

public class SpaceMarine extends UnitBase{
    // Atributos
    private String chapter;      // Ultramarines, Blood Angels...
    private int armor;           // 0-100

    // Constructor
    public SpaceMarine(String name, int hp, String chapter, int armor) {
        super(name, "Imperium", hp);           // constructor padre
        this.chapter = chapter;
        this.armor = clamp(armor, 0, 100);
    }

    // Getter and setter
    public String getChapter() { return chapter; }
    public void setChapter(String chapter) {
        this.chapter = chapter;
    }
    public int getArmor() { return armor; }
    public void setArmor(int armor) {
        this.armor = clamp(armor, 0, 100);
    }

    // Metodos
    public void bolterBurst() {
        System.out.println(getName() + " dispara una ráfaga de bólter!");
    }
    @Override
    public int attack() {
        // daño base + pequeño bonus por armadura alta (ejemplo simple)
        return 12 + (armor >= 70 ? 3 : 0);
    }
    @Override
    public void battleCry() {
        System.out.println(getName() + " (" + chapter + "): For the Emperor!");
    }
    private int clamp(int v, int min, int max) {
        return Math.max(min, Math.min(max, v));
    }

    // To String
    @Override
    public String toString() {
        return super.toString() + " SpaceMarine{chapter='" + chapter + "', armor=" + armor + "}";
    }
}
