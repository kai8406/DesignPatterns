package org.liukai.DesignPatterns.Behavioral.Observer;

/**
 * 具体的被观察者，是某些Observer的观察主题
 * 
 * @author liukai
 * 
 */
public class Subject01 extends AbstractSubject {

	public void login(String name) {
		System.out.println("哈哈...蚂蚁-01 登录 QQ ...");
		// 立即通知所有QQ好友
		super.notifyObservers(name);
	}
}
