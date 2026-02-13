import java.util.ArrayList;

public class AlmacenMagdalenas implements MagdalenaInterface{
    // ATRIBUTOS
    private ArrayList<Magdalena> lstMagdalena;

    // CONSTRUCTOR
    public AlmacenMagdalenas() {
        this.lstMagdalena = new ArrayList<>();
    }

    // MÉTODOS
    // Interface
    @Override
    public void add(Magdalena magdalena){
        if(this.lstMagdalena != null){
            this.lstMagdalena.add(magdalena);
        }
    }
    @Override
    public void remove(Magdalena magTemporal){

    }
    @Override
    public void list(){

    }
    @Override
    public void update(Magdalena magdalena){

    }

    // Otros
    public void add(String nombre){
        Magdalena miM = new Magdalena(nombre);
        this.lstMagdalena.add(miM);
        // this.lstMagdalena.add(new Magdalena(nombre));
    }
    public void addListMagdalenas(ArrayList<Magdalena> lista){
        // No machaco, sino que añado tantas magdalenas
        // como items vengan en la lista
    }
    public void remove(String nombre){

    }
    public void removeList(ArrayList<Magdalena> lista){

    }
    public void updateMagdalena(Magdalena magTemporal){
        // 1º) Encontrar la Magdalena a modificar
        for (Magdalena magdalena : this.lstMagdalena) {
            if(magdalena.getNombre().equals(magTemporal.getNombre())){
                magdalena.setNombre(magTemporal.getNombre());
                break;
            }
        }
        // 2º) Settear
    }
    public void printListaMagdalenas(){
        for(Magdalena magdalena : this.lstMagdalena){
            System.out.println(magdalena.toString());
        }
    }

}