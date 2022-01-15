package com.example.demo.controllers;

import com.example.demo.models.Corpse;
import com.example.demo.models.Grave;
import com.example.demo.repositories.CorpseRepository;
import com.example.demo.repositories.GraveRepository;
import com.example.demo.services.GraveService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/grave")
public class GraveRestController {

    private final GraveService graveService;

    public GraveRestController(GraveService graveService) {
        this.graveService = graveService;
    }


    @GetMapping
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/example")
    public ResponseEntity<Grave> getExampleGrave(){
        return ResponseEntity.ok(graveService.getExampleGrave());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Grave> getById(@PathVariable Integer id){
        return ResponseEntity.ok(graveService.findById(id));
    }
    @GetMapping("/all")
    public ResponseEntity<Collection<Grave>> getAllGraves(){
        return ResponseEntity.ok(graveService.getAllGraves());

    }
}
