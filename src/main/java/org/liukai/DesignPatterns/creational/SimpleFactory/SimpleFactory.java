package org.liukai.DesignPatterns.creational.SimpleFactory;

/**
 * Simple Factory模式(又称Static Factory模式),一个Simple Factory生产成品,而对客户端隐藏产品产生的细节。<br>
 * 实作时定义一个产品介面(interface),并透过特定静态方法来建立成品。
 * 
 * @author liukai
 * 
 */
public class SimpleFactory {

	public static IShape createProduct(String product) {

		if (product.equals("circle")) {
			return new Circle();
		} else if (product.equals("square")) {
			return new Square();
		} else {
			System.out.println("本工厂不生产此产品.");
			return null;
		}

	}
}
