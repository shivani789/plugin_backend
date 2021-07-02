package com.slb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slb.models.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long>{}