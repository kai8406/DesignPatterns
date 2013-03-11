package org.liukai.DesignPatterns.creational.Singleton;

/**
 * 为了实现 Singleton 模式，我们需要的是一个静态的变量，能够在不创建对象的情况下记忆是否已经产生过实例了。<br>
 * 静态变量或静态方法都可以在不产生具体实例的情况下直接调用 ,这样的变量或方法不会因为类的实例化而有所改变。<br>
 * 在静态方法 getInstance()
 * 中对这个变量进行判断，若没有实例化过就产生一个新的对象，如果已经实例化了则不再产生新的对象，仍然返回以前产生的实例。
 * 
 * @author liukai
 * 
 */
public class Singleton {

	private static Singleton singleton;

	/**
	 * 把构造函数设置为private
	 */
	private Singleton() {
	}

	/**
	 * 实例化对象的唯一接口
	 * 
	 * @return
	 */
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

}
