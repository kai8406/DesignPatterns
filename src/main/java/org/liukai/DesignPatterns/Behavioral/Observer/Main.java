package org.liukai.DesignPatterns.Behavioral.Observer;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 创建 蚂蚁-01 号
		Subject01 subject01 = new Subject01();

		// 为 蚂蚁-01 号添加好友
		Observer observer01 = new Observer01();
		Observer observer02 = new Observer02();
		Observer observer03 = new Observer03();
		subject01.addObserver(observer01);
		subject01.addObserver(observer02);
		subject01.addObserver(observer03);

		// 蚂蚁-01 号 登录，好友们马上会被通知
		subject01.login("蚂蚁-01 号");

		System.out.println();

		// 假如对QQ好友-03隐身，则以后他不会被通知
		subject01.deleteObserver(observer03);
		subject01.login("蚂蚁-01 号");

	}

}
