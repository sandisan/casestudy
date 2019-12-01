package com.casestudy.salesorder;

import org.springframework.stereotype.Component;

@Component
public class ItemServiceFallback implements ItemService {

	@Override
	public Item getItemByName(String itemName) {
		// TODO Auto-generated method stub
		System.out.println("Falling back");
		return new Item();
	}
	

}
