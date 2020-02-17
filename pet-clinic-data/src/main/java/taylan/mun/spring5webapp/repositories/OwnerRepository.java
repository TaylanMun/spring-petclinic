package taylan.mun.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import taylan.mun.spring5webapp.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
