package org.liukai.DesignPatterns.Structural.Adapter.Facade;

/**
 * Facade模式也叫外观模式，是由GoF提出的23种设计模式中的一种。Facade模式为一组具有类似功能的类群，比如类库，子系统等等，
 * 提供一个一致的简单的界面。这个一致的简单的界面被称作facade。
 * 
 * @author liukai
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Facade facade = new Facade();
		// facade.doABC();
		facade.doAB();
	}

}
