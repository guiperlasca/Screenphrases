package com.example.Screenphrases.controller;

import com.example.Screenphrases.dto.PhrasesDTO;
import com.example.Screenphrases.service.PhrasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frases")
public class PhrasesController {

    @Autowired
    private PhrasesService servico;

    @GetMapping
    public PhrasesDTO obterFraseAleatoria() {
        return servico.obterFraseAleatoria();
    }
}
