package com.dnpi.petclinic.dnpipetclinic.bootstrap;

import com.dnpi.petclinic.dnpipetclinic.model.Owner;
import com.dnpi.petclinic.dnpipetclinic.model.Vet;
import com.dnpi.petclinic.dnpipetclinic.services.OwnerService;
import com.dnpi.petclinic.dnpipetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // when context is up and running it runs run()
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Jason");
        owner1.setLastName("Jackson");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Judith");
        owner2.setLastName("Mraz");

        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setId(3L);
        owner3.setFirstName("Leo");
        owner3.setLastName("Litt");

        ownerService.save(owner3);
        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Vettus");
        vet1.setLastName("Vetis");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Vettus");
        vet2.setLastName("Vetis");

        vetService.save(vet2);
        System.out.println("Loaded vets...");
    }
}
