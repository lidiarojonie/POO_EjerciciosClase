package warhammer;

public class OrkBoy extends UnitBase{
    // Atributos
    private int rage;        // 0-100
    private int waaagh;      // contador de gritos/energía

    // Constructor
    public OrkBoy(String name, int hp, int rage) {
        super(name, "Orks", hp);
        this.rage = clamp(rage, 0, 100);
        this.waaagh = 0;
    }

    // Getter and setter
    public int getRage() { return rage; }
    public int getWaaagh() { return waaagh; }
    public void setRage(int rage) {
        this.rage = rage;
    }
    public void setWaaagh(int waaagh) {
        this.waaagh = waaagh;
    }

    // Metodos
    public void getAngrier() {
        rage = clamp(rage + 15, 0, 100);
    }
    @Override
    public int attack() {
        // cuanto más rage, más pega
        return 8 + (rage / 20); // 0..5 extra
    }
    @Override
    public void battleCry() {
        waaagh++;
        System.out.println(getName() + ": WAAAGH!!! (" + waaagh + ")");
        getAngrier();
    }
    private int clamp(int v, int min, int max) {
        return Math.max(min, Math.min(max, v));
    }

    // To String
    @Override
    public String toString() {
        return super.toString() + " OrkBoy{rage=" + rage + ", waaagh=" + waaagh + "}";
    }

}
