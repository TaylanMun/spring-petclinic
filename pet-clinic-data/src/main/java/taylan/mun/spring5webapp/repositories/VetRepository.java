package taylan.mun.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import taylan.mun.spring5webapp.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
