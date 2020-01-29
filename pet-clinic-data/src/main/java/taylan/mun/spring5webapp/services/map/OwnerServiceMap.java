package taylan.mun.spring5webapp.services.map;

import taylan.mun.spring5webapp.model.Owner;
import taylan.mun.spring5webapp.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deletedById(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
