package org.liukai.DesignPatterns.Structural.Adapter.ObjectAdapter;

/**
 * 对象适配模式, 修改的只不过就是 Adapter 类的内部结构，即 Adapter
 * 自身必须先拥有一个被适配类的对象，再把具体的特殊功能委托给这个对象来实现.<br>
 * 适配器模式不适合在详细设计阶段使用它，它是一种补偿模式，专用来在系统后期扩展、修改时所用
 * 
 * <pre>
 * 要点：
 * 1．Adapter模式主要应用于“希望复用一些现存的类，但是接口又与复用环境要求不一致的情况”，在遗留代码复用、类库迁移等方面非常有用。
 * 2．Adapter模式有对象适配器和类适配器两种形式的实现结构，但是类适配器采用“多继承”的实现方式，带来了不良的高耦合，所以一般不推荐使用。对象适配器采用“对象组合”的方式，更符合松耦合精神。适用性：
 * 　在以下各种情况下使用适配器模式：
 * 1．系统需要使用现有的类，而此类的接口不符合系统的需要。
 * 2．想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作。这些源类不一定有很复杂的接口。
 * 3.（对对象适配器而言）在设计里，需要改变多个已有子类的接口，如果使用类的适配器模式，就要针对每一个子类做一个适配器，而这不太实际。
 * </pre>
 * 
 * @author liukai
 * 
 */
public class Main {

	public static void main(String[] args) {
		// 使用普通功能类
		Target concreteTarget = new ConcreteTarget();
		concreteTarget.request();

		// 使用特殊功能类，即适配类，
		// 需要先创建一个被适配类的对象作为参数
		Target adapter = new Adapter(new Adaptee());
		adapter.request();

	}

}
