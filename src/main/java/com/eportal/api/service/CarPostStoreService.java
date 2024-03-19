package com.eportal.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eportal.api.dto.CarPostDTO;

@Service
public interface CarPostStoreService {

	List<CarPostDTO> getCarForSales();
	void changeCarForSale(CarPostDTO carPPost, String id);
	void removeCarForSale(String id);
	
	
}
