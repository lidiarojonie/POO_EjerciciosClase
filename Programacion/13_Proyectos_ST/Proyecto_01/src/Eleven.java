public class Eleven extends Character implements Psychic {

    public Eleven(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void action(String target) {
        telekinesis(target);
    }

    @Override
    public void telekinesis(String target) {
        System.out.println(name + " usa TELEKINESIS sobre " + target);
    }

    @Override
    public int pointsPerAction() {
        return 2;
    }

    @Override
    public String toString() {
        return "Eleven{name='" + name + "', hp=" + hp + "}";
    }
}