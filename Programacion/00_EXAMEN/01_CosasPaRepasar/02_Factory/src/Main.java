public class Main {
    public static void main(String[] args) {
        // Generar la factory
        AnimalFactory factoria = new AnimalFactory();

        // Crear el primer animal, en este caso PERRO
        Animal miMascota = factoria.crearAnimal(Animales.PERRO);

        // Comprobar si se ha creado correctamente viendo el comportamiento de hablar
        miMascota.hablar();
    }
}
