package taylan.mun.spring5webapp.services.map;

import org.springframework.stereotype.Service;
import taylan.mun.spring5webapp.model.Speciality;
import taylan.mun.spring5webapp.model.Vet;
import taylan.mun.spring5webapp.services.SpecialtyService;
import taylan.mun.spring5webapp.services.VetService;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

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

        if(object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpeciality = specialtyService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }

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
