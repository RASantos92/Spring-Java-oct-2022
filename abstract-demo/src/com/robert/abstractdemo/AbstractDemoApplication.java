package com.robert.abstractdemo;

import com.robert.abstractdemo.models.Cash;
import com.robert.abstractdemo.models.CreditCard;

public class AbstractDemoApplication {

	public static void main(String[] args) {
//		Payment pay = new Payment();
		Cash puppy = new Cash(599.99);
		puppy.paymentDetails();
		CreditCard laptop = new CreditCard(2500.99, "5648384945", "Bobby Brown", "9/28");
		laptop.paymentDetails();
		
	}

}
