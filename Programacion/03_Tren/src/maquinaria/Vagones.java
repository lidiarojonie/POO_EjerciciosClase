package maquinaria;

public class Vagones {
    public enum TipoMercancia{
        PASAJERO,
        MADERA,
        PRODUCTOS_QUIMICOS
    }

    //ATRIBUTOS
    private int cargaMaxima;
    private int capacidadActual;
    private TipoMercancia tipoMercancia;

    //CONSTRUCTOR
    public Vagones() {

    }
    //FIN CONSTRUCTOR

    //GETTER AND SETTER
    public int getCargaMaxima() {
        return cargaMaxima;
    }
    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
    public int getCapacidadActual() {
        return capacidadActual;
    }
    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    public TipoMercancia getTipoMercancia() {
        return tipoMercancia;
    }
    public void setTipoMercancia(TipoMercancia mercancia) {
        this.tipoMercancia = mercancia;
    }

    @Override
    public String toString() {
        return "Vagones{" +
                "cargaMaxima=" + cargaMaxima +
                ", capacidadActual=" + capacidadActual +
                ", tipoMercancia='" + tipoMercancia + '\'' +
                '}';
    }
}