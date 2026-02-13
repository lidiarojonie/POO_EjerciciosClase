import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        // Tarea 1
        System.out.println("\nTarea 1:");
        Hopper hopper = new Hopper("Hopper", 42, 60, 90);
        System.out.println(hopper);

        //Tarea 2
        System.out.println("\nTarea 2:");
        Fighter f = new Demogorgon("Demogorgon", 0, 70, 70);
        f.battleCry();
        System.out.println("Attack dmg=" + f.attack());
        Demogorgon d = new Demogorgon("Demogorgon", 0, 70, 70);
        Demogorgon d2 = (Demogorgon)f;

        // Tarea 3
        System.out.println("\nTarea 3:");
        ArrayList<Fighter> party = new ArrayList<>();
        party.add(new Eleven("Eleven", 14, 40, 80));
        party.add(new Steve("Steve", 17, 45, 60));
        party.add(new Hopper("Hopper", 42, 60, 90));
        party.add(new Demogorgon("Demogorgon", 0, 70, 70));

        for(Fighter c : party){
            c.battleCry();
        }

        // Tarea 4
        System.out.println("\nTarea 4:");
        /* ESTÁ YA CREADO EN LA TAREA 2
        Demogorgon d = new Demogorgon("Demogorgon", 0, 70, 70);
        */
        System.out.println("HP=" + d.getHp());
        d.receiveDamage(15);
        System.out.println("HP=" + d.getHp());

        // Tarea 5
        System.out.println("\nTarea 5:");
        Eleven e = new Eleven("Eleven", 14, 40, 80);
        /*
        Primero entra en Eleven y luego en CharacterBase
        Se asignan: name, age, hp
         */

        // Tarea 6
        System.out.println("\nTarea 6:");
        Fighter a = new Eleven("Eleven", 14, 40, 80);
        Fighter b = new Steve("Steve", 17, 45, 60);
        System.out.println(a.getName() + " dmg=" + a.attack());
        System.out.println(b.getName() + " dmg=" + b.attack());

        // Tarea 7
        System.out.println("\nTarea 7:");
        ArrayList<Fighter> party2 = new ArrayList<>();
        party2.add(new Eleven("Eleven", 14, 40, 80));
        party2.add(new Steve("Steve", 17, 45, 60));
        party2.add(new Hopper("Hopper", 42, 60, 90));

        for(Fighter c : party2){
            if (c instanceof Eleven){
                ((Eleven) c).useTelekinesis();
            } else if (c instanceof Steve){
                ((Steve) c).swingBat();
            }
        }

        // Tarea 8
        System.out.println("\nTarea 8:");
        Hopper h = new Hopper("Hopper", 42, 60, 90);
        h.receiveDamage(60);
        System.out.println("Alive=" + h.isAlive());

        // Tarea 9
        System.out.println("\nTarea 9:");


        // Tarea 10
        System.out.println("\nTarea 10:");
        for(Fighter c : party){
            if(c instanceof Demogorgon){

            } else if (c instanceof Eleven){
            } else if(c instanceof Steve){}
        }
    }
}