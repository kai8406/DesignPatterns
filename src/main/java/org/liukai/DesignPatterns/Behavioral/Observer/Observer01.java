package org.liukai.DesignPatterns.Behavioral.Observer;

/**
 * 具体观察者01，即QQ好友-01
 * 
 * @author liukai
 * 
 */
public class Observer01 extends Observer {

	@Override
	public void update(String name) {
		System.out.println("QQ好友-01 得知 " + name + "上线了");
	}

}
