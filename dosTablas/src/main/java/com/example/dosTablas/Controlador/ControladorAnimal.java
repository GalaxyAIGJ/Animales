package com.example.dosTablas.Controlador;

import com.example.dosTablas.Entidades.Animal;
import com.example.dosTablas.Entidades.Historial;
import com.example.dosTablas.Servicios.ServicioAnimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/Animal")
public class ControladorAnimal {
    
    @Autowired
    ServicioAnimal sAnimal;
    
    @GetMapping("/Obtener")
    public List<Animal> obtenerTodosAnimales(){
        return sAnimal.obtenerTodosAnimales();
    }
    
    @GetMapping("/ObtenerUno")
    public Animal obtenerUnAnimal (String nombre){
        return sAnimal.obtenerUnAnimal(nombre);
    }
    
    @GetMapping("/ObtenerPatas")
    public List<Animal> obtenerTodosAnimalesDeterminadasPatas(int patas){
        return sAnimal.obtenerTodosAnimalesDeterminadasPatas(patas);
    }
        @PostMapping("/Agregar")
    public List<Animal> agregarAnimal(@RequestBody Animal a){
        if (sAnimal.agregarAnimal(a)){
            return obtenerTodosAnimales();
        }
        return null;
    }
    
            @PutMapping("/Modificar")
    public List<Animal> modificarAnimal(@RequestBody Animal a){
        if (sAnimal.modificarAnimal(a)){
            return obtenerTodosAnimales();
        }
        return null;
    }
    
    @DeleteMapping("/Delete")
    public List<Animal> eliminarAnimal (String nombre){
        if (sAnimal.eliminarAnimal(nombre)){
            return obtenerTodosAnimales();
        }
        return null;   
    }
    
    @PostMapping("/ActualizarPre")
    public Historial cambiarPrecio (String nombre, Double nuevoPrecio){
        if (nuevoPrecio == null){
            System.out.println("ERROR: El precio llegó vacío (null)");
            return null;
        }
        return sAnimal.actualizarPrecio(nombre, nuevoPrecio);
    }
}
