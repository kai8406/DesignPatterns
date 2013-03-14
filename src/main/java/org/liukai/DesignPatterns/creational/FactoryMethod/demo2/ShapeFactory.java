package org.liukai.DesignPatterns.creational.FactoryMethod.demo2;

/**
 * Creator: 抽象创建器接口,声明返回Product类型对象的Factory Method.
 * 
 * @author liukai
 * 
 */
public abstract class ShapeFactory {

	protected abstract Shape factoryMethod(String name);

	public void anOperation(String name) {

		Shape shape = factoryMethod(name);

		System.out.println("当前形状是: " + shape.name);

		shape.draw();
		shape.erase();

	}

}
