package com.music.API.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_musicas")
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    @ManyToOne
    private Artista artista;

    public Musica(){}
    public Musica(String titulo){
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Musica: " + titulo + '\'' +
                ", Artista: " + artista.getNome();
    }
}
