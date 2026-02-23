import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 1) ARRAYLIST de personajes (polimorfismo)
        ArrayList<Character> party = new ArrayList<>();
        party.add(new Eleven("Eleven", 100));
        party.add(new Dustin("Dustin", 90));
        party.add(new Demogorgon("Demogorgon", 150));

        System.out.println("=== 1) LISTA (ArrayList) ===");
        for (Character c : party) {
            System.out.println(c); // toString sobrescrito
        }

        // 2) HASHMAP: acceso rápido por nombre (guardar objetos)
        HashMap<String, Character> byName = new HashMap<>();
        for (Character c : party) {
            byName.put(c.getName(), c);
        }

        System.out.println("\n=== 2) MAP: LECTURA (get) ===");
        Character eleven = byName.get("Eleven");
        System.out.println("Get('Eleven') => " + eleven);

        // 3) MAP: MODIFICACIÓN (put / replace)
        System.out.println("\n=== 3) MAP: MODIFICACIÓN (replace) ===");
        byName.replace("Dustin", new Dustin("Dustin", 95));
        System.out.println("Dustin tras replace => " + byName.get("Dustin"));

        // 4) entrySet: recorrer clave-valor (LECTURA completa)
        System.out.println("\n=== 4) MAP: RECORRIDO (entrySet) ===");
        for (Map.Entry<String, Character> entry : byName.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 5) CAST DE OBJETOS (seguro) para llamar a métodos de interfaz
        System.out.println("\n=== 5) CAST SEGURO (interfaces) ===");
        for (Character c : party) {
            // ojo: esto es para practicar CAST + interfaces
            if (c instanceof Psychic) {
                Psychic p = (Psychic) c; // cast
                p.telekinesis("Vecna");
            }
            if (c instanceof Trapper) {
                Trapper t = (Trapper) c; // cast
                t.trap("Demobats");
            }
        }

        // 6) HashMap de puntos: lectura/modificación simple
        System.out.println("\n=== 6) MAP DE PUNTOS (get/put) ===");
        HashMap<String, Integer> points = new HashMap<>();
        points.put("Eleven", 0);
        points.put("Dustin", 0);
        points.put("Demogorgon", 0);

        // cada uno hace acción y suma puntos
        for (Character c : party) {
            c.action("Objetivo");
            points.put(c.getName(), points.get(c.getName()) + c.pointsPerAction());
        }

        System.out.println("Puntos finales => " + points);

        System.out.println("=== PROYECTO 2: FACTORY + SINGLETON ===");

        // 1) Crear personajes con FACTORY (sin new fuera)
        ArrayList<Character> party2 = new ArrayList<>();
        party2.add(CharacterFactory.create("Eleven", "Eleven"));
        party2.add(CharacterFactory.create("Dustin", "Dustin"));
        party2.add(CharacterFactory.create("Demogorgon", "Demogorgon"));

        // 2) Obtener el marcador único (SINGLETON)
        ScoreBoardSingleton score = ScoreBoardSingleton.getInstance();

        // 3) Registrar a todos en el marcador
        for (Character c : party2) {
            score.register(c.getName());
        }

        // 4) Ejecutar una acción y sumar puntos
        for (Character c : party2) {
            c.action("Vecna");
            score.addPoints(c.getName(), c.pointsPerAction());
        }

        // 5) Mostrar puntos finales (una única fuente de verdad)
        score.print();

        // 6) Prueba didáctica: pedir el singleton otra vez
        // 🔴 Esto NO crea otro marcador: es el mismo
        ScoreBoardSingleton score2 = ScoreBoardSingleton.getInstance();
        System.out.println("¿Mismo objeto? => " + (score == score2));
    }
}