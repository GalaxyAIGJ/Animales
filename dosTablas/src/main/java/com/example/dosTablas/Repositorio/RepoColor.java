package com.example.dosTablas.Repositorio;

import com.example.dosTablas.Entidades.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoColor extends JpaRepository<Color, Integer>{
    
}
