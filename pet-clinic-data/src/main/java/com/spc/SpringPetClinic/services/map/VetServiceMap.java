package com.spc.SpringPetClinic.services.map;

import com.spc.SpringPetClinic.models.Vet;
import com.spc.SpringPetClinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
        @Override
        public Set<Vet> findAll() {
            return super.findAll();
        }

        @Override
        public Vet save(Vet vet) {
            return super.save(vet);
        }

        @Override
        public Vet findById(Long id) {
            return super.findById(id);
        }

        @Override
        public void deleteById(Long id) {
            super.deleteById(id);
        }

        @Override
        public void delete(Vet vet) {
            super.delete(vet);
        }
}

