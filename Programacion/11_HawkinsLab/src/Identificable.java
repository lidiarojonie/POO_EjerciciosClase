import java.util.UUID;

public interface Identificable {
    UUID getIdPrimaryKey();
    Role getRole();
}