public class Personaje {
    // Atributos
    String nombre;
    Personaje siguiente;

    // Constructor (siguiente = null por defecto)
    public Personaje(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;
    }
}
