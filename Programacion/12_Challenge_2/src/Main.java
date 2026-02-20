import java.util.ArrayList;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        // Crear ArrayList
        ArrayList<Fighter> party = new ArrayList<>();

        UUID idEleven = UUID.fromString("00000000-0000-0000-0000-000000000001");
        UUID idSteve  = UUID.fromString("00000000-0000-0000-0000-000000000002");
        UUID idHopper = UUID.fromString("00000000-0000-0000-0000-000000000003");
        UUID idDemo   = UUID.fromString("00000000-0000-0000-0000-000000000004");
        UUID idDustin = UUID.fromString("00000000-0000-0000-0000-000000000005");

        party.add(new Eleven("Eleven", 14, 100, idEleven, Faction.HAWKINS, 1, 80));
        party.add(new Steve("Steve", 17, 110, idSteve, Faction.HAWKINS, 1, 40));
        party.add(new Hopper("Hopper", 42, 130, idHopper, Faction.POLICE, 1, 60));
        party.add(new Demogorgon("Demogorgon", 0, 200, idDemo, Faction.UPSIDEDOWN, 5, 70));
        party.add(new Dustin("Dustin", 15, 100, idDustin, Faction.HAWKINS, 1, 40));

        // Crear Boss
        UUID bossId = UUID.fromString("00000000-0000-0000-0000-000000000999");
        Demogorgon boss = new Demogorgon("MegaDemogorgon", 0, 300, bossId, Faction.UPSIDEDOWN, 10, 120);

        // Fase turnos
        System.out.println("\n=== TURN PHASE (performTurn)===");

        for (Fighter f : party) {
            // Cast seguro
            CharacterBase attacker = (CharacterBase) f;

            // Polimorfismo real
            attacker.performTurn(boss);

            // Corte si el boss muere
            if (boss.getHp() <= 0){
                System.out.println("BOSS DOWN!");
                break;
            }
        }

        // Intento ArrayList sin ArrayList
        UUID idEleven2 = UUID.fromString("00000000-0000-0000-0000-000000000006");
        UUID idSteve2  = UUID.fromString("00000000-0000-0000-0000-000000000007");
        UUID idHopper2 = UUID.fromString("00000000-0000-0000-0000-000000000008");
        UUID idDemo2   = UUID.fromString("00000000-0000-0000-0000-000000000009");
        UUID idDustin2 = UUID.fromString("00000000-0000-0000-0000-000000000010");

        Eleven eleven = new Eleven("Eleven", 14, 100, idEleven2, Faction.HAWKINS, 1, 80);
        Steve steve = new Steve("Steve", 17, 110, idSteve2, Faction.HAWKINS, 1, 40);
        Hopper hopper = new Hopper("Hopper", 42, 130, idHopper2, Faction.POLICE, 1, 60);
        Demogorgon demogorgon = new Demogorgon("Demogorgon", 0, 200, idDemo2, Faction.UPSIDEDOWN, 5, 70);
        Dustin dustin = new Dustin("Dustin", 15, 100, idDustin2, Faction.HAWKINS, 1, 40);

        eleven.setNext(steve);
        steve.setNext(hopper);
        hopper.setNext(demogorgon);
        demogorgon.setNext(dustin);

        CharacterBase current = eleven;

        // Recorremos la lista sin saber cuántos hay
        while (current != null) {
            System.out.println("Personaje: " + current.getName());
            current = current.getNext(); // Saltamos al siguiente eslabón
        }
    }
}