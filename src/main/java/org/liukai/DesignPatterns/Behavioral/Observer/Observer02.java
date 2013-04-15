package org.liukai.DesignPatterns.Behavioral.Observer;

/**
 * 具体观察者02，即QQ好友-02
 * 
 * @author liukai
 * 
 */
public class Observer02 extends Observer {

	@Override
	public void update(String name) {
		System.out.println("QQ好友-02 得知 " + name + "上线了");
	}

}
