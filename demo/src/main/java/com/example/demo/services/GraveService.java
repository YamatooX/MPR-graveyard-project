package com.example.demo.services;

import com.example.demo.models.Corpse;
import com.example.demo.models.Grave;
import com.example.demo.repositories.CorpseRepository;
import com.example.demo.repositories.GraveRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;


@Service
public class GraveService {

    private final GraveRepository graveRepository;
    private final CorpseRepository corpseRepository;

    public GraveService(GraveRepository graveRepository, CorpseRepository corpseRepository) {
        this.graveRepository = graveRepository;
        this.corpseRepository = corpseRepository;
    }

    public Grave getExampleGrave() {
        Corpse corpse1 = new Corpse(null, "Jarosław", "Bator", "2022-01-22");
        Corpse corpse2 = new Corpse(null, "Example", "Corpse", "2221-11-24");
        List<Corpse> corpses = new ArrayList<Corpse>();
        corpses.add(corpse1);
        corpses.add(corpse2);

        Grave grave = new Grave(null, 3, 0, corpses);
        graveRepository.save(grave);
        return grave;
    }

    public Grave findById(Integer Id){
        return graveRepository.findById(Id) // non static bullshit
                        .orElse(null);
    }

    public void addCorpse(Grave grave){ // dodawanie nieboszczyka do istniejącego grobu
        grave.addCorpse();
    }

    public void setNewCapacity(Grave grave, Integer newCapacity){
        Optional.ofNullable(grave.getMaxCapacity())
                .ifPresent(maxCapacity -> grave.setMaxCapacity(newCapacity));
    }

    public Collection<Grave> getAllGraves(){
        return graveRepository.findAll();
    }

    public void changeNameofTheCorpse(Corpse corpse, String newName){
        Optional.ofNullable(corpse.getName())
                .ifPresent(name -> corpse.setName(newName));
    }
    public void delete(Grave grave) {
        graveRepository.delete(grave);
    }

    public void deleteById(Integer id) {
        graveRepository.deleteById(id);
    }

    public boolean exists(Grave grave) {
        return graveRepository.existsById(grave.getId());
    }

    public boolean existsById(Integer id) {
        return graveRepository.existsById(id);
    }
}
