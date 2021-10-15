package com.spc.SpringPetClinic.services;

import com.spc.SpringPetClinic.models.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
