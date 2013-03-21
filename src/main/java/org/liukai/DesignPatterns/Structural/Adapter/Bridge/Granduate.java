package org.liukai.DesignPatterns.Structural.Adapter.Bridge;

/**
 * 本科生
 * 
 * @author liukai
 * 
 */
public class Granduate extends Student {

	public Granduate() {
	}

	@Override
	public void doMethod(Method method) {

		System.out.println("本科生");

		method.method();

	}

}
