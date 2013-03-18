package org.liukai.DesignPatterns.Structural.Adapter.ClassAdapter;

/**
 * Adapter 类既继承了 Adaptee （被适配类），也实现了 Target 接口（Java 不能多重继承,但是通过此方法可以达到多重继承的效果）<br>
 * 在 Client 类中我们可以根据需要选择并创建任一种符合需求的子类，来实现具体功能。<br>
 * 
 * 原理就是新建一个实现了目标接口,以及继承了不符合我们既有的标准接口但又必须的类. 然后在新类中实现接口中定义的方法.并在方法中调用父类的方法.
 * 
 * @author liukai
 * 
 */
public class Main {

	public static void main(String[] args) {

		// 使用普通功能类
		Target concreteTarget = new ConcreteTarget();
		concreteTarget.request();

		// 使用特殊功能类，即适配类
		Target adapter = new Adapter();
		adapter.request();
	}

}
