package com.eportal.api.service;

import java.util.List;

import com.eportal.api.dto.CarPostDTO;

public interface CarPostStoreService {

	List<CarPostDTO> getCarForSales();
	void changeCarForSale(CarPostDTO carPPost, String id);
	void remove(String id);
	
	
}
