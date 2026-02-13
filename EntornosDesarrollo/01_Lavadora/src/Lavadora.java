import java.util.Objects;

public class Lavadora {
    // ATRIBUTOS
    private String marca;
    private String modelo;
    private int capacidad_max;
    private int capacidad_actual;
    private boolean puerta_abierta;
    private String estado;
    private boolean jabon_cargado;
    private int duracion;
    private boolean llena;
    private boolean encendido;
    private boolean detergente;
    private int cantidadDetergente;
    private boolean cajetin;
    private enum planes {ECO, CORTO, ROPA_COLOR, FRIO}
    private planes plan;
    private int potencia;
    private boolean lavando;

    // CONTRUCTOR
    public Lavadora() {
        this.capacidad_actual = 0;
        this.puerta_abierta = false;
        this.llena = false;
        this.encendido = false;
        this.detergente = false;
        this.cajetin = false;
        this.lavando = false;
    }
    public Lavadora(String marca, String modelo, int potencia, int capacidad_max) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.capacidad_max = capacidad_max;
        this.capacidad_actual = 0;
        this.puerta_abierta = false;
        this.llena = false;
        this.encendido = false;
        this.detergente = false;
        this.cantidadDetergente = 0;
        this.cajetin = false;
        this.lavando = false;
    }

    // METODOS
    public void abrirPuerta(){
        // Comprobar q no está ya abierta la puerta o no está lavando actualmente la lavadora. Sino, abrir puerta
        if(!puerta_abierta){
            if(!lavando){
                puerta_abierta = true;
                System.out.println("Puerta abierta!!");
            } else{
                System.out.println("ERROR!!! La lavadora está lavando y no se puede abrir la puerta");
            }
        } else{
            System.out.println("La puerta ya está abierta!!!");
        }

    }
    public void cerrarPuerta(){
        if(puerta_abierta){
            puerta_abierta = false;
            System.out.println("Puerta cerrada!!!");
        }else{
            System.out.println("La puerta ya estaba cerrada!!!");
        }
    }
    public boolean verPuerta(){
        return puerta_abierta;
    }
    public void introducirRopa(int peso){
        if((verPuerta()) && ((peso + capacidad_actual) <= capacidad_max)){
            this.capacidad_actual =  peso + capacidad_actual;
            this.llena = true;
            System.out.println("Ropa!!!");
        } else if (!verPuerta()){
            System.out.println("La puerta está cerrada. No puede introducir ropa");
        } else {
            System.out.println("El peso excede la capacidad máxima de la lavadora");
        }
    }
    public void programar(int duracion){
        if(!encendido){
            System.out.println("Lavadora apagada. Enciende la lavadora primero.");
        } else{
            this.duracion = duracion;
            System.out.println("Lavadora programada para "+ duracion + " minutos.");
        }
    }
    public void lavar(){
        if(encendido){
            if(!lavando){
                this.lavando = true;
                System.out.println("Lavadora lavando!!!");
            } else{
                System.out.println("La lavadora ya está lavando.");
            }
        } else{
            System.out.println("La lavadora está apagada. Enciende la lavadora primero.");
        }
    }
    public void ponerJabon(int cantidadJabon){
        if(((cantidadJabon + cantidadDetergente) <= cantidadDetergente) && cajetin){
            this.cantidadDetergente = cantidadJabon + cantidadDetergente;
            System.out.println("Detergente cargado correctamente!!!");
        } else if (!cajetin) {
            System.out.println("El cajetin está cerrado.");
        } else{
            System.out.println("No puedes poner tanto detergente");
        }
    }
    public void encenderLavadora(){
        if(!encendido){
            this.encendido = true;
            System.out.println("Lavadora encendida!!!");
        } else{
            System.out.println("Ya está encendida la lavadora.");
        }
    }
    /*public void planDeLavado(String plan){
        this.plan = plan;
        System.out.println("Plan de lavado configurado a: " + plan);
    }*/
    public void abrirCajetin(){
        if(!cajetin){
            this.cajetin = true;
            System.out.println("Cajetin abierto!!");
        } else{
            System.out.println("Ya está abierto el cajetin");
        }
    }
    public void cerrarCajetin(){
        if(cajetin){
            this.cajetin = false;
            System.out.println("Cajetin cerrado.");
        } else{
            System.out.println("El cajetin ya está cerrado");
        }
    }
    public void centrifugar(){
        if(lavando){
            this.potencia = potencia * 3;
            System.out.println("Lavadora centrifugando!!!\nPotencia subida a " +  potencia);
            programar(10);
            System.out.println("Lavadora centrifugando. Espere 10 minutos.");
            this.potencia = 0;
            pitar();
            System.out.println("Centrifugado terminado");
        } else{
            System.out.println("Inicie el lavado para poder centrifugar.");
        }
    }
    public void pitar(){
        System.out.println("PI!! PI!! PI!! PI!! \nLavado finalizado!!!!");
    }
    public void apagarLavadora(){
        if(encendido && !lavando){
            this.encendido = false;
        }
    }
    public void sacarRopa(){
        if(!lavando){
            if(!verPuerta()){
                System.out.println("Está la puerta cerrada.");
            } else{
                this.llena = false;
                this.capacidad_actual = 0;
            }
        }
    }

    // GETTER AND SETTER
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getCapacidad_max() {
        return capacidad_max;
    }
    public void setCapacidad_max(int capacidad_max) {
        this.capacidad_max = capacidad_max;
    }
    public int getCapacidad_actual() {
        return capacidad_actual;
    }
    public void setCapacidad_actual(int capacidad_actual) {
        this.capacidad_actual = capacidad_actual;
    }
    public boolean isPuerta_abierta() {
        return puerta_abierta;
    }
    public void setPuerta_abierta(boolean puerta_abierta) {
        this.puerta_abierta = puerta_abierta;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public boolean isJabon_cargado() {
        return jabon_cargado;
    }
    public void setJabon_cargado(boolean jabon_cargado) {
        this.jabon_cargado = jabon_cargado;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public boolean isLlena() {
        return llena;
    }
    public void setLlena(boolean llena) {
        this.llena = llena;
    }
    public boolean isEncendido() {
        return encendido;
    }
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    public boolean isDetergente() {
        return detergente;
    }
    public void setDetergente(boolean detergente) {
        this.detergente = detergente;
    }
    public boolean isCajetin() {
        return cajetin;
    }
    public int getCantidadDetergente(){
        return cantidadDetergente;
    }
    public void setCantidadDetergente(int cantidadDetergente){
        this.cantidadDetergente = cantidadDetergente;
    }
    public void setCajetin(boolean cajetin) {
        this.cajetin = cajetin;
    }
    public planes getPlan() {
        return plan;
    }
    public void setPlan(planes plan) {
        this.plan = plan;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public boolean isLavando() {
        return lavando;
    }
    public void setLavando(boolean lavando) {
        this.lavando = lavando;
    }

    // EQUALS
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Lavadora lavadora)) return false;
        return capacidad_max == lavadora.capacidad_max && capacidad_actual == lavadora.capacidad_actual && puerta_abierta == lavadora.puerta_abierta && jabon_cargado == lavadora.jabon_cargado && duracion == lavadora.duracion && llena == lavadora.llena && encendido == lavadora.encendido && detergente == lavadora.detergente && cantidadDetergente == lavadora.cantidadDetergente && cajetin == lavadora.cajetin && potencia == lavadora.potencia && lavando == lavadora.lavando && Objects.equals(marca, lavadora.marca) && Objects.equals(modelo, lavadora.modelo) && Objects.equals(estado, lavadora.estado) && plan == lavadora.plan;
    }
    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, capacidad_max, capacidad_actual, puerta_abierta, estado, jabon_cargado, duracion, llena, encendido, detergente, cantidadDetergente, cajetin, plan, potencia, lavando);
    }

    // TO STRING
    @Override
    public String toString() {
        return "Lavadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidad_max=" + capacidad_max +
                ", capacidad_actual=" + capacidad_actual +
                ", puerta_abierta=" + puerta_abierta +
                ", estado='" + estado + '\'' +
                ", jabon_cargado=" + jabon_cargado +
                ", duracion=" + duracion +
                ", llena=" + llena +
                ", encendido=" + encendido +
                ", detergente=" + detergente +
                ", cantidadDetergente=" + cantidadDetergente +
                ", cajetin=" + cajetin +
                ", plan=" + plan +
                ", potencia=" + potencia +
                ", lavando=" + lavando +
                '}';
    }
}