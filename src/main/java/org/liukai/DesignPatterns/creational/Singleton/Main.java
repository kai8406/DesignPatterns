package org.liukai.DesignPatterns.creational.Singleton;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		if (singleton == singleton2) {
			System.out.println("s1 is the same instance with s2");
		} else {
			System.out.println("s1 is not the same instance with s2");
		}

	}

}
