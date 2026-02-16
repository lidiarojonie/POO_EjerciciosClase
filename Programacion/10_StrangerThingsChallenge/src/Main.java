import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Fighter> fighters = new ArrayList<>();
        fighters.add(new Eleven("Eleven", 14, 40, "1548547", "HAWKINGS", 20, "HERO", 80, 100));
        fighters.add(new Hopper("Hopper", 46, 50, "4891919", "POLICE", 30, "HERO", 20, 22));
        fighters.add(new Steve("Steve", 20, 35, "4851635", "HAWKINGS", 12, "HERO",34, 15));
        fighters.add(new Demogorgon("Demogorgon", 140, 100, "8475632", "UPSIDEDOWN", 60, "HERO", 75, 105));

        for(Fighter c : fighters){
            System.out.println(c.getName() + ", " +  c.attack() + ", " + c.getRole() + ".");
        }
        System.out.println();

        for(Fighter c : fighters){
            if (c instanceof Eleven el) {
                System.out.println("*****Eleven attack*****");
                el.useTelekinesis();
            } else if (c instanceof Steve st) {
                System.out.println("*****Steve attack*****");
                st.swingBat();
            }
            c.battleCry();
            System.out.println();
        }
    }
}
