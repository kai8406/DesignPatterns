package org.liukai.DesignPatterns.creational.FactoryMethod.demo2;

/**
 * 方形子类(ConcreteProduct: Product的子类,一系列具体的产品.)
 * 
 * @author liukai
 * 
 */
public class Square extends Shape {

	public Square(String name) {
		super(name);
	}

	@Override
	public void draw() {
		System.out.println("我要画一个方形.");
	}

	@Override
	public void erase() {
		System.out.println("我要擦除一个方形.");
	}

}
