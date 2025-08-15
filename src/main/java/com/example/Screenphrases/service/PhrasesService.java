package com.example.Screenphrases.service;

import com.example.Screenphrases.dto.PhrasesDTO;
import com.example.Screenphrases.model.Phrases;
import com.example.Screenphrases.repository.PhrasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class PhrasesService {
    @Autowired
    private PhrasesRepository repositorio;

    public PhrasesDTO obterFraseAleatoria() {
        Phrases frase = repositorio.buscaFraseAleatoria();
        return new PhrasesDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
    
}
