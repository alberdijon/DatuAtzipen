package dambi.gamesrestapi.models;

import java.util.List;
/**
 * Clase que representa las revisiones de un juego.
 */
public class Review {
    
    // Lista de revisiones.
    private List<String> reviews;

    /**
     * Constructor por defecto.
     */
    public Review() {

    }

    /**
     * Constructor que inicializa la lista de revisiones.
     *
     * @param reviews Lista de revisiones del juego.
     */
    public Review(List<String> reviews) {
        this.reviews = reviews;
    }

    /**
     * Obtiene la lista de revisiones.
     *
     * @return Lista de revisiones del juego.
     */
    public List<String> getReview() {
        return reviews;
    }

    /**
     * Establece la lista de revisiones.
     *
     * @param reviews Nueva lista de revisiones del juego.
     */
    public void setReview(List<String> reviews) {
        this.reviews = reviews;
    }

    /**
     * Representación de cadena de la clase.
     *
     * @return Cadena que representa la instancia de la clase.
     */
    @Override
    public String toString() {
        return "Review [reviews=" + reviews + "]";
    }

}
