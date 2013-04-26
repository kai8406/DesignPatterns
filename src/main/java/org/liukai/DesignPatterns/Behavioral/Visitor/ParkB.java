package org.liukai.DesignPatterns.Behavioral.Visitor;

/**
 * 公园的B部分
 * 
 * @author liukai
 * 
 */
public class ParkB implements ParkElement {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
