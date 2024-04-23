package com.music.API.repository;

import com.music.API.model.Artista;
import com.music.API.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ArtistasRepository extends JpaRepository<Artista, Long> {
    Optional<Artista> findByNomeContainingIgnoreCase(String artista);

    @Query("select m from Artista a JOIN a.musicas m")
    List<Musica> listarTodasAsMusicas();
}
