import java.util.*;

public class HawkinsLabSystem {

    private List<Action> actions = new ArrayList<>();

    public void addAction(Action action) {
        actions.add(action);
    }

    public void handleEvent(String eventType) {
        System.out.println("[HawkinsLab] Event received: " + eventType);

        // OCP y SRP
        // 1) Lógica de negocio + IO + decisiones + todo mezclado
        if (eventType.equalsIgnoreCase("DEMOGORGON")) {
            System.out.println("🚨 Siren ON");
            sendEmail("security@hawkins.com", "DEMOGORGON detected!");
            saveToDatabase("DEMOGORGON detected at " + new Date());
        } else if (eventType.equalsIgnoreCase("MINDFLAYER")) {
            System.out.println("🚨 Siren ON");
            sendSms("+34-600-111-222", "MINDFLAYER alert!");
            saveToDatabase("MINDFLAYER detected at " + new Date());
        } else if (eventType.equalsIgnoreCase("PORTAL_OPEN")) {
            saveToDatabase("PORTAL opened at " + new Date());
            System.out.println("📣 Notify everyone by email + sms");
            sendEmail("all@hawkins.com", "Portal is OPEN!");
            sendSms("+34-600-111-222", "Portal is OPEN!");
        } else {
            System.out.println("🤷 Unknown event, ignoring");
        }
    }

    private void sendEmail(String to, String message) {
        // Simulación: en real usarías SMTP/SendGrid/etc.
        System.out.println("📧 Sending EMAIL to " + to + " -> " + message);
    }

    private void sendSms(String phone, String message) {
        // Simulación: en real Twilio/etc.
        System.out.println("📱 Sending SMS to " + phone + " -> " + message);
    }

    private void saveToDatabase(String record) {
        // Simulación: en real JDBC/ORM
        System.out.println("🗄️ Saving to DB -> " + record);
    }
}
