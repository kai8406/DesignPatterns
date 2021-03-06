package org.liukai.DesignPatterns.creational.FactoryMethod.demo2;

/**
 * ConcreteCreator: 具体的创建器,重写Creator中的Factory Method, 返回ConcreteProduct类型的实例.
 * 
 * @author liukai
 * 
 */
public class CircleFactory extends ShapeFactory {

	@Override
	protected Shape factoryMethod(String name) {
		return new Circle(name + " (created by CircleFactory)");
	}

}
