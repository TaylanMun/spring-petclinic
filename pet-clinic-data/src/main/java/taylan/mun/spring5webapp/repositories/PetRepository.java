package taylan.mun.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import taylan.mun.spring5webapp.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
