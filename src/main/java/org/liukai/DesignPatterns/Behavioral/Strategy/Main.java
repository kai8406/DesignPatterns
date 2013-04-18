package org.liukai.DesignPatterns.Behavioral.Strategy;

/**
 * 定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。策略模式使得算法可独立于使用它的客户而变化。
 * 
 * 适用场景：
 * 
 * 1、许多相关的类仅仅是行为有异。“策略”提供了一种用多个行为中的一个行为来配置一个类的方法；
 * 
 * 2、需要使用一个算法的不同变体；
 * 
 * 3、算法使用客户不应该知道的数据。可使用策略模式以避免暴露复杂的、与算法相关的数据结构；
 * 
 * 4、一个类定义了多种行为, 并且这些行为在这个类的操作中以多个条件语句的形式出现。将相关的条件分支移入它们各自的Strategy 类中以代替这些条件语句。
 * 
 * 
 * 策略模式实际上是把条件判断的逻辑（即各个条件分支，也就是每个具体策略）转移到客户端了，由客户来选择不同的具体策略
 * 
 * @author liukai
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 加法
		System.out.println(Calculator.Add.calculate(20, 13));

		// 减法
		System.out.println(Calculator.Sub.calculate(20, 13));

	}

}
