package com.eportal.api.service;

import org.springframework.stereotype.Service;

import com.eportal.api.dto.OwnerPostDTO;

@Service
public interface OwnerPostService {

	void createOwnerCar(OwnerPostDTO ownerPostDTO);
	
}
