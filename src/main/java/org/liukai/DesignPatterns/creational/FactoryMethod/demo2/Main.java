package org.liukai.DesignPatterns.creational.FactoryMethod.demo2;

/**
 * 抽象产品对应抽象创建器,具体产品对应具体创建器.这样做的好处是什么呢?为什么我们不直接用具体的产品和具体的创建器完成需求呢?
 * 实际上我们也可以这样做.但通过Factory Method模式来完成,客户(client)只需引用抽象的Product和Creater,
 * 
 * <pre>
 * 对具体的ConcreteProduct和ConcreteCreator可以毫不关心,这样做我们可以获得额外的好处:
 * 
 * 首先客户端可以统一从抽象创建器获取产生的实例,Creator的作用将client和产品创建过程分离开来,客户不用操心返回的是那一个具体的产品,也不用关心这些产品是如何创建的.
 * 同时,ConcreteProduct也被隐藏在Product后面,ConreteProduct继承了Product的所有属性,并实现了Product中定义的抽象方法,按照Java中的对象造型(cast)原则,
 * 通过ConcreteCreator产生的ConcreteProduct可以自动的上溯造型成Product.
 * 这样一来,实质内容不同的ConcreteProduct就可以在形式上统一为Product,通过Creator提供给client来访问.
 * 
 * 其次,当我们添加一个新的ConcreteCreator时,由于Creator所提供的接口不变,客户端程序不会有丝毫的改动,不会带来动一发而牵全身的灾难,这就是良好封装性的体现.
 * 但如果直接用ConcreteProduct和ConcreteCreator两个类是无论如何也做不到这点的.
 * 优良的面向对象设计鼓励使用封装(encapsulation)和委托(delegation),而Factory
 * Method模式就是使用了封装和委托的典型例子,这里封装是通过抽象创建器Creator来体现的,而委托则是通过抽象创建器把创建对象的责任完全交给具体创建器ConcreteCreator来体现的.
 * </pre>
 * 
 * @author liukai
 * 
 */
public class Main {

	public static void main(String[] args) {
		ShapeFactory sf1 = new CircleFactory();
		ShapeFactory sf2 = new SquareFactory();

		sf1.anOperation("Shape-Circle");
		sf2.anOperation("Shape-Square");
	}

}
