package taylan.mun.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import taylan.mun.spring5webapp.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
