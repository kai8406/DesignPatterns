package org.liukai.DesignPatterns.Structural.Adapter.Decorator;

/**
 * 装饰模式（Decorator）：动态地给一个对象添加一些额外的职责，就增加功能来说，装饰 模式相比生成子类更为灵活。
 * 
 * 使用场景：
 * 
 * 1、在不影响其他对象的情况下，以动态、透明的方式给单个对象添加职责；
 * 
 * 2、处理那些可以撤消的职责；
 * 
 * 3、当不能采用生成子类的方法进行扩充时。
 * 
 * 心得：
 * 
 * 装饰器（Decorator）和被装饰的对象（ConcreteComponent）拥有统一的接口，这个统一的接口正是被装饰对象需要扩展功能的地方，
 * 因此它们需要一个共同的接口
 * （AbstractComponent）。另外为了完成装饰的目的，装饰器需要包含被装饰的对象，装饰器不直接包含被装饰对象，而是包含它们统一接口的引用
 * ，这样通过多态机制可以实现多层装饰
 * 。注意装饰器对抽象接口的关系是一对一的，这和组合模式很像，但是一对一的关系决定了装饰器一次只能装饰一个对象，这种关系正是我们想要的
 * 。装饰器为被装饰对象添加功能通过调用被装饰对象的统一接口实现
 * ，如果装饰器需要复杂的扩展，我们通过继承装饰器实现具体的装饰器（ConcreteDecorator
 * ），具体的装饰器可以扩展数据（addedState），也可以扩展接口功能（addedBehavior）。
 * 
 * 举例：
 * 
 * 被装饰的对象假如是一块蛋糕，装饰器就是为蛋糕添加额外的属性，比如加上一朵花等。统一接口为了简单我们输出装饰后蛋糕的名字，
 * 那么装饰器的统一接口operation实现时就需要调用被装饰对象的operation，然后添加额外的名字
 * 
 * @author liukai
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Car car = new RunCar();

		car.show();

		System.out.println("---------");

		Car swimcar = new SwimCarDecorator(car);
		swimcar.show();

		System.out.println("---------");

		Car flySwimCar = new FlyCarDecorator(swimcar);
		flySwimCar.show();

	}

}
