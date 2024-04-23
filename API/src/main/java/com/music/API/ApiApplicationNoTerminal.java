/*
package com.music.API;

import com.music.API.principal.Principal;
import com.music.API.repository.ArtistasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplicationNoTerminal implements CommandLineRunner {
	@Autowired
	private ArtistasRepository artistasRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApiApplicationNoTerminal.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(artistasRepository);
		principal.menu();
	}
}*/
