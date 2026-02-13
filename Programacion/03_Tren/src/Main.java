import maquinaria.Vagones;
import personal.Maquinista;

class Main{
    public static void main(String[] args){
        Maquinista maq =  new Maquinista();
        Maquinista maq2 = new Maquinista("FEDERICO");
        maq.setNombre("RODOLFO");
        System.out.println(maq.getNombre());

        Vagones vagon = new Vagones();
        vagon.setCargaMaxima(100000);
        vagon.setCargaMaxima(50000);



    }
}