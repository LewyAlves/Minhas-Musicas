package com.music.API.controller;

import com.music.API.dto.DadosMusica;
import com.music.API.services.ServiceMusica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/musicas")
public class MusicaController {

    @Autowired
    private ServiceMusica serviceMusica;

    @PostMapping
    public ResponseEntity cadastraMusica(@RequestBody DadosMusica dadosMusica){
        serviceMusica.cadastraMusica(dadosMusica);
        return ResponseEntity.ok().build();
    }
}
