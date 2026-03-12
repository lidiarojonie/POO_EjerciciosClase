import java.time.LocalDate;

public class CuentaFamiliar extends Cuenta{
    // Atributos
    private String nombreTutor1;
    private String nombreTutor2;
    private String nombreInfante1;
    private String nombreInfante2;
    private String nombreInfante3;

    // Constructor
    public CuentaFamiliar(int IBAN, TipoCuenta tipoCuenta, LocalDate fechaApertura, String nombreTutor1, String nombreInfante1) {
        super(IBAN, tipoCuenta, fechaApertura);
        this.nombreTutor1 = nombreTutor1;
        this.nombreInfante1 = nombreInfante1;
    }
}
