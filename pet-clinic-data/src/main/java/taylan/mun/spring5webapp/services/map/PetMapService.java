package taylan.mun.spring5webapp.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import taylan.mun.spring5webapp.model.Pet;
import taylan.mun.spring5webapp.services.PetService;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deletedById(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
