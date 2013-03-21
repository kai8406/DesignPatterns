package org.liukai.DesignPatterns.Structural.Adapter.Decorator;

public class RunCar implements Car {

	public void show() {
		this.run();

	}

	public void run() {
		System.out.println("可以跑");

	}

}
