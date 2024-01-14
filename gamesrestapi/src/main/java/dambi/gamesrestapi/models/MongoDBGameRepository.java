package dambi.gamesrestapi.models;

import static com.mongodb.client.model.Filters.eq;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;

import jakarta.annotation.PostConstruct;
/**
 * Implementación de la interfaz GameRepository utilizando MongoDB como base de datos.
 */
@Repository
public class MongoDBGameRepository implements GameRepository {
    
    @Autowired
    private MongoClient client;

    // Colección de juegos en MongoDB.
    private MongoCollection<Game> gameCollection;

    /**
     * Inicializa la conexión a la colección de juegos en la base de datos MongoDB.
     */
    @PostConstruct
    void init() {
        gameCollection = client.getDatabase("games").getCollection("game", Game.class);
    }

    /**
     * Obtiene todos los juegos almacenados en la base de datos.
     *
     * @return Lista de juegos.
     */
    @Override
    public List<Game> findAll() {
        return gameCollection.find().into(new ArrayList<>());
    }

    /**
     * Busca un juego por su identificador.
     *
     * @param identificator Identificador del juego a buscar.
     * @return Juego que coincide con el identificador proporcionado.
     */
    @Override
    public Game findById(int identificator) {
        return gameCollection.find(eq("Identificator", identificator)).first();
    }

    /**
     * Guarda un nuevo juego en la base de datos.
     *
     * @param game Juego a guardar.
     * @return El juego guardado.
     */
    @Override
    public Game save(Game game) {
        gameCollection.insertOne(game);
        return game;
    }

    /**
     * Elimina un juego de la base de datos por su identificador.
     *
     * @param identificator Identificador del juego a eliminar.
     * @return El número de juegos eliminados.
     */
    @Override
    public long delete(String identificator) {
        return gameCollection.deleteMany(eq("Identificator", identificator)).getDeletedCount();
    }
}