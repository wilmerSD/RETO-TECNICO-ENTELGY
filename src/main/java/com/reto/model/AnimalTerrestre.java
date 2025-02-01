package com.reto.model;

public class AnimalTerrestre extends Animal {
    public AnimalTerrestre(String nombre, String onomatopeya) {
        super(nombre, onomatopeya);
    }

    @Override
    public String getTipo() {
        return "Terrestre";
    }
}