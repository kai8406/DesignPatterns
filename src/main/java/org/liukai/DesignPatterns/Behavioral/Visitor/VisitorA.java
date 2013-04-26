package org.liukai.DesignPatterns.Behavioral.Visitor;

/**
 * 清洁工A,负责parkA的卫生情况
 * 
 * @author liukai
 * 
 */
public class VisitorA implements Visitor {

	public void visit(Park park) {
		// TODO Auto-generated method stub

	}

	public void visit(ParkA parkA) {
		System.out.println("清洁工A:完成公园" + parkA.getName() + "的卫生");
	}

	public void visit(ParkB parkB) {
		// TODO Auto-generated method stub

	}

}
