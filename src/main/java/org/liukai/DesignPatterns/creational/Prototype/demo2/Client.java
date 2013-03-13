package org.liukai.DesignPatterns.creational.Prototype.demo2;

public class Client {

	public static void main(String[] args) {

		ConcretePrototype01 prototype01 = new ConcretePrototype01("蚂蚁 ...");
		prototype01.getName();

		// 通过clone获得一个拷贝
		ConcretePrototype01 fromClone01 = prototype01.clone();
		fromClone01.getName();
	}

}
