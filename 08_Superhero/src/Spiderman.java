import Interfaces.SpidermanActions;

import java.util.Objects;

public class Spiderman extends Superhero implements SpidermanActions {
    // ATRIBUTOS
    private String realName;
    private int age;
    private String suitColor;
    private int webFluidLevel;

    // CONSTRUCTOR DEPENDIENTE PADRE
    public Spiderman(String nombre, int edad, int alturaCm, String realName, int age, String suitColor, int webFluidLevel) {
        super(nombre, edad, alturaCm);
        this.realName = realName;
        this.age = age;
        this.suitColor = suitColor;
        this.webFluidLevel = webFluidLevel;
    }

    public Spiderman(String nombre, int edad, int alturaCm) {
        super(nombre, edad, alturaCm);
    }

    // METODOS
    @Override
    public void defeatVillain() {
        System.out.println(getNombre() + " inmoviliza al villano con una red pegajosa.");
    }
    @Override
    public void saveTheWorld() {
        System.out.println("Vencimos a los enemigos!!!");

    }
    @Override
    public void superpowers() {
        System.out.println("Activando sentido arácnido. Analizando amenazas.");
    }
    @Override
    public void swingfromwebs() {
        System.out.println("Se balancea entre edificios");
    }
    @Override
    public void useWeb(int amount) {
        this.webFluidLevel = this.webFluidLevel - amount;
    }

    // GETTER AND SETTER
    public String getRealName() {
        return realName;
    }
    public void setRealName(String realName) {
        this.realName = realName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSuitColor() {
        return suitColor;
    }
    public void setSuitColor(String suitColor) {
        this.suitColor = suitColor;
    }
    public int getWebFluidLevel() {
        return webFluidLevel;
    }
    public void setWebFluidLevel(int webFluidLevel) {
        this.webFluidLevel = webFluidLevel;
    }

    // EQUALS


    // TO STRING

}
