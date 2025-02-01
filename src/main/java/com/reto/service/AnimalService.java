package com.reto.service;

import com.reto.model.Animal;
import com.reto.model.TipoAnimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnimalService {
    public Map<String, List<Animal>> agruparAnimalesPorTipo(List<Animal> animales) {
        return animales.stream()
                .collect(Collectors.groupingBy(Animal::getTipo));
    }
}
