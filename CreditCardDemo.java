package com;

public class CreditCardDemo {

	public static void main(String[] args) {
		
		
		CreditCardCompany company=new CreditCardCompany();
		
		Customer [] cust = new Customer [5];
		
		cust[0]=new Customer(10, 20, 2800);
		cust[1]=new Customer(11, 21, 3500);
		cust[2]=new Customer(12, 22, 4500);
		cust[3]=new Customer(13, 23, 1200);
		cust[4]=new Customer(14, 24, 3400);
		
		for(Customer customer:cust) {
			System.out.println(company.getPaybackAmount(customer));
		}

	}

}
