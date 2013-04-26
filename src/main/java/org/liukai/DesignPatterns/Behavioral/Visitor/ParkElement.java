package org.liukai.DesignPatterns.Behavioral.Visitor;

/**
 * 公园每一部分的抽象
 * 
 * @author liukai
 * 
 */
public interface ParkElement {

	// 用来接纳访问者
	public void accept(Visitor visitor);

}
