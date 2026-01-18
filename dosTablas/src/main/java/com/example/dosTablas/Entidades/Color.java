package com.example.dosTablas.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Color {
    
    @Id
    private int idColor;
    private String nombreColor;

    public Color() {
    }

    public Color(int idColor, String nombreColor) {
        this.idColor = idColor;
        this.nombreColor = nombreColor;
    }

    public int getIdColor() {
        return idColor;
    }

    public String getNombreColor() {
        return nombreColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    public void setNombreColor(String nombreColor) {
        this.nombreColor = nombreColor;
    }
    
    
}
