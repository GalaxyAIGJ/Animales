package com.example.dosTablas.Repositorio;

import com.example.dosTablas.Entidades.Animal;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoAnimal extends JpaRepository<Animal, String>{
    
    @Query(value="SELECT * FROM animal WHERE patas >= ?1", nativeQuery = true)
    public List<Animal> obtenerTodosAnimalesDeterminadasPatas(int patas);
    
    
}
