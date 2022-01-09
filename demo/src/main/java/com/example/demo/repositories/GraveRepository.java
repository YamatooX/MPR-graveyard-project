package com.example.demo.repositories;

import com.example.demo.models.Grave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GraveRepository extends JpaRepository <Grave, Integer>{
}
