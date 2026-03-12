import java.util.ArrayList;
import java.util.HashMap;

public class Main  {
    public static void main(String[] args) {
        // Crear el catalogo (8 en total)
        ArrayList<ContenidoBase> catalogos = new ArrayList<>();
        catalogos.add(ContenidoFactory.crear(TipoContenido.DOCUMENTALES, "0001", "Viaje al centro de la tierra", 7, Calidad.HD));
        catalogos.add(ContenidoFactory.crear(TipoContenido.SERIE, "0002", "Miercoles", 7, Calidad.HD));
        catalogos.add(ContenidoFactory.crear(TipoContenido.PELICULAS, "0003", "Shazam", 18, Calidad.UHD));
        catalogos.add(ContenidoFactory.crear(TipoContenido.DOCUMENTALES, "0004", "La sabana africana", 7, Calidad.SD));
        catalogos.add(ContenidoFactory.crear(TipoContenido.SERIE, "0005", "One Piece", 7, Calidad.UHD));
        catalogos.add(ContenidoFactory.crear(TipoContenido.PELICULAS, "0006", "Harry Potter", 7, Calidad.HD));
        catalogos.add(ContenidoFactory.crear(TipoContenido.SERIE, "0007", "Shingeki no kyojin", 18, Calidad.HD));
        catalogos.add(ContenidoFactory.crear(TipoContenido.DOCUMENTALES, "0008", "La sabana africana a fondo", 7, Calidad.SD));

        // Metricas
        HashMap<String, Integer> reproducciones = new HashMap<>();
        reproducciones.put("0001", 3);
        reproducciones.put("0002", 2);
        reproducciones.put("0003", 7);
        reproducciones.put("0004", 4);

        // Recorrer el catalogo
        for (ContenidoBase catalogo : catalogos) {
            catalogo.reproducir();
        }

        // Recorrer el catalogo capas extra
        for (ContenidoBase catalogo : catalogos) {
            if(catalogo instanceof Pelicula ) {
                ((Pelicula) catalogo).descargar();
                ((Pelicula) catalogo).bonus();
            }
        }






    }
}