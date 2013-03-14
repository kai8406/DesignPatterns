package org.liukai.DesignPatterns.creational.FactoryMethod.demo2;

/**
 * 圆形子类(ConcreteProduct: Product的子类,一系列具体的产品.)
 * 
 * @author liukai
 * 
 */
public class Circle extends Shape {

	public Circle(String name) {
		super(name);
	}

	@Override
	public void draw() {
		System.out.println("我要画个圆!");

	}

	@Override
	public void erase() {
		System.out.println("我要擦除一个圆");

	}

}
