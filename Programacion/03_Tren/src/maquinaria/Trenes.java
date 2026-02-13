package maquinaria;
import personal.Maquinista;

public class Trenes {
    //ATRIBUTOS
    private static final int MAX_VAGONES = 5;
    private Locomotora locomotora;
    private Vagones[] lstVagones;
    private Maquinista maquinista;
    private int posLstVagon = 0;

    //CONSTRUCTOR
    public Trenes(Maquinista maquinista, Locomotora locomotora) {
        this.maquinista = maquinista;
        this.locomotora = locomotora;
        this.lstVagones = new Vagones[MAX_VAGONES];
    }
    public void addVagon (Vagones vagonAnadido){
        this.lstVagones[this.posLstVagon] = vagonAnadido;
    }

    //FIN CONSTRUCTOR

    //GETTER AND SETTER
    public Locomotora getLocomotora() {
        return locomotora;
    }
    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }
    public Vagones[] getLstVagones() {
        return lstVagones;
    }
    public void setLstVagones(Vagones[] lstVagones) {
        this.lstVagones = lstVagones;
    }
    public Maquinista getMaquinista() {
        return maquinista;
    }
    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }
}