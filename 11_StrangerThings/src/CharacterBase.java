public abstract class CharacterBase implements Fighter {
    // Atributos
    private String name;
    private int age;
    private int hp;

    // Constructor
    public CharacterBase(String name, int age, int hp) {
        this.name = name;
        this.age = age;
        this.hp = hp;
    }

    // Metodos
    public void receiveDamage(int damage){
        int hpNow = getHp();
        hpNow -= damage;
        setHp(hpNow);
    }

    // Getter and setter
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

    // To String
    @Override
    public String toString() {
        return "CharacterBase{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hp=" + hp +
                '}';
    }
}
