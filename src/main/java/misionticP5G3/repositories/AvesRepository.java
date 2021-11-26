package misionticP5G3.repositories;

import java.util.List;
import misionticP5G3.models.Ave;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AvesRepository extends MongoRepository<Ave, String> {
    List<Ave> findByTipoAve(String tipoAve);
}