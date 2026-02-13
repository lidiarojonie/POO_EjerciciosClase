import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    // Funcion para automatizar la creación de lavadoras
    public static Lavadora CrearLavadora() {
        System.out.println("Ingrese la marca, el modelo, la potencia y la capacidad máxima SEPARADO POR COMAS");

        String input = sc.nextLine();
        String[] datos = input.split(",");

        String marca = datos[0].trim();
        String modelo = datos[1].trim();
        int potencia = Integer.parseInt(datos[2].trim());
        int capacidad = Integer.parseInt(datos[3].trim());

        Lavadora miLavadora = new Lavadora(marca, modelo, potencia, capacidad);

        System.out.println("Lavadora creada con éxito.");

        return miLavadora;
    }

    // Funcion para las acciones
    public static void funcionesDisponibles(){
        Lavadora miLavadora = CrearLavadora();
        boolean proceso = true;

        do{
            System.out.println("Bienvenido a la LavadoraExpress. Seleccione el número de la opetación que desea realizar: \n" +
                    "1. Encender la lavadora\n" +
                    "2. Apagar la lavadora\n" +
                    "3. Abrir la puerta\n" +
                    "4. Cerrar la puerta\n" +
                    "5. Introducir ropa\n" +
                    "6. Sacar ropa\n" +
                    "7. Programar\n" +
                    "8. Plan de lavado\n" +
                    "9. Abrir cajetin\n" +
                    "10. Cerrar cajetin\n" +
                    "11. Lavar\n" +
                    "12. Cenrtifugar\n" +
                    "13. Poner jabón" +
                    "0. Salir.");

            switch (sc.nextInt()) {
                case 1:
                    miLavadora.encenderLavadora();
                    break;
                case 2:
                    miLavadora.apagarLavadora();
                    break;
                case 3:
                    miLavadora.abrirPuerta();
                    break;
                case 4:
                    miLavadora.cerrarPuerta();
                    break;
                case 5:
                    System.out.println("Introduzca el peso de la ropa: ");
                    int peso = sc.nextInt();
                    miLavadora.introducirRopa(peso);
                    break;
                case 6:
                    miLavadora.sacarRopa();
                    break;
                case 7:
                    System.out.println("Introduzca el tiempo de duración del lavado: ");
                    int duracion = sc.nextInt();
                    miLavadora.programar(duracion);
                    break;
                case 8:
                    /*System.out.println("Introduzca el plan de lavado a usar (ECO, CORTO, ROPA_COLOR, FRIO): ");
                    String planLav = sc.nextLine();
                    miLavadora.planDeLavado(planLav);
                    break;*/
                case 9:
                    miLavadora.abrirCajetin();
                    break;
                case 10:
                    miLavadora.cerrarCajetin();
                    break;
                case 11:
                    miLavadora.lavar();
                    break;
                case 12:
                    miLavadora.centrifugar();
                    break;
                case 13:
                    System.out.println("Introduzca la cantidad de jabón que va a depositar: ");
                    int jabon = sc.nextInt();
                    miLavadora.ponerJabon(jabon);
                    break;
                case 0:
                    proceso = false;
                    break;
            }
        }while(proceso);
    }

    // MAIN
    public static void main(String[] args) {
        funcionesDisponibles();
    }
}