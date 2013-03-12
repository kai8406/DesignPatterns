package org.liukai.DesignPatterns.creational.Builder;

/**
 * Builder类--抽象建造者类
 * 
 * @author liukai
 * 
 */
public abstract class PizzaBuilder {

	protected Pizza pizza;

	public Pizza getPizza() {
		return pizza;
	}

	public void createNewPizzaProduct() {
		pizza = new Pizza();
	}

	public abstract void buildDough();

	public abstract void buildSauce();

	public abstract void buildTopping();

}
