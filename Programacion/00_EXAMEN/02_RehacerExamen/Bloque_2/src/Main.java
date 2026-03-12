public class Main  {
    public static void main(String[] args) {
        // Crear personajes
        Personaje p1 = new Personaje("Wednesday");
        Personaje p2 = new Personaje("Enid");
        Personaje p3 = new Personaje("Xavier");
        Personaje p4 = new Personaje("Tyler");

        // Enlazar con el siguiente
        p1.siguiente = p2;
        p2.siguiente = p3;
        p3.siguiente = p4;

        // Asignar el primero y el actual
        Personaje primero = p1;
        Personaje actual = p1;

        // Bucle para ver a los personajes
        while(actual != null){
            System.out.println(actual.nombre);
            actual = actual.siguiente;
        }
    }
}