package com.music.API.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Minhas Musicas API")
                        .description("API Rest da aplicação Minhas Musicas, contendo as funcionalidades de CRUD de artistas, cadastro e deletamento de musicas.")
                        .contact(new Contact()
                                .name("Contato")
                                .email("lewyalves64@gmail.com")));
    }
}
