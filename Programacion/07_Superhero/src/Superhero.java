import Interfaces.SuperheroActions;

import java.util.Objects;

public class Superhero implements SuperheroActions {
    // ATRIBUTOS
    private String nombre;
    private int edad;
    private int alturaCm;

    // CONSTRUCTOR PADRE

    public Superhero(String nombre, int edad, int alturaCm) {
        this.nombre = nombre;
        this.edad = edad;
        this.alturaCm = alturaCm;
    }

    // METODOS
    @Override
    public void defeatVillain() {

    }
    @Override
    public void saveTheWorld() {

    }
    @Override
    public void superpowers() {

    }

    // GETTER AND SETTER
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getAlturaCm() {
        return alturaCm;
    }
    public void setAlturaCm(int alturaCm) {
        this.alturaCm = alturaCm;
    }

    // EQUALS
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Superhero superhero)) return false;
        return edad == superhero.edad && alturaCm == superhero.alturaCm && Objects.equals(nombre, superhero.nombre);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, alturaCm);
    }

    // TO STRING
    @Override
    public String toString() {
        return "Superhero{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", alturaCm=" + alturaCm +
                '}';
    }
}
