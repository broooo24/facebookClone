package com.example.demo.config;

import com.example.demo.service.databaseseeder.Seeder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class ApplicationConfig {
    @Autowired
    Seeder seeder;

    @EventListener(ApplicationReadyEvent.class)
    public void seeTest(){
        System.out.println("");
        seeder.seedRoles();
    }
}
