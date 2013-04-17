package org.liukai.DesignPatterns.Behavioral.State;

public class LargeState implements IState {

	public void switchClockWise(FireSwitch sw) {
		sw.setState(new LargeState());
		System.out.println("large fire");
	}

	public void switchCountClock(FireSwitch sw) {
		sw.setState(new SmallState());
		System.out.println("small fire");
	}

}
