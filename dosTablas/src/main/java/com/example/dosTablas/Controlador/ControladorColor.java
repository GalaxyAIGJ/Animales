package com.example.dosTablas.Controlador;

import com.example.dosTablas.Entidades.Color;
import com.example.dosTablas.Servicios.ServicioColor;
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
@RequestMapping("/Color")
public class ControladorColor {
    
    @Autowired
    ServicioColor sColor;
    
    @GetMapping ("/Obtener")
    public List<Color> obtenerColor (){
        return sColor.obtenerColor(0);
    }
    
    @PostMapping ("/Agregar")
    public List<Color> agregarColor(@RequestBody Color a){
        if (sColor.agregarColor(a)){
            return sColor.obtenerColor(0);
        }
        return null;
    }
    
    @PutMapping ("/Modificar")
    public List<Color> modificarColor(@RequestBody Color a){
        if (sColor.agregarColor(a)){
            return sColor.obtenerColor(0);
        }
        return null;
    }
    
    @DeleteMapping("/Delete")
    public List<Color> eliminarAnimal (int idColor){
        if (sColor.eliminarColor(idColor)){
            return sColor.obtenerColor(idColor);
        }
        return null;   
    }
}
