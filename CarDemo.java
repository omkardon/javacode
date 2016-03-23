package com;

public class CarDemo {

	public static void main(String[] args) {
		Car [] c=new Car [4];
		c[0]=new Car("name ","model",1,1.2);
		c[1]=new Car("","",2,2.3);
		c[2]=new Car("","",3,3.4);
		c[3]=new Car("","",4,4.2);

	}
	
	public static String bestCar(Car c1,Car c2,Car c3,Car c4,char compareType) {
		
		String bestCarName=null;
		
		if(compareType=='c') {
			//compare based on passenger capacity, find highest and return carname
		}
		
		else if(compareType=='p') {
			//compare based on price, find highest and return carname
		}
		
		return bestCarName;
	}

}
