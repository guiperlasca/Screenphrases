package com.example.Screenphrases.repository;

import com.example.Screenphrases.model.Phrases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PhrasesRepository extends JpaRepository<Phrases, Long> {
    @Query(value = "SELECT * FROM phrases ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    Phrases buscaFraseAleatoria();
}
