package com.music.API.services;

import com.music.API.dto.DadosMusica;
import com.music.API.model.Artista;
import com.music.API.model.Musica;
import com.music.API.repository.ArtistasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceMusica {

    @Autowired
    private ArtistasRepository repository;

    public void cadastraMusica(DadosMusica dados){
        System.out.println("Informe o artista que deseja cadastrar a musica");
        Optional<Artista> artista = repository.findByNomeContainingIgnoreCase(dados.artista());

        if(artista.isPresent()){
            var artistaEncontrado = artista.get();
            Musica musica = new Musica(dados.titulo());
            musica.setArtista(artista.get());
            artista.get().getMusicas().add(musica);
            repository.save(artista.get());
        } else {
            throw new RuntimeException("Artista não encontrado");
        }
    }
}
