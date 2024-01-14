package dambi.gamesrestapi.models;

import java.util.List;
/**
 * Clase que representa los géneros de un juego.
 */
public class Genre {
    
    // Lista de géneros.
    private List<String> genre;

    /**
     * Constructor por defecto.
     */
    public Genre() {

    }

    /**
     * Constructor que inicializa la lista de géneros.
     *
     * @param genre Lista de géneros del juego.
     */
    public Genre(List<String> genre) {
        this.genre = genre;
    }

    /**
     * Obtiene la lista de géneros.
     *
     * @return Lista de géneros del juego.
     */
    public List<String> getGenre() {
        return genre;
    }

    /**
     * Establece la lista de géneros.
     *
     * @param genre Nueva lista de géneros del juego.
     */
    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    /**
     * Representación de cadena de la clase.
     *
     * @return Cadena que representa la instancia de la clase.
     */
    @Override
    public String toString() {
        return "Genre [genre=" + genre + "]";
    }

}