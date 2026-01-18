package com.example.dosTablas.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Animal {
    
    @Id
    private String nombre;
    private int patas;
    private double precio;
    private String tipo;
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "idColor")
    private Color idColor;
    

    public Animal() {
    }

    public Animal(String nombre, int patas, double precio, String tipo, Color idColor) {
        this.nombre = nombre;
        this.patas = patas;
        this.precio = precio;
        this.tipo = tipo;
        this.idColor = idColor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Color getColor() {
        return idColor;
    }

    public void setColor(Color color) {
        this.idColor = color;
    }

    
     
}
