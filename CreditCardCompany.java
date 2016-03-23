package com;

public class CreditCardCompany {
	public double getPaybackAmount(Customer customer) {
		
		double payBackAmount=0.0;
		
		double charge=customer.getCreditCardCharges();
		
		if(charge>0)
			if(charge<500) {
				payBackAmount+=0.0025*charge;
				charge-=500;
			}
			if(charge<1500)  {
				payBackAmount+=0.005*charge;
				charge-=1000;
			}
			if(charge<2500) {
				payBackAmount+=0.0075*charge;
				charge-=1000;
			}
			if(charge>0) {
				payBackAmount+=0.01*charge;
			}

		return payBackAmount;
	}
}
