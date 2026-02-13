import java.util.Objects;

public class Croisant {
    // ATRIBUTOS
    private String nombre;
    private int id;
    private double precio;
    public enum Alergenos{
        GLUTEN, LACTOSA, FRUTOS_SECOS, HUEVO, SOJA
    }
    public enum Tamanyo{
        S, M, L, XL, XXL
    }
    public enum TipoCroisant{
        DULCE, SALADO, SIN_RELLENO, CHOCOLATE
    }
    private Alergenos alergenos;
    private Tamanyo tamanyo;
    private TipoCroisant tipoCroisant;

    // CONSTRUCTOR
    public Croisant(String nombre) {
        this.nombre = nombre;
    }
    public Croisant(String nombre, int id, double precio, Alergenos alergenos, Tamanyo tamanyo, TipoCroisant tipoCroisant) {
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
        this.alergenos = alergenos;
        this.tamanyo = tamanyo;
        this.tipoCroisant = tipoCroisant;
    }

    // GETTER AND SETTER
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Alergenos getAlergenos() {
        return alergenos;
    }
    public void setAlergenos(Alergenos alergenos) {
        this.alergenos = alergenos;
    }
    public Tamanyo getTamanyo() {
        return tamanyo;
    }
    public void setTamanyo(Tamanyo tamanyo) {
        this.tamanyo = tamanyo;
    }
    public TipoCroisant getTipoCroisant() {
        return tipoCroisant;
    }
    public void setTipoCroisant(TipoCroisant tipoCroisant) {
        this.tipoCroisant = tipoCroisant;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Croisant Croisant)) return false;
        Croisant croisant = (Croisant) o;
        return id == croisant.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    // TO STRING
    @Override
    public String toString() {
        return "Croisant{" +
                "nombre=" + nombre + "" +
        '}';
    }
}