package com.music.API.services;

import com.music.API.dto.ArtistaDTO;
import com.music.API.dto.DadosArtistas;
import com.music.API.dto.DadosMusica;
import com.music.API.dto.MusicaDTO;
import com.music.API.model.Artista;
import com.music.API.model.Musica;
import com.music.API.repository.ArtistasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ArtistaService {

    @Autowired
    private ArtistasRepository repository;
    public Artista cadastraArtista(DadosArtistas dados) {
        Artista artista = new Artista(dados);
        return repository.save(artista);
    }

    public List<DadosMusica> listarMusicas() {
        List<Musica> musicas = repository.listarTodasAsMusicas();
        return musicas.stream()
                .map(m -> new DadosMusica(m.getTitulo(), m.getArtista().getNome()))
                .collect(Collectors.toList());
    }

    public ArtistaDTO listarArtista(String nome) {
        Optional<Artista> artista = repository.findByNomeContainingIgnoreCase(nome);

        if (artista.isPresent()){
            Artista a = artista.get();
            return new  ArtistaDTO(a.getNome(), a.getTipo(), a.getGeneroMusical(),a.getMusicas().stream()
                    .map(m -> new MusicaDTO(m.getTitulo())).collect(Collectors.toList()));
        }
        return null;
    }

    public List<DadosArtistas> todosArtistas() {
        List<Artista> artistas = repository.findAll();

        return artistas.stream()
                .map(a -> new DadosArtistas(a.getNome(),a.getTipo(), a.getGeneroMusical()))
                .collect(Collectors.toList());
    }
}
