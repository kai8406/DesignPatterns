package org.liukai.DesignPatterns.Behavioral.Command;

public abstract class Command {

	public Command(Peddler peddler) {
		this.peddler = peddler;
	}

	private Peddler peddler;

	public Peddler getPeddler() {
		return peddler;
	}

	public void setPeddler(Peddler peddler) {
		this.peddler = peddler;
	}

	public abstract void sail();

}
