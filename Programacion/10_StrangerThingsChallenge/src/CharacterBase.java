public class CharacterBase implements Identificable, Fighter{
    // Atributos
    private String name;
    private int age;
    private int hp;
    private String idPrimaryKey;
    private String faction;
    private int level;
    private String role;
    private int danyo;

    // Constructor
    public CharacterBase(String name, int age, int hp, String idPrimaryKey, String faction, int level, String role, int danyo) {
        this.name = name;
        this.age = age;
        this.hp = hp;
        this.idPrimaryKey = idPrimaryKey;
        this.faction = faction;
        this.level = level;
        this.role = role;
        this.danyo = danyo;
    }

    // Metodos interfaz
    @Override
    public String getIdPrimaryKey() {
        return "";
    }
    @Override
    public String getRole() {
        return "HERO";
    }
    @Override
    public int attack() {
        return 0;
    }
    @Override
    public void battleCry() {

    }
    @Override
    public boolean isAlive() {
        return false;
    }
    @Override
    public void receiveDamage(int damage) {

    }

    // Getter and Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setIdPrimaryKey(String idPrimaryKey) {
        this.idPrimaryKey = idPrimaryKey;
    }
    public String getFaction() {
        return faction;
    }
    public void setFaction(String faction) {
        this.faction = faction;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public int getDanyo() {
        return danyo;
    }
    public void setDanyo(int danyo) {
        this.danyo = danyo;
    }

    // To String
    @Override
    public String toString() {
        return "CharacterBase{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hp=" + hp +
                ", idPrimaryKey='" + idPrimaryKey + '\'' +
                ", faction='" + faction + '\'' +
                ", level=" + level +
                ", role='" + role + '\'' +
                ", danyo=" + danyo +
                '}';
    }
}
