import java.time.LocalDate;

public class Empleado extends Persona{
    // Atributos
    private int numeroEmpleado = 0;
    private Cargo cargo;
    private Departamento departamento;

    // Constructor
    public Empleado(String nombre, String apellidos, String DNI, LocalDate fechaNacimiento) {
        super(nombre, apellidos, DNI, fechaNacimiento);
        this.numeroEmpleado += numeroEmpleado;
    }
    public Empleado(String nombre, String apellidos, String DNI, LocalDate fechaNacimiento, Cargo cargo, Departamento departamento) {
        super(nombre, apellidos, DNI, fechaNacimiento);
        this.numeroEmpleado += numeroEmpleado;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    // Metodos
    public void verMov(Movimientos mov){
        System.out.println(mov.toString());
    }

}
