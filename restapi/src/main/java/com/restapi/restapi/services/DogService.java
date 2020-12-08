package com.restapi.restapi.services;

import java.util.List;

import com.restapi.restapi.entity.DogEntity;

public interface DogService {
	List<DogEntity> retriveDogs();
	String retrieveDogsBreedById(long id);
}
