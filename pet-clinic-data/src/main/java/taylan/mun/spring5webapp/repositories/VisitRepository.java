package taylan.mun.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import taylan.mun.spring5webapp.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
