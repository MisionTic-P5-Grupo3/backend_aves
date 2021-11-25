package misionticP5G3.repositories;

import misionticP5G3.backendAves.models.Ave;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AvesRepository extends MongoRepository<Ave, Integer> {

}