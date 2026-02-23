public class Dustin extends Character implements Trapper {
    // Constructor
    public Dustin(String name, int hp) {
        super(name, hp);
    }

    // Metodos
    @Override
    public void action(String target) {
        trap(target);
    }
    @Override
    public void trap(String target) {
        System.out.println(name + " pone TRAMPA a " + target);
    }
    @Override
    public int pointsPerAction() {
        return 1;
    }

    // To String
    @Override
    public String toString() {
        return "Dustin{name='" + name + "', hp=" + hp + "}";
    }
}