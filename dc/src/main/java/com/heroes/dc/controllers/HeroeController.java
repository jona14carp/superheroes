package com.heroes.dc.controllers;

import com.heroes.dc.models.Heroe;
import com.heroes.dc.repositories.HeroeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/heroes")
public class HeroeController {

    @Autowired
    private HeroeRepository heroeRepository;

    //Listar todos los heroes
    @GetMapping
    public List<Heroe> getTodosLosHeroes(){
        return heroeRepository.findAll();
    }

    //Buscar por alias
    @GetMapping("/{alias}")
    public Heroe getHeroePorAlias(@PathVariable String alias){
        return heroeRepository.findByAlias(alias).orElseThrow(()-> new RuntimeException("heroe no encontrado"));
    }

    //Agregar uno nuevo
    @PostMapping
    public Heroe crearHeroe(@RequestBody Heroe heroe){
        return heroeRepository.save(heroe);
    }
}
