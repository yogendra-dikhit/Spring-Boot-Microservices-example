package com.movie.ratingService.resource;
import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.ratingService.model.Rating;
import com.movie.ratingService.model.UserRatingWrapper;

@RestController
@RequestMapping("/ratingdata")
public class RatingResource {
	
	@RequestMapping("/{movieId}")
	public Rating getRatingData(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}

	@RequestMapping("users/{userId}")
	public UserRatingWrapper getMovieList(@PathVariable("userId") String userId) {
		return new UserRatingWrapper(Arrays.asList(new Rating("1234", 7), new Rating("12345", 4)));
	}
}
