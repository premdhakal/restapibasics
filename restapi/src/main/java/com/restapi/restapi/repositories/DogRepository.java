package com.restapi.restapi.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.restapi.restapi.entity.DogEntity;

public interface DogRepository extends CrudRepository<DogEntity, Long> {

	@Query("select d.id, d.breed from DogEntity d where d.id=:id")
	String findBreedById(Long id);
}
