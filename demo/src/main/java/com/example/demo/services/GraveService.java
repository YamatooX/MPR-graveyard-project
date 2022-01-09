package com.example.demo.services;

import com.example.demo.models.Corpse;
import com.example.demo.models.Grave;
import com.example.demo.repositories.CorpseRepository;
import com.example.demo.repositories.GraveRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

import static java.util.List.of;

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

        Grave grave = new Grave(null, corpses);
        //graveRepository.save(grave);
        return grave;
    }

    public Grave findById(Integer Id){
        return GraveRepository.findById(id) // non static bullshit
                        .orElse(null);
    }

    public void addCorpse(Grave grave, Corpse corpse){
        if(grave.getCorpses() != null) {
            grave.getCorpses().add(corpse);
        } else {
            grave.setCorpses(List.of(corpse)); // there is no java 9+
        }

    public void setName(Grave grave, String name){
        if(corpse.getName() != null)
            corpse.setName(name);
    }
}
