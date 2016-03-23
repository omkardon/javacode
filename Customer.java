package com;

public class Customer {
	private int custid;
	private int accId;
	private double creditCardCharges;
	
	public Customer(int custid, int accId, double creditCardCharges) {
		super();
		this.custid = custid;
		this.accId = accId;
		this.creditCardCharges = creditCardCharges;
	}
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public double getCreditCardCharges() {
		return creditCardCharges;
	}
	public void setCreditCardCharges(double creditCardCharges) {
		this.creditCardCharges = creditCardCharges;
	}

}
