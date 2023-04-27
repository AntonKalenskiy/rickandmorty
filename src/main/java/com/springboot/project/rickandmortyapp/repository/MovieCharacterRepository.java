package com.springboot.project.rickandmortyapp.repository;

import com.springboot.project.rickandmortyapp.model.MovieCharacter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieCharacterRepository extends JpaRepository<MovieCharacter, Long> {
}
