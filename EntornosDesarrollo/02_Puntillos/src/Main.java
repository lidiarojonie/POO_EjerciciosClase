public class Main {
    public static void main(String[] args) {
        Punto P1 = new Punto();
        Punto3D P2 = new Punto3D();
        Punto3D P3 = new Punto3D(6,5,4);
        P1.setX(4);
        P1.setY(5);

        P2.setX(4);
        P2.setY(5);
        P2.setZ(6);
        System.out.println("He creado el punto ("+P1.getX()+", "+P1.getY()+")");
        System.out.print("He creado el punto ");
        P2.imprime_coordenadas();

        // PRUEBAS POLIGONOS
        // --- CASO 1: TRIÁNGULO VÁLIDO ---
        System.out.println("\n=== TEST TRIÁNGULO ===");
        Punto a = new Punto(0, 0);
        Punto b = new Punto(2, 0);
        Punto c = new Punto(1, 2);

        Segmento s1 = new Segmento(a, b);
        Segmento s2 = new Segmento(b, c);
        Segmento s3 = new Segmento(c, a);

        Triangulo t = new Triangulo("Mi Triángulo", s1, s2, s3);

        if (t.esValido()) {
            System.out.println("Validación: El triángulo es correcto y está cerrado.");
            t.imprimirFormatoEspecial();
        }
        System.out.println();

        // --- CASO 2: CUADRADO VÁLIDO (Subir nota) ---
        System.out.println("=== TEST CUADRADO ===");
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(4, 0);
        Punto p3 = new Punto(4, 4);
        Punto p4 = new Punto(0, 4);

        Segmento lado1 = new Segmento(p1, p2);
        Segmento lado2 = new Segmento(p2, p3);
        Segmento lado3 = new Segmento(p3, p4);
        Segmento lado4 = new Segmento(p4, p1);

        Cuadrado c1 = new Cuadrado("Cubo Mágico", lado1, lado2, lado3, lado4);

        // El constructor de Cuadrado ya debería avisar si los lados son desiguales
        if (c1.esValido()) {
            System.out.println("Validación: El cuadrado es geométricamente válido.");
            c1.imprimirFormatoEspecial();
        }
        System.out.println();

        // --- CASO 3: PENTÁGONO VÁLIDO ---
        System.out.println("=== TEST PENTÁGONO ===");
        Punto pt1 = new Punto(0, 0);
        Punto pt2 = new Punto(2, 0);
        Punto pt3 = new Punto(3, 2);
        Punto pt4 = new Punto(1, 4);
        Punto pt5 = new Punto(-1, 2);

        Segmento seg1 = new Segmento(pt1, pt2);
        Segmento seg2 = new Segmento(pt2, pt3);
        Segmento seg3 = new Segmento(pt3, pt4);
        Segmento seg4 = new Segmento(pt4, pt5);
        Segmento seg5 = new Segmento(pt5, pt1);

        Pentagono pent = new Pentagono("Penta Power", seg1, seg2, seg3, seg4, seg5);

        if (pent.esValido()) {
            System.out.println("Validación: El pentágono es correcto.");
            pent.imprimirFormatoEspecial();
        }

        System.out.println();
        // --- CASO 1: SEGMENTO NULO (Triángulo) ---
        System.out.println("=== ERROR 1: SEGMENTO NULO ===");
        Punto t1 = new Punto(0, 0);
        Punto t2 = new Punto(2, 0);

        Segmento se1 = new Segmento(t1, t2);
        Segmento se2 = null; // Simulamos que un segmento no se inicializó
        Segmento se3 = new Segmento(t2, t1);

        // Al intentar validar, detectará que falta un lado
        Triangulo triNulo = new Triangulo("Triángulo Fantasma", se1, se2, se3);
        if (triNulo.esValido()) {
            triNulo.imprimirFormatoEspecial();
        }
        System.out.println();


        // --- CASO 2: NO CONECTAN (Cuadrado) ---
        System.out.println("=== ERROR 2: PUNTOS NO CONECTADOS ===");
        Punto p10 = new Punto(0, 0);
        Punto p20 = new Punto(4, 0);
        Punto p30 = new Punto(4, 4);
        Punto p40 = new Punto(0, 4);
        Punto pInconexo = new Punto(10, 10); // Un punto que está lejos

        Segmento lado10 = new Segmento(p10, p20);
        Segmento lado20 = new Segmento(p20, p30);
        Segmento lado30 = new Segmento(p30, pInconexo); // El final de este no coincide con el inicio del siguiente
        Segmento lado40 = new Segmento(p40, p10);

        Cuadrado cuadRoto = new Cuadrado("Cuadrado Abierto", lado10, lado20, lado30, lado40);
        if (cuadRoto.esValido()) {
            cuadRoto.imprimirFormatoEspecial();
        }
        System.out.println();


        // --- CASO 3: PENTÁGONO INVÁLIDO (No cierra la figura) ---
        System.out.println("=== ERROR 3: PENTÁGONO QUE NO CIERRA ===");

        // Definimos 5 puntos
        Punto pto1 = new Punto(0, 0);
        Punto pto2 = new Punto(2, 0);
        Punto pto3 = new Punto(3, 2);
        Punto pto4 = new Punto(1, 4);
        Punto pto5 = new Punto(-1, 2);
        Punto ptError = new Punto(10, 10); // Un punto intruso

        // Intentamos montar el pentágono, pero el último segmento se equivoca de destino
        Segmento segt1 = new Segmento(pto1, pto2);
        Segmento segt2 = new Segmento(pto2, pto3);
        Segmento segt3 = new Segmento(pto3, pto4);
        Segmento segt4 = new Segmento(pto4, pto5);
        // ERROR: El último segmento debería ir de pt5 a pt1, pero lo mandamos a ptError
        Segmento segt5 = new Segmento(pto5, ptError);

        Pentagono pentMalo = new Pentagono("Pentágono Abierto", segt1, segt2, segt3, segt4, segt5);

        if (pentMalo.esValido()) {
            pentMalo.imprimirFormatoEspecial();
        }
    }
}