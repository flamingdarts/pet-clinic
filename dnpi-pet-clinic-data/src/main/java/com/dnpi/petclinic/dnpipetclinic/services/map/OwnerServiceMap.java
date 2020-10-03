package com.dnpi.petclinic.dnpipetclinic.services.map;

import com.dnpi.petclinic.dnpipetclinic.model.Owner;
import com.dnpi.petclinic.dnpipetclinic.services.CrudService;
import com.dnpi.petclinic.dnpipetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service // functional service and components are the same 
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
