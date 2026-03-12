import java.time.LocalDate;

public class CuentaInfantil extends Cuenta{
    // Atributos
    private String nombreTutor;
    private String nombreInfante;

    // Constructor
    public CuentaInfantil(int IBAN, TipoCuenta tipoCuenta, LocalDate fechaApertura) {
        super(IBAN, tipoCuenta, fechaApertura);
    }





}
