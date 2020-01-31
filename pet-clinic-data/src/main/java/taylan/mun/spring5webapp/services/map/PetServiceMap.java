package taylan.mun.spring5webapp.services.map;

import taylan.mun.spring5webapp.model.Pet;
import taylan.mun.spring5webapp.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
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
        return super.save(object.getId(), object);
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
