import java.awt.event.ActionListener;

public class LabEvent implements Action {
    private final String type;
    private final String message;

    public LabEvent(String type, String message) {
        this.type = type;
        this.message = message;
    }
    public String getType() { return type; }
    public String getMessage() { return message; }

    @Override
    public void SirenAction() {

    }

    @Override
    public void EmailAction() {

    }

    @Override
    public void SmsAction() {

    }

    @Override
    public void DatabaseLogAction() {

    }
}