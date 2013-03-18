package org.liukai.DesignPatterns.Structural.Adapter.ClassAdapter;

/**
 * 适配器类，继承了被适配类，同时实现标准接口
 * 
 * @author liukai
 * 
 */
public class Adapter extends Adaptee implements Target {

	public void request() {
		super.specificRequest();
	}

}
