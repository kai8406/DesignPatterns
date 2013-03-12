package org.liukai.DesignPatterns.creational.Builder;

/**
 * ConcreteBuilder类--具体建造者类 <br>
 * 辣Pizza
 * 
 * @author liukai
 * 
 */
public class SpicyPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		System.out.println("Spicy-Dough");
		pizza.setDough("Spicy-Dough");
	}

	@Override
	public void buildSauce() {
		System.out.println("Spicy-Sauce");
		pizza.setSauce("Spicy-Sauce");
	}

	@Override
	public void buildTopping() {
		System.out.println("Spicy-Topping");
		pizza.setTopping("Spicy-Topping");
	}
}
