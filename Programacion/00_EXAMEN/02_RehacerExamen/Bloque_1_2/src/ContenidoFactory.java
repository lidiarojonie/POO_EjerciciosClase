public class ContenidoFactory {
    public static ContenidoBase crear(TipoContenido nombreObjeto, String id, String titulo, int edadMinima, Calidad calidad) {
        if(nombreObjeto.equals((TipoContenido.DOCUMENTALES))) return new Documental(id, titulo, edadMinima, calidad);
        if(nombreObjeto.equals((TipoContenido.SERIE))) return new Serie(id, titulo, edadMinima, calidad);
        if(nombreObjeto.equals((TipoContenido.PELICULAS))) return new Pelicula(id, titulo, edadMinima, calidad);
        return null;
    }


}
