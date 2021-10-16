package com.spc.SpringPetClinic.services;

import com.spc.SpringPetClinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
