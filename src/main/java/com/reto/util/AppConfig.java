package com.reto.util;

import com.reto.service.AnimalService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public AnimalService animalService() {
        return new AnimalService();
    }
}