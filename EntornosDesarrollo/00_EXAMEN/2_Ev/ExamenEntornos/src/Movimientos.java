import java.time.LocalDate;

public class Movimientos {
    // Atributos
    private int codigoMovimiento;
    private LocalDate fechaMovimiento;
    private String concepto;
    private Transaccion tipoTransaccion;
    private int importe;

    // Constructor
    public Movimientos(int codigoMovimiento, LocalDate fechaMovimiento, String concepto, Transaccion tipoTransaccion, int importe) {
        this.codigoMovimiento = codigoMovimiento;
        this.fechaMovimiento = fechaMovimiento;
        this.concepto = concepto;
        this.tipoTransaccion = tipoTransaccion;
        this.importe = importe;
    }

    // Metodos
    public void hacerMovimiento(Cuenta cuenta){
        if(getTipoTransaccion().equals(Transaccion.METER)){
            int saldoNuevo = cuenta.getSaldoActual();
            saldoNuevo += getImporte();
            cuenta.setSaldoActual(saldoNuevo);
        } else if(getTipoTransaccion().equals(Transaccion.SACAR)){
            int saldoNuevo = cuenta.getSaldoActual();
            if(saldoNuevo - getImporte() >= 0){
                saldoNuevo -= getImporte();
                cuenta.setSaldoActual(saldoNuevo);
            } else{
                System.out.println("No hay fondos suficientes.");
            }
        }
    }

    // Getter and setter
    public Transaccion getTipoTransaccion() {
        return tipoTransaccion;
    }
    public int getImporte() {
        return importe;
    }

    // ToString
    @Override
    public String toString() {
        return "Movimientos{" +
                "codigoMovimiento=" + codigoMovimiento +
                ", fechaMovimiento=" + fechaMovimiento +
                ", concepto='" + concepto + '\'' +
                ", tipoTransaccion=" + tipoTransaccion +
                ", importe=" + importe +
                '}';
    }
}
