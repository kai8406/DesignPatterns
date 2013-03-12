package org.liukai.DesignPatterns.creational.Builder;

/**
 * Product--产品类
 * 
 * @author liukai
 * 
 */
public class Pizza {

	private String dough;// 生面团
	private String sauce; // 酱
	private String topping; // 甜品酱

	public String getDough() {
		return dough;
	}

	public void setDough(String dough) {
		this.dough = dough;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

}
