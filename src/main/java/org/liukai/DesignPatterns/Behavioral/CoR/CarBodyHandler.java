package org.liukai.DesignPatterns.Behavioral.CoR;

public class CarBodyHandler extends CarHandler {

	@Override
	public void HandlerCar() {
		System.out.println("组装车身");
		if (this.carHandler != null) {
			this.carHandler.HandlerCar();
		}

	}

}
