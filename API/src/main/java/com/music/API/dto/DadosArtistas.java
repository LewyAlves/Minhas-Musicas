package com.music.API.dto;

import com.music.API.model.TipoDoArtista;

public record DadosArtistas(String nome,
                            TipoDoArtista tipo,
                            String generoMusical) {
}
