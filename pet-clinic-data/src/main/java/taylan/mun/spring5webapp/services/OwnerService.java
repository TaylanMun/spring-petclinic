package taylan.mun.spring5webapp.services;

import taylan.mun.spring5webapp.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
