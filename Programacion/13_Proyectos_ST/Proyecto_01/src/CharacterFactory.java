
public class CharacterFactory {
    // 🔴 Factory: crea el objeto por ti
    public static Character create(String type, String name) {

        // Normalizamos para evitar fallos por mayúsculas/minúsculas
        String t = type.toUpperCase();

        if (t.equals("ELEVEN")) {
            return new Eleven(name, 100);
        }
        if (t.equals("DUSTIN")) {
            return new Dustin(name, 90);
        }
        if (t.equals("DEMOGORGON")) {
            return new Demogorgon(name, 150);
        }

        throw new IllegalArgumentException("Tipo no soportado: " + type);
    }
}
