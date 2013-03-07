package org.liukai.DesignPatterns.creational.SimpleFactory;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SimpleFactory.createProduct("circle").draw();
		SimpleFactory.createProduct("square").draw();

	}

}
