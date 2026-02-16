import java.util.ArrayList;
import java.util.HashMap;

public class Test {
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
        party.add(new Eleven("Eleven", 14, 40, 80, 15));
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
        Eleven e = new Eleven("Eleven", 14, 40, 80, 15);
        /*
        Primero entra en Eleven y luego en CharacterBase
        Se asignan: name, age, hp
         */

        // Tarea 6
        System.out.println("\nTarea 6:");
        Fighter a = new Eleven("Eleven", 14, 40, 80, 15);
        Fighter b = new Steve("Steve", 17, 45, 60);
        System.out.println(a.getName() + " dmg=" + a.attack());
        System.out.println(b.getName() + " dmg=" + b.attack());

        // Tarea 7
        System.out.println("\nTarea 7:");
        ArrayList<Fighter> party2 = new ArrayList<>();
        party2.add(new Eleven("Eleven", 14, 40, 80, 15));
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
        Hopper h1 = new Hopper("Hopper", 42, 60, 90);
        Hopper h2 = new Hopper("Hopper", 42, 10, 20);
        System.out.println("Equals=" + h1.equals(h2));

        // Tarea 10
        System.out.println("\nTarea 10:");
        ArrayList<Fighter> party3 = new ArrayList<>();
        party3.add(new Eleven("Eleven", 14, 40, 80, 15));
        party3.add(new Steve("Steve", 17, 45, 60));
        party3.add(new Hopper("Hopper", 42, 60, 90));
        Demogorgon boss = new Demogorgon("Demogorgon", 0, 70, 70);

        for(Fighter c : party3){
            boss.receiveDamage(c.attack());
            CharacterBase personaje = (CharacterBase)c;
            ((CharacterBase)c).getDanyo();
            boss.receiveDamage(personaje.getDanyo());
            boss.receiveDamage(((CharacterBase)c).getDanyo());

            System.out.println(f.getName() + " hizo daño al demo");
        }

        HashMap<String, CharacterBase> ordPerso = new HashMap<>();
        ArrayList lstSencilla = new ArrayList<CharacterBase>();

        Eleven elevenHashMaps = new Eleven("Eleven", 14, "251564");
        Steve steveHashMaps = new Steve("Steve", 17, "231515");
        Hopper hopperHashMaps = new Hopper("Hopper", 42, "241564");
        Demogorgon demogorgonHashMaps = new Demogorgon("Demogorgon", 42, "211515");

        ordPerso.put(elevenHashMaps.getIdPrimaryKey(), elevenHashMaps);
        ordPerso.put(steveHashMaps.getIdPrimaryKey(), steveHashMaps);
        ordPerso.put(hopperHashMaps.getIdPrimaryKey(), hopperHashMaps);
        ordPerso.put(demogorgonHashMaps.getIdPrimaryKey(), demogorgonHashMaps);

        System.out.println(ordPerso.get("211515").toString());
    }
}
