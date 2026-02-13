public class CroissantChocolate extends Croissant{
    // ATRIBUTOS NUEVOS
    private int porcentajeChocolate;

    // CONSTRUCTOR DEPENDIENTE DE CLASE PADRE
    public CroissantChocolate(int id, String nombre, double precio, int gramos, int porcentajeChocolate) {
        super(id, nombre, precio, gramos);
        this.porcentajeChocolate = porcentajeChocolate;
    }

    // MÉTODOS

    // GETTER AND SETTER
    public int getPorcentajeChocolate() {
        return porcentajeChocolate;
    }
    public void setPorcentajeChocolate(int porcentajeChocolate) {
        this.porcentajeChocolate = porcentajeChocolate;
    }
}
