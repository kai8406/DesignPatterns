package org.liukai.DesignPatterns.Behavioral.Template;

public class MakeKa extends MakeCar {

	@Override
	public void makeHead() {
		System.out.println("ka:组装车头");
	}

	@Override
	public void makeBody() {
		System.out.println("ka:组装车身");
	}

	@Override
	public void makeTail() {
		System.out.println("ka:组装车尾");
	}

}
