package warhammer;
import java.util.Random;

public class EldarRanger extends UnitBase{
    // Atributos
    private int precision;      // 0-100
    private static final Random rnd = new Random();

    // Constructor
    public EldarRanger(String name, int hp, int precision) {
        super(name, "Aeldari", hp);
        this.precision = clamp(precision, 0, 100);
    }

    // Getter and setter
    public int getPrecision() { return precision; }
    public void setPrecision(int precision) {
        this.precision = precision;
    }

    // Metodos
    @Override
    public int attack() {
        // 20% de crítico si precisión alta
        boolean crit = precision >= 70 && rnd.nextInt(100) < 20;
        return crit ? 22 : 10;
    }
    @Override
    public void battleCry() {
        System.out.println(getName() + ": Silent as the void.");
    }
    private int clamp(int v, int min, int max) {
        return Math.max(min, Math.min(max, v));
    }

    // To String
    @Override
    public String toString() {
        return super.toString() + " EldarRanger{precision=" + precision + "}";
    }
}
