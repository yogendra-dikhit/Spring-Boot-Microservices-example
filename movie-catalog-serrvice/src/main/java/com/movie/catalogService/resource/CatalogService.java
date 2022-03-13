package com.movie.catalogService.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.movie.catalogService.model.CatalogItem;
import com.movie.catalogService.model.Movie;
import com.movie.catalogService.model.UserRatingWrapper;

@RestController
@RequestMapping("/catalog")
public class CatalogService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalogItem(@PathVariable("userId") String userId){
//		List<Rating> ratingList = Arrays.asList(new Rating("1234", 7), new Rating("12345", 4));
		//WebClient Implementation
		/*return ratingList
				.stream()
				.map(rating ->{
					Movie movie = webClientBuilder
							.build().get()
							.uri("http://localhost:8082/movies/"+rating.getMovieId())
							.retrieve().bodyToMono(Movie.class)
							.block();
					return new CatalogItem(movie.getName(), "DESC",rating.getRating());
				}).collect(Collectors.toList());*/
		//RestTemplate Implementation
		UserRatingWrapper ratingList= restTemplate.getForObject("http://rating-data-service/ratingdata/users/"+userId, UserRatingWrapper.class);
		return ratingList.getRatingList()
				.stream()
				.map(rating ->{
					Movie movie = restTemplate.getForObject("http://movie-info-service/movies/"+rating.getMovieId(), Movie.class);
					return new CatalogItem(movie.getName(), "DESC",rating.getRating());
				}).collect(Collectors.toList()) ;
	}
}
	