package data;

import beans.Magdalena;

public class AlmacenMagdalenas {
    // 1) ATRIBUTOS
    private static final int SIZE = 5;
    private Magdalena[] lstMagdalenas = new Magdalena[SIZE];
    private static int contMagdalenas = -1;

    // 2) CONSTRUCTOR
    /* MEJOR FORMA DE HACERLO
    public AlmacenMagdalenas(Magdalena magdalena) {
        contMagdalenas++;
        this.lstMagdalenas[contMagdalenas] = magdalena;
    }*/

    /*  FORMAS MENOS RECOMENDADAS
    public AlmacenMagdalenas(String nombreMagdalena) {
    }
    public AlmacenMagdalenas() {
    }
    */

    // PARA PODER AÑADIR MÁS DE 1 MAGDALENA SIN CREAR NUEVOS ALMACENES, USAR ESTA FUNCION
    public void addMagdalena(Magdalena miMagdalena) {
        contMagdalenas++;
        this.lstMagdalenas[contMagdalenas] = miMagdalena;
    }
}
