package dambi.gamesrestapi.models;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Clase que representa un juego en la aplicación.
 */
@Document(collection = "games")
public class Game {
    
    private int identificator;
    private String title;
    private String release_date;
    private String team;
    private double rating;
    private String times_listed;
    private String number_of_reviews;
    private List<Genre> genres;
    private String summary;
    private List<Review> reviews;
    private String plays;
    private String playing;
    private String backlogs;
    private String wishlist;

    /**
     * Constructor por defecto.
     */
    public Game() {
        
    }

    /**
     * Constructor que inicializa todos los atributos de un juego.
     *
     * @param identificator     Identificador único del juego.
     * @param title             Título del juego.
     * @param release_date      Fecha de lanzamiento del juego.
     * @param team              Equipo de desarrollo del juego.
     * @param rating            Calificación del juego.
     * @param times_listed      Número de veces que se ha listado el juego.
     * @param number_of_reviews Número de reseñas del juego.
     * @param genres            Lista de géneros del juego.
     * @param summary           Resumen del juego.
     * @param reviews           Lista de revisiones del juego.
     * @param plays             Número de veces que se ha jugado el juego.
     * @param playing           Número de personas que están jugando actualmente.
     * @param backlogs          Número de juegos en la lista de espera.
     * @param wishlist          Número de juegos en la lista de deseos.
     */
    public Game(int identificator, String title, String release_date, String team, double rating, String times_listed,
            String number_of_reviews, List<Genre> genres, String summary, List<Review> reviews, String plays,
            String playing, String backlogs, String wishlist) {
        this.identificator = identificator;
        this.title = title;
        this.release_date = release_date;
        this.team = team;
        this.rating = rating;
        this.times_listed = times_listed;
        this.number_of_reviews = number_of_reviews;
        this.genres = genres;
        this.summary = summary;
        this.reviews = reviews;
        this.plays = plays;
        this.playing = playing;
        this.backlogs = backlogs;
        this.wishlist = wishlist;
    }

    
    /** 
     * @return int
     */
    public int getIdentificator() {
        return identificator;
    }

    public void setIdentificator(int identificator) {
        this.identificator = identificator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getTimes_listed() {
        return times_listed;
    }

    public void setTimes_listed(String times_listed) {
        this.times_listed = times_listed;
    }

    public String getNumber_of_reviews() {
        return number_of_reviews;
    }

    public void setNumber_of_reviews(String number_of_reviews) {
        this.number_of_reviews = number_of_reviews;
    }

    public List<Genre> getGenre() {
        return genres;
    }

    public void setGenre(List<Genre> genres) {
        this.genres = genres;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public String getPlays() {
        return plays;
    }

    public void setPlays(String plays) {
        this.plays = plays;
    }

    public String getPlaying() {
        return playing;
    }


    public void setPlaying(String playing) {
        this.playing = playing;
    }

    public String getBacklogs() {
        return backlogs;
    }

    public void setBacklogs(String backlogs) {
        this.backlogs = backlogs;
    }

    public String getWishlist() {
        return wishlist;
    }

    public void setWishlist(String wishlist) {
        this.wishlist = wishlist;
    }


    /**
     * Representación de cadena de la clase.
     *
     * @return Cadena que representa la instancia de la clase.
     */
    @Override
    public String toString() {
        return "Game [identificator=" + identificator + ", title=" + title + ", release_date=" + release_date
                + ", team=" + team + ", rating=" + rating + ", times_listed=" + times_listed + ", number_of_reviews="
                + number_of_reviews + ", genres=" + genres + ", summary=" + summary + ", reviews=" + reviews
                + ", plays=" + plays + ", playing=" + playing + ", backlogs=" + backlogs + ", wishlist=" + wishlist
                + "]";
    }

}