package com.music.API.dto;

import com.music.API.model.Musica;
import com.music.API.model.TipoDoArtista;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

public record ArtistaDTO(String nome, TipoDoArtista tipo, String generoMusical, List<MusicaDTO> musicas) {
}
