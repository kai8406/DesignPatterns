package org.liukai.DesignPatterns.creational.FactoryMethod.demo2;

/**
 * 首先定义一个抽象类 形状 Shape,定义两个抽象的方法.
 * 
 * @author liukai
 * 
 */
public abstract class Shape {

	public String name;

	public Shape(String name) {
		this.name = name;
	}

	// 绘画
	public abstract void draw();

	// 擦除
	public abstract void erase();

}
