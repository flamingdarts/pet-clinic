package com.dnpi.petclinic.dnpipetclinic.services;

import com.dnpi.petclinic.dnpipetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
