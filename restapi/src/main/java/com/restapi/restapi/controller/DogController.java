package com.restapi.restapi.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.restapi.entity.DogEntity;
import com.restapi.restapi.services.DogService;

@RestController
public class DogController {

	@Autowired
	private DogService dogService;
	
	/*
	 * @GetMapping("/dogs") public ResponseEntity<DogEntity> getAllDogs(){
	 * List<DogEntity> dogEntity = dogService.equals(obj) return new
	 * ResponseEntity<>(status) }
	 */

	@GetMapping("/{id}/dogs/breedById")
	public ResponseEntity<String> getAllDogsById(@PathVariable Long id){
		String breed = dogService.retrieveDogsBreedById(id);
		return new ResponseEntity<String>(breed, HttpStatus.OK);
	}
}
