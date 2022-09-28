package com.robert.abstractdemo.models;

import com.robert.abstractdemo.abstracts.Payment;

public class CreditCard extends Payment {
	
	private String cardNum, ownerName, expDate;

	public CreditCard(double amount, String cardNum, String ownerName, String expDate){
		super(amount);
		this.cardNum = cardNum;
		this.ownerName = ownerName;
		this.expDate = expDate;
	}
	
	@Override
	public void paymentDetails() {
		System.out.println("Card Number: " + this.cardNum+ " card holder name: " + this.ownerName + "exp Date: "+ this.expDate + "Payment amount: " + this.getAmount());
	}

}
