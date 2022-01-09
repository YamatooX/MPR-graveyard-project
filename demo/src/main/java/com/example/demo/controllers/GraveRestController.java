package com.example.demo.controllers;

import com.example.demo.models.Grave;
import com.example.demo.repositories.CorpseRepository;
import com.example.demo.repositories.GraveRepository;
import com.example.demo.services.GraveService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grave")
public class GraveRestController {

    private final GraveService graveService;

    public GraveRestController(GraveService graveService) {
        this.graveService = graveService;
    }

    @GetMapping("/example")
    public ResponseEntity<Grave> getEzampleGrave(){
        return ResponseEntity.ok(graveService.getExampleGrave());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Grave> getById(@PathVariable Integer id){
        return ResponseEntity.ok(graveService.findById(id));
    }
}
