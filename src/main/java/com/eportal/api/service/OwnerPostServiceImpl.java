package com.eportal.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eportal.api.client.CarPostStoreClient;
import com.eportal.api.dto.OwnerPostDTO;

@Service
public class OwnerPostServiceImpl implements OwnerPostService{

	@Autowired
	private CarPostStoreClient carPostStoreClient;

	@Override
	public void createOwnerCar(OwnerPostDTO ownerPostDTO) {
		carPostStoreClient.ownerPostsClient(ownerPostDTO);
	} 
	
}
