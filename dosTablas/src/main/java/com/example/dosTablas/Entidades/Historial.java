package com.example.dosTablas.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Historial {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHistorial;
    private String nombreAnimal;
    private double precioAnterior;
    private LocalDateTime fechaCambio;

    public Historial() {
    }

    public Historial(String nombreAnimal, double precioAnterior, LocalDateTime fechaCambio) {
        this.nombreAnimal = nombreAnimal;
        this.precioAnterior = precioAnterior;
        this.fechaCambio = fechaCambio;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public double getPrecioAnterior() {
        return precioAnterior;
    }

    public void setPrecioAnterior(double precioAnterior) {
        this.precioAnterior = precioAnterior;
    }

    public LocalDateTime getFechaCambio() {
        return fechaCambio;
    }

    public void setFechaCambio(LocalDateTime fechaCambio) {
        this.fechaCambio = fechaCambio;
    }

    
    
    
}
