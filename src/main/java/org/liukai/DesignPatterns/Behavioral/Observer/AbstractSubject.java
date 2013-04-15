package org.liukai.DesignPatterns.Behavioral.Observer;

import java.util.ArrayList;

/**
 * 抽象的被观察者，是所有Observer的观察抽象主题
 * 
 * @author liukai
 * 
 */
public abstract class AbstractSubject {

	private ArrayList<Observer> allObservers = new ArrayList<Observer>();

	// 添加一个观察者，即添加一个QQ好友
	public void addObserver(Observer o) {
		this.allObservers.add(o);
	}

	// 添加一群观察者，即加入一个QQ群
	public void addAll(ArrayList<Observer> observers) {
		this.allObservers.addAll(observers);
	}

	// 删除一个观察者，即删除一个QQ好友
	public void deleteObserver(Observer o) {
		this.allObservers.remove(o);
	}

	// 删除一群好友，即退出一个QQ群
	public void deleteAll() {
		this.allObservers = null;
	}

	// 当我上线时，通知所有QQ好友，即所有Observer
	public void notifyObservers(String name) {
		for (Observer o : this.allObservers) {
			o.update(name);
		}
	}

}
