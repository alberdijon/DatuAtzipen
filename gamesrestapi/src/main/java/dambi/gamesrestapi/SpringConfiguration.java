package dambi.gamesrestapi;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
/**
 * Configuración de Spring para la conexión a MongoDB.
 */
@Configuration
public class SpringConfiguration {
    
    /**
     * URL de conexión a la base de datos MongoDB obtenida desde las propiedades de la aplicación.
     */
    @Value("${spring.data.mongodb.uri}")
    private String connectionString;

    /**
     * Bean para crear un MongoClient, que se utilizará para interactuar con la base de datos MongoDB.
     *
     * @return MongoClient configurado según la URL de conexión y los codecs registrados.
     */
    @Bean  
    public MongoClient mongoClient() {
        // Configurar el registro de codecs para la conversión entre objetos Java y documentos BSON.
        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build()); // esto hace la conversion de JavaObject a BSONdocument
        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry); //Y como hago que esto salga bien?

        // Crear y devolver el MongoClient configurado.
        return MongoClients.create(MongoClientSettings.builder().applyConnectionString(new ConnectionString(connectionString)).codecRegistry(codecRegistry).build());
    }
}