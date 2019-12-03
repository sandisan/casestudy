package com.casestudy.salesorder;

import org.springframework.stereotype.Component;

@Component
public class ItemServiceFallback implements ItemService {

	@Override
	public Item getItemByName(String itemName) {
		// TODO Auto-generated method stub
		System.out.println("Falling back");
		Item itm = new Item();
		itm.setId(999L);
		itm.setName("default name");
		itm.setDescription("default Description");
		itm.setPrice(9999L);
		return itm ;
	}
	

}
