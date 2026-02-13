import java.util.Objects;

public class Magdalena {
    // ATRIBUTOS
    private String nombre;

    // CONSTRUCTOE
    public Magdalena(String nombre) {
        this.nombre = nombre;
    }

    // GETTER AND SETTER
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // EQUALS AND HASH
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Magdalena magdalena)) return false;
        return Objects.equals(nombre, magdalena.nombre);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    // TO STRING
    @Override
    public String toString() {
        return "Magdalena{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

