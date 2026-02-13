package maquinaria;
import personal.Mecanico;

public class Locomotora {
    //ATRIBUTOS
    private String matricula;
    private int potenciaMotor;
    private int anyoFabricacion;
    private Mecanico mecanico;

    //CONSTRUCTOR
    public Locomotora(Mecanico mecanico, String matricula, int potenciaMotor, int anyoFabricacion) {
        this.mecanico = mecanico;
        this.matricula = matricula;
        this.potenciaMotor = potenciaMotor;
        this.anyoFabricacion = anyoFabricacion;
    }
    //FIN CONSTRUCTOR

    //GETTER AND SETTER
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getPotenciaMotor() {
        return potenciaMotor;
    }
    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }
    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }
    public void setAnyoFabricacion(int anyoFabricacion) {
        this.anyoFabricacion = anyoFabricacion;
    }
    public Mecanico getMecanico() {
        return mecanico;
    }
    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }
}