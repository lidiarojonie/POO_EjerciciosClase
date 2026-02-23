import java.util.HashMap;
import java.util.Map;

public class ScoreBoardSingleton {
    // 🔴 la instancia única (privada)
    private static ScoreBoardSingleton instance;

    // el estado que queremos único en toda la app
    private Map<String, Integer> points = new HashMap<>();

    // 🔴 constructor privado: nadie puede hacer new
    private ScoreBoardSingleton() { }

    // 🔴 metodo público para obtener la única instancia
    public static ScoreBoardSingleton getInstance() {
        if (instance == null) {
            instance = new ScoreBoardSingleton();
        }
        return instance;
    }

    // Métodos simples y claros
    public void register(String name) {
        points.putIfAbsent(name, 0);
    }

    public void addPoints(String name, int amount) {
        points.put(name, points.get(name) + amount);
    }

    public int getPoints(String name) {
        return points.getOrDefault(name, 0);
    }

    public void print() {
        System.out.println("Puntos => " + points);
    }
}