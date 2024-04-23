package com.music.API.model;

import com.music.API.dto.DadosArtistas;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_artistas")
@Getter
@Setter
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private TipoDoArtista tipo;
    private String generoMusical;
    @OneToMany(mappedBy = "artista", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Musica> musicas = new ArrayList<>();

    public Artista(DadosArtistas dados){
        this.nome = dados.nome();
        this.tipo = dados.tipo();
        this.generoMusical = dados.generoMusical();
    }
    public Artista(){}
}
