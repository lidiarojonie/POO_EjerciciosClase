import Interfaces.IronmanActions;

import java.util.Objects;

public class Ironman
    extends Superhero
    implements IronmanActions{
    // ATRIBUTOS
    private int nivelEnergia;

    // CONSTRUCTOR DEPENDIENTE PADRE
    public Ironman(String nombre, int edad, int alturaCm, int nivelEnergia) {
        super(nombre, edad, alturaCm);
        this.nivelEnergia = nivelEnergia;
    }

    // METODOS
    @Override
    public void useRepulsorBlasts() {

    }
    @Override
    public void fly() {

    }

    // GETTER AND SETTER
    public int getNivelEnergia() {
        return nivelEnergia;
    }
    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    // EQUALS
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Ironman ironman)) return false;
        if (!super.equals(o)) return false;
        return nivelEnergia == ironman.nivelEnergia;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nivelEnergia);
    }

    // TO STRING
    @Override
    public String toString() {
        return "Ironman{" +
                "nivelEnergia=" + nivelEnergia +
                "} " + super.toString();
    }
}
