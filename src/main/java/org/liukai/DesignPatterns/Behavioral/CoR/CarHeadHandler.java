package org.liukai.DesignPatterns.Behavioral.CoR;

public class CarHeadHandler extends CarHandler {

	@Override
	public void HandlerCar() {
		System.out.println("组装车头");
		if (this.carHandler != null) {
			this.carHandler.HandlerCar();
		}

	}

}
