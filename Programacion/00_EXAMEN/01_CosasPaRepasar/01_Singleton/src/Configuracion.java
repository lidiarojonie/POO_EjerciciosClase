public class Configuracion {
    // Atributos
    private static Configuracion instancia;

    // Constructor privado
    private Configuracion(){}

    // Metodo getInstance
    public static Configuracion getInstance(){
        if(instancia == null){
            instancia = new Configuracion();
        }
        return instancia;
    }
}
