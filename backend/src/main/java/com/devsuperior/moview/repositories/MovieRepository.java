package com.devsuperior.moview.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.moview.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
}

