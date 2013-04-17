package org.liukai.DesignPatterns.Behavioral.State;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		FireSwitch fireSwitch = new FireSwitch();

		fireSwitch.switchClockWise();
		fireSwitch.switchClockWise();
		fireSwitch.switchClockWise();
		fireSwitch.switchClockWise();

		System.out.println();

		fireSwitch.switchCountClock();
		fireSwitch.switchCountClock();
		fireSwitch.switchCountClock();
		fireSwitch.switchCountClock();

	}

}
