package com.heroes.dc.repositories;

import com.heroes.dc.models.Heroe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HeroeRepository extends JpaRepository<Heroe, Long> {
    Optional<Heroe> findByAlias(String alias); //Buscar por alias, ej Superman
}
