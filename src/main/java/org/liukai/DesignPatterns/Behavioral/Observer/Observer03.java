package org.liukai.DesignPatterns.Behavioral.Observer;

/**
 * 具体观察者03，即QQ好友-03
 * 
 * @author liukai
 * 
 */
public class Observer03 extends Observer {

	@Override
	public void update(String name) {
		System.out.println("QQ好友-03 得知 " + name + "上线了");
	}

}
