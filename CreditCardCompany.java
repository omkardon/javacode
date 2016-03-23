package com;

public class CreditCardCompany {
	public double getPaybackAmount(Customer customer) {
		
		double payBackAmount=0.0;
		
		double charge=customer.getCreditCardCharges();
		
			if(charge>0) {
				payBackAmount+=0.0025*charge;
				charge-=500;
			}
			if(charge>0) {
				if(charge<1000)
					payBackAmount+=0.005*charge;
				else
					payBackAmount+=0.005*1000;
				charge-=1000;
			}
			if(charge>0) {
				if(charge<1000)
					payBackAmount+=0.0075*charge;
				else
					payBackAmount+=0.0075*1000;
				charge-=1000;
			}
			if(charge>0) {
				payBackAmount+=0.01*charge;
			}

		return payBackAmount;
	}
}
