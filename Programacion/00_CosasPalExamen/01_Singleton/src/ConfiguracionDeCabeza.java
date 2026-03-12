public class ConfiguracionDeCabeza {
    // Atributos
    private static ConfiguracionDeCabeza instancia;

    // Constructor privado
    private ConfiguracionDeCabeza() {}

    // Metodo getInstance
    public static ConfiguracionDeCabeza getInstance(){
        if(instancia == null){
            instancia = new ConfiguracionDeCabeza();
        }
        return instancia;
    }
}
