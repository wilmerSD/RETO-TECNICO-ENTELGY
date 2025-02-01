package com.reto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.reto.model.Animal;
import com.reto.model.AnimalAcuatico;
import com.reto.model.AnimalTerrestre;
import com.reto.model.AnimalVolador;
import com.reto.model.TipoAnimal;
import com.reto.service.AnimalService;
import com.reto.util.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AnimalService animalService = context.getBean(AnimalService.class);

        List<Animal> animales = new ArrayList<>();
        for (String arg : args) {
            String[] datos = arg.split("\\|");
            String nombre = datos[0];
            TipoAnimal tipo = TipoAnimal.valueOf(datos[1].toUpperCase());
            String onomatopeya = datos[2];

            switch (tipo) {
                case TERRESTRE:
                    animales.add(new AnimalTerrestre(nombre, onomatopeya));
                    break;
                case VOLADOR:
                    animales.add(new AnimalVolador(nombre, onomatopeya));
                    break;
                case ACUATICO:
                    animales.add(new AnimalAcuatico(nombre, onomatopeya));
                    break;
            }
        }

        Map<String, List<Animal>> animalesAgrupados = animalService.agruparAnimalesPorTipo(animales);
        animalesAgrupados.forEach((tipo, lista) -> {
            System.out.println("Animales " + tipo + ":");
            lista.forEach(animal -> System.out.println(
                    "- " + animal.getNombre() + " hace " + animal.getOnomatopeya()));
        });
    
    }
}
