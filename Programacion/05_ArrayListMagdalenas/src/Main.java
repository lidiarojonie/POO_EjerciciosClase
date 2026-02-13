import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> almacenCroisants = new ArrayList<String>();
        ArrayList<Croisant> almacenCroisants1
                = new ArrayList<Croisant>();
        Croisant miCroisant = new Croisant("MANT BOOM!");
        Croisant miCroisant2 = miCroisant;
        miCroisant.equals(miCroisant2);

        // Añadir en el primer almacen
        almacenCroisants.add("Croisant de mantequilla");
        almacenCroisants.add("Croisant de chocolate");
        almacenCroisants.add("Croisant de integral");
        almacenCroisants.add("Croisant de crema");
        almacenCroisants.add("Croisant de york y queso");

        // Añadir en el segundo almacen
        almacenCroisants1.add(new Croisant("CHOCOLATE BOOM", 1, 7.95, Croisant.Alergenos.HUEVO, Croisant.Tamanyo.XL, Croisant.TipoCroisant.CHOCOLATE));
        almacenCroisants1.add(new Croisant("PARIS HOLIDAY", 2, 5.95, Croisant.Alergenos.FRUTOS_SECOS, Croisant.Tamanyo.M, Croisant.TipoCroisant.DULCE));
        almacenCroisants1.add(new Croisant("PARIS CLASSIC", 3, 6.95, Croisant.Alergenos.LACTOSA, Croisant.Tamanyo.L, Croisant.TipoCroisant.SIN_RELLENO));
        almacenCroisants1.add(new Croisant("CROISSANT U2", 4, 5.95, Croisant.Alergenos.SOJA, Croisant.Tamanyo.S, Croisant.TipoCroisant.SALADO));
        almacenCroisants1.add(new Croisant("CROISSANT YORK AND CHEESE", 5, 5.95, Croisant.Alergenos.GLUTEN, Croisant.Tamanyo.M, Croisant.TipoCroisant.SALADO));
        almacenCroisants1.add(new Croisant("CROISSANT ACDC", 6, 8.95, Croisant.Alergenos.HUEVO, Croisant.Tamanyo.XXL, Croisant.TipoCroisant.CHOCOLATE));
        almacenCroisants1.add(new Croisant("CROISSANT SOFIA", 7, 8.95, Croisant.Alergenos.FRUTOS_SECOS, Croisant.Tamanyo.XXL, Croisant.TipoCroisant.CHOCOLATE));
        almacenCroisants1.add(new Croisant("CROISSANT SARA", 8, 5.95, Croisant.Alergenos.GLUTEN, Croisant.Tamanyo.M, Croisant.TipoCroisant.SALADO));
        almacenCroisants1.add(new Croisant("CROISSANT DANIEL", 9, 6.95, Croisant.Alergenos.SOJA, Croisant.Tamanyo.L, Croisant.TipoCroisant.SIN_RELLENO));
        almacenCroisants1.add(new Croisant("CROISSANT MESA", 10, 5.95, Croisant.Alergenos.LACTOSA, Croisant.Tamanyo.S, Croisant.TipoCroisant.CHOCOLATE));

        // Mostrar tamaño almacen y mostrar primer y ultimo croisant
        System.out.println("Total " + almacenCroisants.size());
        System.out.println("Pos 0: " + almacenCroisants.get(0));
        System.out.println("Pos N-1: " +
                almacenCroisants.get(almacenCroisants.size()-1));

        // TIPOS DE FOR
        // Recorrer tradicional
        for (int i = 0; i < almacenCroisants.size(); i++) {
            System.out.println("Croisant[" +  i + "]:"
                    +almacenCroisants.get(i) );
        }
        // Más nuevo y limpio
        for (String croisant: almacenCroisants
        ) {
            System.out.println(croisant);
        }
        for (Croisant croisant1: almacenCroisants1
        ) {
            System.out.println(croisant1.toString());
        }

        // Eliminar Croisants
        almacenCroisants.remove("Croisant de mantequilla");
        almacenCroisants.remove(1);

        // Comprobar si existe en el almacen
        if(almacenCroisants.contains("Croisant de york y queso")){
            System.out.println("Yes");
        }else{
            System.out.println("False. No existe Y AND Q");
        }
        int pos =
                almacenCroisants.indexOf("Croisant de york y queso");
        System.out.println("La posición que ocupe es: " + pos);
        if(almacenCroisants.isEmpty()){
            System.out.println("Está vacía.");
        }else{
            System.out.println("Está con referencias.");
        }

        // Mostrar cuales son de tipo Chocolate del segundo almacen
        for(Croisant croisant : almacenCroisants1){
            if(croisant.getTipoCroisant().equals(Croisant.TipoCroisant.CHOCOLATE)){
                System.out.println("El croisant " + croisant.getNombre().toString() + " lleva chocolate");
            }
        }

        // Filtar cantidad de decimales
        DecimalFormat df = new DecimalFormat("#.##");
        // df.format(numero);

        // Aumentar 20% precio a croissants de CHOCOLATE Y SALADOS
        for(Croisant croisant : almacenCroisants1){
            if(croisant.getTipoCroisant().equals(Croisant.TipoCroisant.CHOCOLATE) || croisant.getTipoCroisant().equals(Croisant.TipoCroisant.SALADO)){
                double precio = croisant.getPrecio();
                precio = precio * 1.2;
                croisant.setPrecio(precio);
                System.out.println("El croisant " + croisant.getNombre().toString() + " ahora vale " + df.format(precio) + "€");
            }
        }

        // Eliminar paris classic
        almacenCroisants1.remove("PARIS CLASSIC");

        for(Croisant croisant : almacenCroisants1){
            System.out.println(croisant.getNombre().toString());
        }
    }
}