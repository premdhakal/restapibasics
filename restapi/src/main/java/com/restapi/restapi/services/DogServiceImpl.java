package com.restapi.restapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.restapi.entity.DogEntity;
import com.restapi.restapi.repositories.DogRepository;

@Service
public class DogServiceImpl implements DogService{
@Autowired
DogRepository dogRepository;

public List<DogEntity> retriveDogs(){
	return (List<DogEntity>) dogRepository.findAll();
}

public Optional<DogEntity> retriveDogsById(Long id){
	return  dogRepository.findById(id);
}

@Override
public String retrieveDogsBreedById(long id) {
	Optional<String> optionalBreed = Optional.ofNullable(dogRepository.findBreedById(id));
	String breed = optionalBreed.orElseThrow(DogNotFoundException::new);
	return breed;
}


}
