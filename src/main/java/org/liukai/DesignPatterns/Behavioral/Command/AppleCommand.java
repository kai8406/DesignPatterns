package org.liukai.DesignPatterns.Behavioral.Command;

public class AppleCommand extends Command {

	public AppleCommand(Peddler peddler) {
		super(peddler);
	}

	@Override
	public void sail() {
		this.getPeddler().sailApple();

	}

}
