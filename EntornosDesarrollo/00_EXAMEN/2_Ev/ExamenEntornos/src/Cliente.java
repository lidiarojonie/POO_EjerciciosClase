import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Persona{
    // Atributos
    private int identificador;
    private LocalDate fechaAlta;
    private ArrayList<Cuenta> cuentasAsociadas;

    // Constructor
    public Cliente(String nombre, String apellidos, String DNI, LocalDate fechaNacimiento) {
        super(nombre, apellidos, DNI, fechaNacimiento);
        this.cuentasAsociadas = new ArrayList<>();
    }

    // Metodos
    public void addCuenta(Cuenta cuenta){
        cuentasAsociadas.add(cuenta);
    }

}
