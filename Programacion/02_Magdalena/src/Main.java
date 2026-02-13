public class Main {

    static void imprimirMagdalena(String sabor, String topping, String harina, String size){
        System.out.println("Magdalena de: " + sabor + ", " + topping + ", " + harina + ", " + size);
    }

    public static void main(String[] args) {

        Magdalena magdalena1 = new Magdalena();
        magdalena1.setSaborMagdalena("Vainilla");
        magdalena1.setToppingMagdalena("Virutas");
        magdalena1.setHarinaMagdalena("Harina sin gluten");
        magdalena1.setSizeMagdalena("Grande");
        imprimirMagdalena(magdalena1.sabor, magdalena1.topping, magdalena1.harina, magdalena1.size);

        Magdalena magdalena2 = new Magdalena();
        magdalena2.setSaborMagdalena("Limón");
        magdalena2.setToppingMagdalena("Pistacho");
        magdalena2.setHarinaMagdalena("Harina de avena");
        magdalena2.setSizeMagdalena("Grande");
        imprimirMagdalena(magdalena2.sabor, magdalena2.topping, magdalena2.harina, magdalena2.size);

        Magdalena magdalena3 = new Magdalena();
        magdalena3.setSaborMagdalena("Chocolate");
        magdalena3.setToppingMagdalena("Chispas de chocolate");
        magdalena3.setHarinaMagdalena("Harina de repostería");
        magdalena3.setSizeMagdalena("Pequeña");
        imprimirMagdalena(magdalena3.sabor, magdalena3.topping, magdalena3.harina, magdalena3.size);

        Magdalena magdalena4 = new Magdalena();
        magdalena4.setSaborMagdalena("Avellana");
        magdalena4.setToppingMagdalena("Azucar glass");
        magdalena4.setHarinaMagdalena("Harina de repostería");
        magdalena4.setSizeMagdalena("Mediano");
        imprimirMagdalena(magdalena4.sabor, magdalena4.topping, magdalena4.harina, magdalena4.size);

    }
}