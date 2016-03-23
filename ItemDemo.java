package com;

public class ItemDemo {
	public static void main(String [] args) {
		Item [] item=new Item[5];
		item[0]=new Item(1,"Floppy",100,5);
		item[1]=new Item(1,"Floppy",100,5);
		item[2]=new Item(1,"Floppy",100,5);
		item[3]=new Item(1,"Floppy",100,5);
		item[4]=new Item(1,"Floppy",100,5);
		
		System.out.println(getLeastPriceItem(item).getItemName());
	}
	
	public static Item getLeastPriceItem(Item[] items) {
		double min=items[0].getItemPrice()-(1/100)*items[0].getItemPrice()*items[0].getItemDiscount();
		Item ret_item=items[0];
		
		for(Item element:items) {
			double price=element.getItemPrice()-(1/100)*items[0].getItemPrice()*items[0].getItemDiscount();
			if(price<min) {
				min=price;
				ret_item=element;
			}
		}
		return ret_item;
	}
}
