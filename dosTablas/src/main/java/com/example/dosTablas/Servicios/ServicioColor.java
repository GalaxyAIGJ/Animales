package com.example.dosTablas.Servicios;

import com.example.dosTablas.Entidades.Color;
import com.example.dosTablas.Repositorio.RepoColor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServicioColor {
    
    @Autowired
    RepoColor rColor;
    
    public List<Color> obtenerColor (int idColor){
        return rColor.findAll();   
    }
    
    public boolean agregarColor (Color a){
        boolean respuesta;
        try{
            rColor.save(a);
            respuesta = true;
        }catch (Exception ex){
            return false;
        }
        return respuesta;
    }
    
    public boolean modificarColor (Color a){
        boolean respuesta;
        try{
            rColor.save(a);
            respuesta = true;
        }catch (Exception ex){
            return false;
        }
        return respuesta;
    } 
    
    public boolean eliminarColor (int idColor){
        boolean respuesta;
        try{
            rColor.deleteById(idColor);
            respuesta = true;
        }catch (Exception ex){
            return false;
        }
        return respuesta;
    }
}
