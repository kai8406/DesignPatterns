package org.liukai.DesignPatterns.Behavioral.Visitor;

/**
 * 访问者
 * 
 * @author liukai
 * 
 */
public interface Visitor {
	
	public void visit(Park park);

	public void visit(ParkA parkA);

	public void visit(ParkB parkB);
}
