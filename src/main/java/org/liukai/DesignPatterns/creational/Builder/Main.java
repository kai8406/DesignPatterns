package org.liukai.DesignPatterns.creational.Builder;

/**
 * 建造者模式的好处就是使得建造代码与表示代码分离<br>
 * 由于建造者隐藏了该产品是如何组装的，所以若需要改变一个产品的内部表示，只需要再定义一个具体的建造者
 * 
 * <pre>
 * Builder: 为创建一个Product对象的各个部件指定抽象接口。
 * ConcreteBuilder: 实现Builder的接口以构造和装配该产品的各个部件。定义并明确它所创建的表示提供一个检索产品的接口
 * Director:  构造一个使用Builder接口的对象。
 * Product: 表示被构造的复杂对象。ConcreateBuilder创建该产品的内部表示并定义它的装配过程。
 * </pre>
 * 
 * 
 * @author liukai
 * 
 */
public class Main {

	public static void main(String[] args) {

		Waiter waiter = new Waiter();

		PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicy_pizzabuilder = new SpicyPizzaBuilder();

		System.out.println("------------HawaiianPizza------------");

		waiter.setPizzaBuilder(hawaiian_pizzabuilder);
		waiter.constructPizza();

		System.out.println("------------SpicyPizza------------");

		waiter.setPizzaBuilder(spicy_pizzabuilder);
		waiter.constructPizza();

		// Pizza pizza = waiter.getPizza();

	}

}
