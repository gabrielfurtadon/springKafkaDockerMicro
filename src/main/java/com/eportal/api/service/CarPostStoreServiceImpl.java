package com.eportal.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eportal.api.client.CarPostStoreClient;
import com.eportal.api.dto.CarPostDTO;

@Service
public class CarPostStoreServiceImpl implements CarPostStoreService{

	@Autowired
	private CarPostStoreClient carPostStoreClient;
	
	@Override
	public List<CarPostDTO> getCarForSales() {
		return carPostStoreClient.carForSaleClient();
	}

	@Override
	public void changeCarForSale(CarPostDTO carPost, String id) {
		carPostStoreClient.changeCarForSaleClient(carPost, id);
	}

	@Override
	public void removeCarForSale(String id) {
		carPostStoreClient.deleteCarForSaleClient(id);
		
	}

}
