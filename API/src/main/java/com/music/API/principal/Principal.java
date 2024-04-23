package com.music.API.principal;
import com.music.API.model.Artista;
import com.music.API.model.Musica;
import com.music.API.model.TipoDoArtista;
import com.music.API.repository.ArtistasRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.stream.Collectors;


public class Principal {
    /*
    public Principal(){}
    public Principal(ArtistasRepository repository){
        this.artistasRepository = repository;
    }
    Scanner leitor = new Scanner(System.in);
    @Autowired
    private ArtistasRepository artistasRepository;
    public void  menu(){
        var mensagem = """
                ***************************
                      Menu de Musicas
                ***************************
                1 - Cadastrar Artista
                2 - Cadastrar Musicas
                3 - Listar Musicas
                4 - Pesquisar musicas por Artista
                0 - Sair
                """;

        var opcao = -1;

        while (opcao != 0){
            System.out.println(mensagem);
            var escolha = leitor.nextInt();
            leitor.nextLine();
            switch (escolha){
                case 1:
                    cadastraArtista();
                    break;
                case 2:
                    cadastraMusica();
                    break;
                case 3:
                    listarMusicas();
                    break;
                case 4:
                    pesquisaMusicaPorArtista();
                    break;
                case 0:
                    System.out.println("Até a proxima! :)");
                    opcao = escolha;
                    break;
                default:
                    System.out.println("opção invalida!");
            }
        }


    }
    public void cadastraArtista(){
        System.out.println("Qual artista deseja cadastrar?");
        var nome = leitor.nextLine();
        System.out.println(nome);
        System.out.println("Esse artista é solo, dupla ou banda?");
        TipoDoArtista tipo = TipoDoArtista.valueOf(leitor.nextLine().toUpperCase());
        System.out.println("Informe o genêro musical");
        var genero = leitor.nextLine();
        Artista artista = new Artista(nome, tipo, genero);
        artistasRepository.save(artista);
    }

    public void cadastraMusica(){
        System.out.println("Informe o artista que deseja cadastrar a musica");
        var pesquisaArtista = leitor.nextLine();
        Optional<Artista> artista = artistasRepository.findByNomeContainingIgnoreCase(pesquisaArtista);

        if(artista.isPresent()){
            var artistaEncontrado = artista.get();
            System.out.println("artista: " + artistaEncontrado.getNome());
            System.out.println("Digite o nome da musica");
            var nomeDaMusica = leitor.nextLine();
            Musica musica = new Musica(nomeDaMusica);
            musica.setArtista(artista.get());
            artista.get().getMusicas().add(musica);
            artistasRepository.save(artista.get());
        }
    }

    public void pesquisaMusicaPorArtista(){
        System.out.println("Informe o artista que deseja ver as musicas");
        var pesquisaArtista = leitor.nextLine();
        Optional<Artista> artista = artistasRepository.findByNomeContainingIgnoreCase(pesquisaArtista);

        if (artista.isPresent()){
            System.out.println(artista.get().getNome());
            List<Musica> musicas = artista.get().getMusicas();
            musicas.forEach(System.out::println);
        }
    }

    public void listarMusicas(){
        List<Musica> musicas = artistasRepository.listarTodasAsMusicas();
        musicas.forEach(System.out::println);
    }
    */
 }
