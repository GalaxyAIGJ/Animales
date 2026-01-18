package com.example.dosTablas.Servicios;

import com.example.dosTablas.Entidades.Animal;
import com.example.dosTablas.Entidades.Historial;
import com.example.dosTablas.Repositorio.RepoAnimal;
import com.example.dosTablas.Repositorio.RepoHistorial;
import jakarta.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioAnimal {
    
    @Autowired
    RepoAnimal rAnimal;
    
    @Autowired
    RepoHistorial rHistorial;
    
    public List<Animal> obtenerTodosAnimales (){
        return rAnimal.findAll();
    }
    
    public Animal obtenerUnAnimal (String nombre){
        Optional <Animal> a = rAnimal.findById(nombre);
        if(!a.isEmpty()){
            return a.get();
        }
        return null;
    }
    
    public List<Animal> obtenerTodosAnimalesDeterminadasPatas (int patas){
        return rAnimal.obtenerTodosAnimalesDeterminadasPatas(patas);
    }
    public boolean agregarAnimal(Animal a){
        boolean respuesta;
        try{
            rAnimal.save(a);
            respuesta = true;
        }catch(Exception ex){
            respuesta =  false;
        }
        return respuesta;
    }
    
        public boolean modificarAnimal(Animal a){
        boolean respuesta;
        try{
            rAnimal.save(a);
            respuesta = true;
        }catch(Exception ex){
            respuesta =  false;
        }
        return respuesta;
    }
        
            public boolean eliminarAnimal(String nombre){
        boolean respuesta;
        try{
            rAnimal.deleteById(nombre);
            respuesta = true;
        }catch(Exception ex){
            respuesta =  false;
        }
        return respuesta;
    }
            
        @Transactional
 public Historial actualizarPrecio(String nombre, double nuevoPrecio) {
    try {
        Animal animal = rAnimal.findById(nombre).orElse(null);
        
        if (animal == null) {
            return null; 
        }


        Historial historial = new Historial(
            animal.getNombre(),
            animal.getPrecio(),
            LocalDateTime.now()
        );
        
        historial = rHistorial.save(historial); 

        animal.setPrecio(nuevoPrecio);
        rAnimal.save(animal);
        
        return historial;
        
    } catch (Exception e) {
        return null;
    }
}
}
