import java.util.Objects;

public abstract class Persona {
    // Atributos
    private String nombre;
    private String apellidos;
    private Genero genero;
    private String fecha_nacimiento;
    private int telefono;
    private String direccion;

    // Constructor
    public Persona(String nombre, String apellidos, Genero genero, String fecha_nacimiento, int telefono, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Metodos

    // Getter and Setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // To String
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", genero=" + genero +
                ", fecha_nacimiento='" + fecha_nacimiento + '\'' +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    // Equals
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Persona persona)) return false;
        return telefono == persona.telefono && Objects.equals(nombre, persona.nombre) && Objects.equals(apellidos, persona.apellidos) && genero == persona.genero && Objects.equals(fecha_nacimiento, persona.fecha_nacimiento) && Objects.equals(direccion, persona.direccion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, genero, fecha_nacimiento, telefono, direccion);
    }
}
