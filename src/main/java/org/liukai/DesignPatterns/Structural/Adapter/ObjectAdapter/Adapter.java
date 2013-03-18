package org.liukai.DesignPatterns.Structural.Adapter.ObjectAdapter;

/**
 * 适配器类，直接关联被适配类，同时实现标准接口<br>
 * 和类适配模式的区别在于不需要继承Adaptee类了,而是直接构造被适配类,并委托调用Adaptee的方法.
 * 
 * @author liukai
 * 
 */
public class Adapter implements Target {

	// 直接关联被适配类
	private Adaptee adaptee;

	// 可以通过构造函数传入具体需要适配的被适配类对象
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	public void request() {
		// 这里是使用委托的方式完成特殊功能
		this.adaptee.specificRequest();
	}

}
