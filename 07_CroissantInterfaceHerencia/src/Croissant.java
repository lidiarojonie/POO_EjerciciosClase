import java.util.Objects;

public class Croissant {
    // ATRIBUTOS
    private int id;
    private String nombre;
    private double precio;
    private int gramos;

    // CONSTRUCTOR

    public Croissant(int id, String nombre, double precio, int gramos) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.gramos = gramos;
    }

    // GETTER AND SETTER

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getGramos() {
        return gramos;
    }
    public void setGramos(int gramos) {
        this.gramos = gramos;
    }

    // EQUALS
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Croissant croissant)) return false;
        return id == croissant.id && Double.compare(precio, croissant.precio) == 0 && gramos == croissant.gramos && Objects.equals(nombre, croissant.nombre);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, precio, gramos);
    }

    // TO STRING
    @Override
    public String toString() {
        return "Croissant{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", gramos=" + gramos +
                '}';
    }
}
