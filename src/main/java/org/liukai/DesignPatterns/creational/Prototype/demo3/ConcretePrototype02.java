package org.liukai.DesignPatterns.creational.Prototype.demo3;

import java.util.ArrayList;

/**
 * 原型02，成员变量中包含引用变量，得用深拷贝
 * 
 * @author liukai
 * 
 */
public class ConcretePrototype02 implements Cloneable {

	private String name;
	private ArrayList<String> nameList = new ArrayList<String>();

	public ConcretePrototype02(String name) {
		this.name = name;
		this.nameList.add(this.name);
	}

	// 添加nameList中的对象
	public void setName(String name) {
		this.nameList.add(name);
	}

	public ArrayList<String> getNameList() {
		return this.nameList;
	}

	// 覆盖Object基类中的clone()方法，并扩大该方法的访问权限，具体化返回本类型
	public ConcretePrototype02 clone() {
		ConcretePrototype02 self = null;
		try {
			self = (ConcretePrototype02) super.clone();
			// 以下这句是实现深拷贝的关键
			self.nameList = (ArrayList<String>) this.nameList.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return self;
	}

}
