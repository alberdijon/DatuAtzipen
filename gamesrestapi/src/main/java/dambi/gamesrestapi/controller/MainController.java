package dambi.gamesrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import dambi.gamesrestapi.models.Game;
import dambi.gamesrestapi.models.GameRepository;
import dambi.gamesrestapi.models.Genre;
import dambi.gamesrestapi.models.Review;
/**
 * Controlador principal que gestiona las operaciones CRUD para la entidad Game.
 */
@RestController
@RequestMapping(path = "/games")
public class MainController {
    
    @Autowired
    private GameRepository gameRepository;

    /**
     * Obtiene todos los juegos disponibles.
     *
     * @return Iterable<Game> que contiene todos los juegos.
     */
    @GetMapping(path = "/jokuguztiak")
    public @ResponseBody Iterable<Game> getGames() {
        return gameRepository.findAll();
    }

    /**
     * Busca un juego por su identificador.
     *
     * @param identificator El identificador del juego a buscar.
     * @return Game que coincide con el identificador proporcionado.
     */
    @GetMapping(path = "/jokoabilatu")
    public @ResponseBody Game findGame(@RequestParam int identificator) {
        return gameRepository.findById(identificator);
    }

    /**
     * Añade un nuevo juego a la base de datos.
     *
     * @param indetificator     El identificador único del juego.
     * @param title             El título del juego.
     * @param release_date      La fecha de lanzamiento del juego.
     * @param team              El equipo de desarrollo del juego.
     * @param rating            La calificación del juego.
     * @param times_listed      El número de veces que se ha listado el juego.
     * @param number_of_reviews El número de reseñas del juego.
     * @param genre             Lista de géneros del juego.
     * @param summary           El resumen del juego.
     * @param reviews           Lista de reseñas del juego.
     * @param plays             El número de veces que se ha jugado el juego.
     * @param playing           El número de personas que están jugando actualmente.
     * @param backlogs          El número de juegos en la lista de espera.
     * @param wishlist          El número de juegos en la lista de deseos.
     * @return Mensaje indicando si el juego se ha añadido correctamente.
     */
    @PostMapping(value = "/jokuberria")
    public @ResponseBody String jokuBerriaGehitu(
            @RequestParam int indetificator, @RequestParam String title, @RequestParam String release_date,
            @RequestParam String team, @RequestParam double rating, @RequestParam String times_listed,
            @RequestParam String number_of_reviews, @RequestBody List<Genre> genre, @RequestParam String summary,
            @RequestBody List<Review> reviews, @RequestParam String plays, @RequestParam String playing,
            @RequestParam String backlogs, @RequestParam String wishlist) {

        Game g = new Game();
        // Configurar los atributos del nuevo juego.
        g.setIdentificator(indetificator);
        g.setTitle(title);
        g.setRelease_date(release_date);
        g.setTeam(team);
        g.setRating(rating);
        g.setTimes_listed(times_listed);
        g.setNumber_of_reviews(number_of_reviews);
        g.setGenre(genre);
        g.setSummary(summary);
        g.setReviews(reviews);
        g.setPlays(plays);
        g.setPlaying(playing);
        g.setBacklogs(backlogs);
        g.setWishlist(wishlist);
        gameRepository.save(g);
        return "Jokua era egokian gehitu da";
    }

    /**
     * Elimina un juego de la base de datos por su identificador.
     *
     * @param identificator El identificador del juego a eliminar.
     * @return Mensaje indicando si el juego se ha eliminado correctamente.
     */
    @DeleteMapping(path = "/jokuaezabatu")
    public @ResponseBody String deleteGame(@RequestParam String identificator) {

        try {
            // Intentar eliminar el juego y proporcionar un mensaje de resultado.
            long zenbat = gameRepository.delete(identificator);

            if (zenbat > 0) {
                return "Jokoa era egokian ezabatu da";
            } else {
                return "Errore bat gertatu da jokoa ezabatzen, saiatu berriz mesedez";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Errore bat gertatu da jokoa ezabatzen, saiatu berriz mesedez";
        }
    }

    /**
     * Actualiza la información de un juego existente.
     *
     * @param identificator     El identificador del juego a actualizar.
     * @param title             El nuevo título del juego.
     * @param release_date      La nueva fecha de lanzamiento del juego.
     * @param team              El nuevo equipo de desarrollo del juego.
     * @param rating            La nueva calificación del juego.
     * @param times_listed      El nuevo número de veces que se ha listado el juego.
     * @param number_of_reviews El nuevo número de reseñas del juego.
     * @param genre             El nuevo género del juego.
     * @param summary           El nuevo resumen del juego.
     * @param reviews           La nueva reseña del juego.
     * @param plays             El nuevo número de veces que se ha jugado el juego.
     * @param playing           El nuevo número de personas que están jugando actualmente.
     * @param backlogs          El nuevo número de juegos en la lista de espera.
     * @param wishlist          El nuevo número de juegos en la lista de deseos.
     * @return ResponseEntity que indica si la actualización fue exitosa o no.
     */
    @PutMapping(value = "/jokuaeguneratu")
    public ResponseEntity<Game> updateGame(
            @RequestParam int identificator, @RequestParam String title, @RequestParam String release_date,
            @RequestParam String team, @RequestParam double rating, @RequestParam String times_listed,
            @RequestParam String number_of_reviews, @RequestBody Genre genre, @RequestParam String summary,
            @RequestBody Review reviews, @RequestParam String plays, @RequestParam String playing,
            @RequestParam String backlogs, @RequestParam String wishlist) {

        try {
            // Obtener el juego existente y actualizar sus atributos.
            Game g = gameRepository.findById(identificator);
            g.setIdentificator(identificator);
            g.setTitle(title);
            g.setRelease_date(release_date);
            g.setTeam(team);
            g.setRating(rating);
            g.setTimes_listed(times_listed);
            g.setNumber_of_reviews(number_of_reviews);

            List<Genre> generoak = g.getGenre();
            generoak.add(genre);

            g.setSummary(summary);

            List<Review> rev = g.getReviews();
            rev.add(reviews);

            g.setPlays(plays);
            g.setPlaying(playing);
            g.setBacklogs(backlogs);
            g.setWishlist(wishlist);
            gameRepository.save(g);

            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }
}
