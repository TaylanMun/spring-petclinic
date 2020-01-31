package taylan.mun.spring5webapp.services.map;

import org.springframework.stereotype.Service;
import taylan.mun.spring5webapp.model.Vet;
import taylan.mun.spring5webapp.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deletedById(id);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
