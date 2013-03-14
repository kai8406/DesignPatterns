package org.liukai.DesignPatterns.creational.FactoryMethod.demo1;

/**
 * FactoryMethod是一种创建性模式,它定义了一个创建对象的接口,但是却让子类来决定具体实例化哪一个类.
 * 当一个类无法预料要创建哪种类的对象或是一个类需要由子类来指定创建的对象时我们就需要用到Factory Method 模式了
 * 
 * @author liukai
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 创建一个具体工厂
		Factory factory = new ConcreteFactory();

		IProduct product01 = factory.createProduct(ConcreteProductA.class);
		IProduct product02 = factory.createProduct(ConcreteProductB.class);

		product01.method01();
		product01.method02();

		product02.method01();
		product02.method02();

	}

}
