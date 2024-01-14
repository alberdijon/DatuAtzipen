package dambi.gamesrestapi.models;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * Interfaz que define las operaciones CRUD para la entidad Game.
 */
@Repository
public interface GameRepository {
    
    /**
     * Obtiene todos los juegos almacenados.
     *
     * @return Lista de todos los juegos.
     */
    List<Game> findAll();

    /**
     * Busca un juego por su identificador.
     *
     * @param identificator Identificador del juego a buscar.
     * @return Juego que coincide con el identificador proporcionado.
     */
    Game findById(int identificator);

    /**
     * Guarda un nuevo juego.
     *
     * @param game Juego a guardar.
     * @return El juego guardado.
     */
    Game save(Game game);

    /**
     * Elimina un juego por su identificador.
     *
     * @param identificator Identificador del juego a eliminar.
     * @return El número de juegos eliminados.
     */
    long delete(String identificator);

}