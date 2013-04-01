package org.liukai.DesignPatterns.Behavioral.CoR;

/**
 * 职责链模式的优缺点
 * 
 * <pre>
 * 优点：
 * 1. 责任的分担。每个类只需要处理自己该处理的工作（不该处理的传递给下一个对象完成），明确各类的责任范围，符合类的最小封装原则。 
 * 2.可以根据需要自由组合工作流程。如工作流程发生变化，可以通过重新分配对象链便可适应新的工作流程。 
 * 3. 类与类之间可以以松耦合的形式加以组织。 
 * 
 * 缺点： 因为处理时以链的形式在对象间传递消息，根据实现方式不同，有可能会影响处理的速度。
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
		CarHandler headH = new CarHeadHandler();
		CarHandler bodyH = new CarBodyHandler();
		CarHandler tailH = new CarTailHandler();

		// 组装顺序预先设定好,顺序是车头-->车身-->车尾
		headH.setNextHandler(bodyH);
		bodyH.setNextHandler(tailH);

		// 调用职责链的链头来完成操作
		headH.HandlerCar();

		System.out.println("---------------");

		// 顺序改变，希望是车身-->车头--车尾
		bodyH.setNextHandler(headH);
		headH.setNextHandler(tailH);
		bodyH.HandlerCar();

		System.out.println("---------------");

		// 简便操作
		bodyH.setNextHandler(headH).setNextHandler(tailH);
		bodyH.HandlerCar();

	}

}
