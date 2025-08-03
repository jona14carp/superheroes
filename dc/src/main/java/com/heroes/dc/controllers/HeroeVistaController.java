package com.heroes.dc.controllers;

import com.heroes.dc.models.Heroe;
import com.heroes.dc.repositories.HeroeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HeroeVistaController {
    @Autowired
    private HeroeRepository heroeRepository;

    @GetMapping("/heroes")
    public String mostrarListado(Model model) {
        List<Heroe> heroes = heroeRepository.findAll();
        model.addAttribute("heroes", heroes);
        return "galeria";
    }

    @GetMapping("/galeria")
    public String mostrarGaleria(Model model) {
        List<Heroe> heroes = heroeRepository.findAll();
        model.addAttribute("heroes", heroes);
        return "galeria";
    }



}
