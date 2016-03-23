package com;

public class CreditCardDemo {

	public static void main(String[] args) {
		
		
		CreditCardCompany company=new CreditCardCompany();
		
		Customer [] cust = new Customer [5];
		
		cust[0]=new Customer(10, 20, company.getPaybackAmount(cust[0]));
		cust[1]=new Customer(11, 21, company.getPaybackAmount(cust[1]));
		cust[2]=new Customer(12, 22, company.getPaybackAmount(cust[2]));
		cust[3]=new Customer(13, 23, company.getPaybackAmount(cust[3]));
		cust[4]=new Customer(14, 24, company.getPaybackAmount(cust[4]));
		
		for(Customer customer:cust) {
			System.out.println(customer.getCreditCardCharges());
		}

	}

}
