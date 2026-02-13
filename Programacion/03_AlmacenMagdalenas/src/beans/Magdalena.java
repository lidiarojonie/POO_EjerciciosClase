package beans;

public class Magdalena {
    // 1) ATRIBUTOS
    private int id;
    private String nombre;
    private double precio;
    private boolean hasChocolate;

    // 2) CONSTRUCTOR/ES
        // 2.1) CONSTRUCTOR VACIO
    public Magdalena(){

    }
    public Magdalena(String nombre){
        // El this hace referencia a la variable nombre, mientras que sin el this es el atributo que le paso
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void printNombre() {
        System.out.println(this.nombre);
    }

    // 3) METODOS (FUNCIONES/PROCEDIMIENTOS)
        // 3.1) GETTER/SETTER

    // fin
}
