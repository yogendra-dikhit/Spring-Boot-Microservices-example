package com.movie.catalogService;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class MovieCatalogSerrviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogSerrviceApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public WebClient.Builder getWebClientBuilder() {
		return WebClient.builder();
	}
	
}
