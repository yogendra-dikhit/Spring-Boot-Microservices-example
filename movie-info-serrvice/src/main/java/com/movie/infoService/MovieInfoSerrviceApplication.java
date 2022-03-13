package com.movie.infoService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieInfoSerrviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoSerrviceApplication.class, args);
	}

}
