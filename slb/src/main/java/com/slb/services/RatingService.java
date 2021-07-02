  
package com.slb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slb.models.Rating;
import com.slb.repositories.RatingRepository;

@Service
public class RatingService {
	
	@Autowired
	private RatingRepository ratingsRepo;

	public List<Rating> getRatings(){
		return ratingsRepo.findAll();
	}
	
	public void saveRating(Rating rating) {
		ratingsRepo.save(rating);
	}
	
	public Optional<Rating> getRating(Long id) {
		return ratingsRepo.findById(id);
	}
	
	public void updateRating(Rating rating) {
		ratingsRepo.save(rating);
	}
	
	public void deleteRating(Long id) {
		ratingsRepo.deleteById(id);
	}
}