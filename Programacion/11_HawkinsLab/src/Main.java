import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        ArrayList<Fighter> party = new ArrayList<>();

        UUID idEleven = UUID.fromString("00000000-0000-0000-0000-000000000001");
        UUID idSteve  = UUID.fromString("00000000-0000-0000-0000-000000000002");
        UUID idHopper = UUID.fromString("00000000-0000-0000-0000-000000000003");
        UUID idDemo   = UUID.fromString("00000000-0000-0000-0000-000000000004");

        party.add(new Eleven("Eleven", 14, 100, idEleven, Faction.HAWKINS, 1, 80));
        party.add(new Steve("Steve", 17, 110, idSteve, Faction.HAWKINS, 1, 40));
        party.add(new Hopper("Hopper", 42, 130, idHopper, Faction.POLICE, 1, 60));
        party.add(new Demogorgon("Demogorgon", 0, 200, idDemo, Faction.UPSIDEDOWN, 5, 70));

        System.out.println("=== DAMAGE PHASE ===");
        for (Fighter fighter : party) {
            System.out.println(
                    fighter.getName() +
                            " | dmg=" + fighter.atack() +
                            " | role=" + fighter.getRole()
            );
        }

        System.out.println("\n=== SPECIAL SKILLS (NO instanceof) ===");
        for (Fighter fighter : party) {
            fighter.battleCry();

            fighter.specialSkill(); // NUEVO -> polimorfismo real, cero casts, cero instanceof

            // seguimos usando la base común
            ((CharacterBase) fighter).levelUp(); // (este cast solo es para levelUp; si quieres, lo movemos a la interfaz)
        }

        System.out.println("\n=== SHOW CARDS ===");
        CharacterBase.printHeader();
        for (Fighter fighter : party) {
            ((CharacterBase) fighter).showCard();
        }

        System.out.println("\n=== HASHMAP LOOKUP ===");
        HashMap<UUID, Identificable> registry = new HashMap<>();
        for (Fighter fighter : party) {
            registry.put(fighter.getIdPrimaryKey(), fighter);
        }

        Identificable retrieved = registry.get(idDemo);
        System.out.println("Retrieved by UUID:");
        CharacterBase.printHeader();
        ((CharacterBase) retrieved).showCard();

        System.out.println("\n=== BOSS FIGHT ===");
        UUID bossId = UUID.fromString("00000000-0000-0000-0000-000000000999");
        Demogorgon boss = new Demogorgon("MegaDemogorgon", 0, 300, bossId, Faction.UPSIDEDOWN, 10, 120);

        fightBoss(party, boss);

        System.out.println("Boss final card:");
        CharacterBase.printHeader();
        boss.showCard();
    }

    public static void fightBoss(ArrayList<Fighter> party, Demogorgon boss) {
        for (Fighter fighter : party) {
            boss.recieveDmg(fighter.atack());
        }
        System.out.println("Boss remaining HP: " + boss.getHp());
    }
}
