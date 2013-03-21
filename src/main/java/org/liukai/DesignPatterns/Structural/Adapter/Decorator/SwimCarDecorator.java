package org.liukai.DesignPatterns.Structural.Adapter.Decorator;

public class SwimCarDecorator extends CarDecorator {

	public SwimCarDecorator(Car car) {
		super(car);
	}

	public void run() {

	}

	public void swim() {
		System.out.println("可以游");
	}

	@Override
	public void show() {
		this.getCar().show();
		this.swim();

	}

}
