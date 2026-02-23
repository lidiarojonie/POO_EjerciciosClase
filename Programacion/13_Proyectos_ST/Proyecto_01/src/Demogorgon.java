public class Demogorgon extends Character {
    // Constructor
    public Demogorgon(String name, int hp) {
        super(name, hp);
    }

    // Metodos
    @Override
    public void action(String target) {
        System.out.println(name + " muerde a " + target);
    }
    @Override
    public int pointsPerAction() {
        return 3;
    }

    // To String
    @Override
    public String toString() {
        return "Demogorgon{name='" + name + "', hp=" + hp + "}";
    }
}