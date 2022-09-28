package com.robert.interfacedemo;

import com.robert.interfacedemo.models.Cat;
import com.robert.interfacedemo.models.Dog;

public class InterfaceDemoApplication {

	public static void main(String[] args) {
		
		Dog d = new Dog("Firulais");
		Cat c = new Cat("Potato Barry");
		System.out.println(d.getName());
		d.showAffection();
		d.askForFood();
		System.out.println("***************************");
		System.out.println(c.getName());
		c.showAffection();
		c.askForFood();
		
	}

}
