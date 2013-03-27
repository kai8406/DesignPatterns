package org.liukai.DesignPatterns.Structural.Adapter.Flyweight;

/**
 * Flyweight的目的在于运用共享技术，使得一些细粒度的物件可以共享。
 * 
 * @author liukai
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1.创建MyCharacter工厂
		MyCharacterFactory factory = new MyCharacterFactory();

		// 2.从工厂中取出相应的MyCharacter
		MyCharacter myChar1 = factory.getMyCharacter('a');
		MyCharacter myChar2 = factory.getMyCharacter('b');
		MyCharacter myChar3 = factory.getMyCharacter('a');
		MyCharacter myChar4 = factory.getMyCharacter('d');

		myChar1.display();
		myChar2.display();
		myChar3.display();
		myChar4.display();

		if (myChar1 == myChar3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
