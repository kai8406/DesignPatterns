package org.liukai.DesignPatterns.creational.Prototype.demo3;

/**
 * http://haolloyin.blog.51cto.com/1177454/333442
 * 
 * <pre>
 * 由于使用clone()方法来拷贝一个对象是从内存二进制流中进行IO读写，所以拷贝得到一个对象是不会执行该对象所对应类的构造函数的
 * 总结如下:
 * 1、构造函数不会被执行； 
 * 2、类的成员变量中若有引用类型的变量（数组也是一种对象），默认的clone()并不会对其进行拷贝，需自行提供深拷贝；
 * </pre>
 * 
 * @author liukai
 * 
 */
public class Client {

	public static void main(String[] args) {

		ConcretePrototype02 prototype02 = new ConcretePrototype02("蚂蚁 ...");

		System.out.println(prototype02.getNameList());

		// 通过clone获得一个拷贝
		ConcretePrototype02 fromClone02 = prototype02.clone();
		fromClone02.setName("小蚂蚁 ...");

		System.out.println(fromClone02.getNameList());
		System.out.println(prototype02.getNameList());
	}

}
