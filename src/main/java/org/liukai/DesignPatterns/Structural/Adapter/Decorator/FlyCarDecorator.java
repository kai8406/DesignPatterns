package org.liukai.DesignPatterns.Structural.Adapter.Decorator;

public class FlyCarDecorator extends CarDecorator {

	public FlyCarDecorator(Car car) {
		super(car);
	}

	public void fly() {
		System.out.println("可以飞");
	}

	@Override
	public void show() {
		this.getCar().show();
		this.fly();

	}

	public void run() {

	}

}
