package com;

public class ToyDemo {

	public static void main(String[] args) {
		Toy [] t=new Toy[4];
		t[0]=new Toy("elephant","kids",80,10);
		t[1]=new Toy("bike","kids",120,15);
		t[2]=new Toy("kitchen set","kids",100,5);
		t[3]=new Toy("Gun","kids",200,30);

	}
	
	public static String getLeastPriceToy(Toy t1, Toy t2, Toy t3, Toy t4, String param_category) {
		double [] price= new double [4];
		double max;
		String highest_category=null; 
		if(param_category=="") {
			return "no category found";
		}
		
		//Calculate highest among prices
				//return t.name as output
				//like if price-price*discount*(1/100) is least
				//return its name as output
		
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
		
		max=price[0];
		for(double e:price) {
			if(e>max)
				max=e;
		}
		
		if(t1.getPrice()==max)
			highest_category=t1.getCategory();
		if(t2.getPrice()==max)
			highest_category=t2.getCategory();
		if(t3.getPrice()==max)
			highest_category=t3.getCategory();
		if(t4.getPrice()==max)
			highest_category=t4.getCategory();
		
		return highest_category;
		
	}

}
