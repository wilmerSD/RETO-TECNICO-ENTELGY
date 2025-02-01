package com.reto.model;

public class AnimalAcuatico extends Animal {
    public AnimalAcuatico(String nombre, String onomatopeya) {
        super(nombre, onomatopeya);
    }

    @Override
    public String getTipo() {
        return "Acuático";
    }
}