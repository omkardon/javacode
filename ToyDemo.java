package com;

public class ToyDemo {

	public static void main(String[] args) {
		Toy t1=new Toy("elephant","kids",80,10);
		Toy t2=new Toy("bike","kids",120,15);
		Toy t3=new Toy("kitchen set","kids",100,5);
		Toy t4=new Toy("Gun","kids",200,30);
		
		

	}
	public static String getLeastPriceToy(Toy t1, Toy t2, Toy t3, Toy t4, String param_category) {
		double [] price= new double [4];
		if(param_category=="") {
			return "no category found";
		}
		
		if(t1.getCategory().equals(param_category)) {
			price[0]=t1.getPrice();
		}
		if(t2.getCategory().equals(param_category)) {
			price[1]=t1.getPrice();
		}
		if(t3.getCategory().equals(param_category)) {
			price[2]=t1.getPrice();
		}
		if(t4.getCategory().equals(param_category)) {
			price[3]=t1.getPrice();
		}
		//Calculate highest among prices
		//return t.name as output
		//like if price-price*discount*(1/100) is least
		//return its name as output
	}

}
