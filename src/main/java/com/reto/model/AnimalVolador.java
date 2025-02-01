package com.reto.model;

public class AnimalVolador extends Animal {
    public AnimalVolador(String nombre, String onomatopeya) {
        super(nombre, onomatopeya);
    }

    @Override
    public String getTipo() {
        return "Volador";
    }
}
