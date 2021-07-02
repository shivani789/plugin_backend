package com.slb.controllers;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.slb.models.Rating;
import com.slb.services.RatingService;

@RestController
public class MainController{
	
	@Autowired
	RatingService ratingService;
	
	/**Create An Entry into the DB
	 * */
	@PostMapping("/create")
	public Rating createEntry(@RequestBody(required = true) Rating rating) {
		
		long timestamp = Instant.now().getEpochSecond();
		rating.setId(timestamp);
		rating.setTimestamp(timestamp);
		ratingService.saveRating(rating);
		
		return rating;
	}
	
	/**Read All Entries from DB
	 * **/
	@GetMapping("/read")
	@CrossOrigin("*")
	public List<Rating> getAllEntries() {
		return ratingService.getRatings();
	}
	
	/**Read one Specific Entry from DB
	 * **/
	@GetMapping("/read/{id}")
	@CrossOrigin("*")
	public Rating getEntry(@PathVariable(required = true) Long id ) {
		Optional<Rating> rating = ratingService.getRating(id);
		return rating.isPresent() ? rating.get(): null;
	}
	
	/**Update an Entry in the DB
	 * */
	@PutMapping("/update")
	@CrossOrigin("*")
	public Rating updateEntry(@RequestBody(required = true) Rating rating) {
		ratingService.updateRating(rating);
		return rating;
	}
	
	/**Delete an Entity from DB
	 * */
	@DeleteMapping("/delete/{id}")
	@CrossOrigin("*")
	public String deleteEntity(@PathVariable(required = true) Long id) {
		ratingService.deleteRating(id);
		return "OK";
	}
	

}