package com.music.API.controller;

import com.music.API.dto.ArtistaDTO;
import com.music.API.dto.DadosArtistas;
import com.music.API.dto.DadosMusica;
import com.music.API.model.Artista;
import com.music.API.services.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Artista")
public class ArtistaController {
    @Autowired
    private ArtistaService artistaService;

    @PostMapping
    public ResponseEntity registraArtista(@RequestBody DadosArtistas dados){
        Artista cadastro = artistaService.cadastraArtista(dados);
        return ResponseEntity.ok(cadastro);
    }

    @GetMapping("/todas-musicas")
    public ResponseEntity listarMusicas(){
        List<DadosMusica> lista = artistaService.listarMusicas();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{nome}")
    public ResponseEntity musicasDoArtista(@PathVariable String nome){
        ArtistaDTO artista = artistaService.listarArtista(nome);
        return ResponseEntity.ok(artista);
    }

    @GetMapping("todos")
    public ResponseEntity artistas(){
        List<DadosArtistas> lista = artistaService.todosArtistas();
        return ResponseEntity.ok(lista);
    }
}
