import java.time.LocalDate;

public abstract class Cuenta {
    // Atributos
    private int IBAN;
    private TipoCuenta tipoCuenta;
    private LocalDate fechaApertura;
    private int saldoActual;

    // Constructor
    public Cuenta(int IBAN, TipoCuenta tipoCuenta, LocalDate fechaApertura) {
        this.IBAN = IBAN;
        this.tipoCuenta = tipoCuenta;
        this.fechaApertura = fechaApertura;
        this.saldoActual = 0;
    }

    // Metodos
    public void mirarSaldo(){
        System.out.println("Tiene: " + getSaldoActual() + "€");
    }

    // Getter and setter
    public int getSaldoActual() {
        return saldoActual;
    }
    public void setSaldoActual(int saldo) {
        this.saldoActual = saldo;
    }
}
