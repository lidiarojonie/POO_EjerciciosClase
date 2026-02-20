public interface Fighter extends Identificable {
    int atack();
    void battleCry();
    String getName();
    void specialSkill(); // NUEVO -> ahora TODOS los Fighters tienen habilidad especial
}