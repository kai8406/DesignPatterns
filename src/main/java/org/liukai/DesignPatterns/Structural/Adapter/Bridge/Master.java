package org.liukai.DesignPatterns.Structural.Adapter.Bridge;

/**
 * 硕士生
 * 
 * @author liukai
 * 
 */
public class Master extends Student {

	public Master() {
	}

	@Override
	public void doMethod(Method method) {

		System.out.println("硕士生");

		method.method();

	}
}
