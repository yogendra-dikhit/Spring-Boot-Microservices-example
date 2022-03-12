package com.movie.infoService.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.infoService.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {

	@RequestMapping("/{movieId}")
	public Movie getMovieInfo( @PathVariable("movieId") String movieId) {
		return new Movie(movieId,"Name for ID "+ movieId);
	}
}
