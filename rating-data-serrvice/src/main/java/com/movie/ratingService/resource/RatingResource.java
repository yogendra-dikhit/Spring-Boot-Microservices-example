package com.movie.ratingService.resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.ratingService.model.Rating;

@RestController
@RequestMapping("/ratingdata")
public class RatingResource {
	
	@RequestMapping("/{movieId}")
	public Rating getRatingData(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}

}
