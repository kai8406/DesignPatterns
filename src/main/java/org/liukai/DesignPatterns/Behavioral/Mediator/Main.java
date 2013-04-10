package org.liukai.DesignPatterns.Behavioral.Mediator;

/**
 * 中介者模式的优点
 * 
 * <pre>
 * 1. 将系统按功能分割成更小的对象，符合类的最小设计原则 
 * 2. 对关联对象的集中控制 
 * 3. 减小类的耦合程度，明确类之间的相互关系：当类之间的关系过于复杂时，其中任何一个类的修改都会影响到其他类，不符合类的设计的开闭原则，
 *   而Mediator模式将原来相互依存的多对多的类之间的关系简化为Mediator控制类与其他关联类的一对多的关系，
 *   当其中一个类修改时，可以对其他关联类不产生影响（即使有修改，也集中在Mediator控制类）。 
 * 4. 有利于提高类的重用性
 * </pre>
 * 
 * @author liukai
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 创建一个中介者
		AbstractMediator mediator = new Mediator();

		// 创建两个同事
		ColleagueA colleagueA = new ColleagueA(mediator);
		ColleagueB colleagueB = new ColleagueB(mediator);

		// 中介者分别与每个同事建立联系
		mediator.addColleague("ColleagueA", colleagueA);
		mediator.addColleague("ColleagueB", colleagueB);

		// 同事们开始工作
		colleagueA.self();
		colleagueA.out();
		System.out.println("======================合作愉快，任务完成！\n");

		colleagueB.self();
		colleagueB.out();
		System.out.println("======================合作愉快，任务完成！");

	}

}
