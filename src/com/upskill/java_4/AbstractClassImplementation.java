package com.upskill.java_4;

public class AbstractClassImplementation extends Abstractclass {

	@Override
	public void iDoor() {
		System.out.println("My Car has 4 doors");
		
	}

	@Override
	public int iWheel() {
		System.out.println("My Car has 4 wheels");
		return 4;
	}

	@Override
	public void iColor() {
		System.out.println("My Car is Red");
		
	}

	@Override
	public String iEngine() {
		System.out.println("My Car has dual engine");
		return "Dual Motor";
	}

}
