package org.liukai.DesignPatterns.Behavioral.Template;

/**
 * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。该模式使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 * 
 * @author liukai
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MakeCar bus = new MakeBus();
		bus.make();

		System.out.println("-------------------");

		MakeCar jeep = new MakeJeep();
		jeep.make();

		System.out.println("-------------------");

		MakeCar ka = new MakeKa();
		ka.make();
	}

}
