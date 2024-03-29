package com.eportal.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eportal.api.dto.OwnerPostDTO;
import com.eportal.api.service.OwnerPostService;

@RestController
@RequestMapping("/api/owner")
public class OwnerPostController {

	@Autowired
	private OwnerPostService ownerPostService; 
	
	public ResponseEntity createOwnerCar(@RequestBody OwnerPostDTO ownerPostDTO) {
		ownerPostService.createOwnerCar(ownerPostDTO);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
