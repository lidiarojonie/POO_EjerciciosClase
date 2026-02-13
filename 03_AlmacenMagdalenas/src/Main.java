import beans.Magdalena;
import data.AlmacenMagdalenas;

public class Main {
    public static void main(String[] args) {
        // 1º PILAR FUNDAMENTAL DE LA POO = ENCAPSULACIÓN
        Magdalena miMagdalena1 = new Magdalena("Pistacho Boom!");
        Magdalena miMagdalena2 = new Magdalena("Chocolate Sexy!");
        System.out.println(miMagdalena2.getNombre());
        miMagdalena2.printNombre();

        // Creo mi primer almacen
        AlmacenMagdalenas miAlmacenMagdalenas1 = new AlmacenMagdalenas();
        //
        miAlmacenMagdalenas1.addMagdalena(miMagdalena1);
        miAlmacenMagdalenas1.addMagdalena(miMagdalena2);
        miAlmacenMagdalenas1.addMagdalena(miMagdalena1);
        miAlmacenMagdalenas1.addMagdalena(miMagdalena2);

    }
}