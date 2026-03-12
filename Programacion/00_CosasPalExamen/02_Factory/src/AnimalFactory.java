public class AnimalFactory {
    public Animal crearAnimal(Animales tipo){
        if(tipo.equals(Animales.PERRO)) return new Perro();
        if(tipo.equals(Animales.GATO)) return new Gato();
        return null;
    }
}
