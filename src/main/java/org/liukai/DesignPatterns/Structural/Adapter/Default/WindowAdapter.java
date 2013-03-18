package org.liukai.DesignPatterns.Structural.Adapter.Default;

import java.awt.event.WindowEvent;

/**
 * WindowAdapter类别预先实现了WindowListener接口，每个方法中都是空的实现<br>
 * 适配器模式本质上就是提供一个中间的抽象类.所需要的类继承这个抽象类,然后按自己所需要的重载就好
 * 
 * @author liukai
 * 
 */
public abstract class WindowAdapter implements WindowListener {

	public void windowOpened(WindowEvent e) {

	}

	public void windowClosing(WindowEvent e) {

	}

	public void windowClosed(WindowEvent e) {

	}

	public void windowIconified(WindowEvent e) {

	}

	public void windowDeiconified(WindowEvent e) {

	}

	public void windowActivated(WindowEvent e) {

	}

	public void windowDecativated(WindowEvent e) {

	}

}
