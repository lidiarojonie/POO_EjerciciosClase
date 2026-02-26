public class Main {
    public static void main(String[] args) {

        HawkinsLabSystem system = new HawkinsLabSystem();

        system.addAction(new SirenAction());
        system.addAction(new EmailAction());

        LabEvent event = new LabEvent(
                "DEMOGORGON",
                "Demogorgon detectado en el laboratorio"
        );

        system.handleEvent(event);
    }
}