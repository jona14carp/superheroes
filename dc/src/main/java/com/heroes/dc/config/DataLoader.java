package com.heroes.dc.config;

import com.heroes.dc.models.Heroe;
import com.heroes.dc.repositories.HeroeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {
    @Bean
    CommandLineRunner cargarHeroesIniciales(HeroeRepository repository){
        return args -> {
            Heroe batman = new Heroe();
            batman.setNombre("Bruce Wayne");
            batman.setAlias("Batman");
            batman.setDescripcion("Vigilante de Gotham, calculador y sigiloso");
            batman.setPoderes("Inteligencia, tecnologia, artes marciales");
            batman.setImagenUrl("https://es.wallpapers.com/imagenes/imagende-batman-con-arte-retro-de-comics-7lmkay5wpt2k642g.html");

            Heroe superman = new Heroe();
            superman.setNombre("Clark Kent");
            superman.setAlias("Superman");
            superman.setDescripcion("El ultimo hijo de kripton, simbolo de esperanza");
            superman.setPoderes("Vuelo, superfuerza, vision laser");
            superman.setImagenUrl("https://i.pinimg.com/736x/3e/30/7b/3e307b4ded2a4444d8dae41790e2c0f5.jpg");

            Heroe flash = new Heroe();
            flash.setNombre("Barry Allen");
            flash.setAlias("Flash");
            flash.setDescripcion("Forense, velocista escarlata, el hombre mas rapido del mundo");
            flash.setPoderes("Super velocidad, avanzar o retroceder en el tiempo");
            flash.setImagenUrl("https://i.pinimg.com/736x/61/83/5e/61835ec42b3159264c05b00d1371bbf1.jpg");

            repository.save(batman);
            repository.save(superman);
            repository.save(flash);
        };
    }
}
