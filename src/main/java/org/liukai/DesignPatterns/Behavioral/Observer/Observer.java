package org.liukai.DesignPatterns.Behavioral.Observer;

/**
 * 抽象的观察者，具有update()方法， 能够将接收到的信息进行逻辑处理， 可以是 interface ，不一定是抽象类
 */
public abstract class Observer {

	public abstract void update(String name);

}
