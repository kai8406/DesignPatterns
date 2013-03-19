package org.liukai.DesignPatterns.creational.Builder;

/**
 * 建造者模式的好处就是使得建造代码与表示代码分离<br>
 * 由于建造者隐藏了该产品是如何组装的，所以若需要改变一个产品的内部表示，只需要再定义一个具体的建造者
 * 
 * <pre>
 * Builder: 为创建一个Product对象的各个部件指定抽象接口。
 * ConcreteBuilder: 实现Builder的接口以构造和装配该产品的各个部件。定义并明确它所创建的表示提供一个检索产品的接口
 * Director:  构造一个使用Builder接口的对象。
 * Product: 表示被构造的复杂对象。ConcreateBuilder创建该产品的内部表示并定义它的装配过程。
 * 
 * 实现要点:
 * 
 * 1、建造者模式主要用于“分步骤构建一个复杂的对象”，在这其中“分步骤”是一个稳定的算法，而复杂对象的各个部分则经常变化。
 * 
 * 2、产品不需要抽象类，特别是由于创建对象的算法复杂而导致使用此模式的情况下或者此模式应用于产品的生成过程，其最终结果可能差异很大，不大可能提炼出一个抽象产品类。
 * 
 * 3、创建者中的创建子部件的接口方法不是抽象方法而是空方法，不进行任何操作，具体的创建者只需要覆盖需要的方法就可以，但是这也不是绝对的，特别是类似文本转换这种情况下，缺省的方法将输入原封不动的输出是合理的缺省操作。
 * 
 * 4、前面我们说过的抽象工厂模式（Abtract Factory）解决“系列对象”的需求变化，Builder模式解决“对象部分”的需求变化，建造者模式常和组合模式（Composite Pattern）结合使用。
 * 
 * 效果:
 * 
 * 1、建造者模式的使用使得产品的内部表象可以独立的变化。使用建造者模式可以使客户端不必知道产品内部组成的细节。
 * 
 * 2、每一个Builder都相对独立，而与其它的Builder无关。
 * 
 * 3、可使对构造过程更加精细控制。
 * 
 * 4、建造者模式的缺点在于难于应付“分步骤构建算法”的需求变动。
 * 
 * 适用性:
 * 
 * 1、需要生成的产品对象有复杂的内部结构。
 * 
 * 2、需要生成的产品对象的属性相互依赖，建造者模式可以强迫生成顺序。
 * 
 * 3、在对象创建过程中会使用到系统中的一些其它对象，这些对象在产品对象的创建过程中不易得到。
 * 
 *  总结：
 * 
 * 　　建造者模式的实质是解耦组装过程和创建具体部件，使得我们不用去关心每个部件是如何组装的。
 * </pre>
 * 
 * 
 * @author liukai
 * 
 */
public class Main {

	public static void main(String[] args) {

		Waiter waiter = new Waiter();

		PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicy_pizzabuilder = new SpicyPizzaBuilder();

		System.out.println("------------HawaiianPizza------------");

		waiter.setPizzaBuilder(hawaiian_pizzabuilder);
		waiter.constructPizza();

		System.out.println("------------SpicyPizza------------");

		waiter.setPizzaBuilder(spicy_pizzabuilder);
		waiter.constructPizza();

		// Pizza pizza = waiter.getPizza();

	}

}
