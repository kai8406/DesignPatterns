package org.liukai.DesignPatterns.Structural.Adapter.ObjectAdapter;

/**
 * 对象适配模式, 修改的只不过就是 Adapter 类的内部结构，即 Adapter 自身必须先拥有一个被适配类的对象，再把具体的特殊功能委托给这个对象来实现.<br>
 * 适配器模式不适合在详细设计阶段使用它，它是一种补偿模式，专用来在系统后期扩展、修改时所用
 * 
 * @author liukai
 * 
 */
public class Main {

	public static void main(String[] args) {
		// 使用普通功能类
		Target concreteTarget = new ConcreteTarget();
		concreteTarget.request();

		// 使用特殊功能类，即适配类，
		// 需要先创建一个被适配类的对象作为参数
		Target adapter = new Adapter(new Adaptee());
		adapter.request();

	}

}
