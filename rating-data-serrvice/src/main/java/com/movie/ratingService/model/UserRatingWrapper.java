package com.movie.ratingService.model;

import java.util.List;

public class UserRatingWrapper {

	private List<Rating> ratingList;

	public UserRatingWrapper() {
		super();
	}

	public UserRatingWrapper(List<Rating> ratingList) {
		super();
		this.ratingList = ratingList;
	}

	public List<Rating> getRatingList() {
		return ratingList;
	}

	public void setRatingList(List<Rating> ratingList) {
		this.ratingList = ratingList;
	}
	
}
