package com.example.demo.repositories;

import com.example.demo.models.Corpse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorpseRepository extends JpaRepository<Corpse, Integer>{
}
