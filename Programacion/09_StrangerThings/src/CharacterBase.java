import java.util.Objects;

public abstract class CharacterBase implements Fighter {
    // Atributos
    private String name;
    private int age;
    private int hp;
    private int danyo;
    private String idPrimaryKey;

    // Constructor
    public CharacterBase(String name, int age, int hp) {
        this.name = name;
        this.age = age;
        this.hp = hp;
    }
    public CharacterBase(String name, int age, int hp, int danyo) {
        this.name = name;
        this.age = age;
        this.hp = hp;
        this.danyo = danyo;
    }
    public CharacterBase(String name, int age, int hp, String idPrimaryKey) {
        this.name = name;
        this.age = age;
        this.hp = hp;
        this.idPrimaryKey = idPrimaryKey;
    }
    public CharacterBase(String name, int age, String idPrimaryKey) {
        this.name = name;
        this.age = age;
        this.idPrimaryKey = idPrimaryKey;
    }

    // Metodos
    @Override
    public void receiveDamage(int damage){
        int hpNow = getHp();
        hpNow -= damage;
        setHp(hpNow);
    }
    @Override
    public boolean isAlive() {
        if(getHp() > 0){
            return true;
        }else {
            return false;
        }
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
    public int getDanyo() {
        return danyo;
    }
    public void setDanyo(int danyo) {
        this.danyo = danyo;
    }

    public String getIdPrimaryKey() {
        return idPrimaryKey;
    }

    public void setIdPrimaryKey(String idPrimaryKey) {
        this.idPrimaryKey = idPrimaryKey;
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

    // Equals
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CharacterBase that)) return false;
        return age == that.age && Objects.equals(name, that.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
