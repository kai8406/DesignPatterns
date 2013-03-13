package org.liukai.DesignPatterns.creational.Prototype.demo2;

/**
 * 原型01，实现Cloneable接口并覆盖clone()方法
 * 
 * @author liukai
 * 
 */
public class ConcretePrototype01 implements Cloneable {

	private String name;

	public ConcretePrototype01(String name) {
		this.name = name;
	}

	public void getName() {
		System.out.println(name);
	}

	/**
	 * 覆盖Object基类中的clone()方法，并扩大该方法的访问权限，具体化返回本类型
	 */
	public ConcretePrototype01 clone() {

		ConcretePrototype01 self = null;
		try {

			self = (ConcretePrototype01) super.clone();

		} catch (CloneNotSupportedException e) {

			e.printStackTrace();

		}

		return self;
	}

}
