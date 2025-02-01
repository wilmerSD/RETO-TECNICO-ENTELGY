package com.reto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.reto.model.Animal;
import com.reto.model.AnimalTerrestre;
import com.reto.model.AnimalVolador;
import com.reto.service.AnimalService;

public class AppTest {
    @Test
    public void testAgruparAnimalesPorTipo() {
        AnimalService service = new AnimalService();
        List<Animal> animales = List.of(
                new AnimalTerrestre("Perro", "Guau"),
                new AnimalVolador("Águila", "Crii"),
                new AnimalTerrestre("Gato", "Miau"));

        Map<String, List<Animal>> resultado = service.agruparAnimalesPorTipo(animales);
        assertEquals(2, resultado.get("Terrestre").size());
        assertEquals(1, resultado.get("Volador").size());
    }
}