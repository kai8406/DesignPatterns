package org.liukai.DesignPatterns.Structural.Adapter.Default;

import java.awt.event.WindowEvent;

/**
 * 可以继承WindowAdapter类别，并重新定义一些您所感兴趣的事件，如此一来，就可以避开之前所提及的，直接实现WindowListener接口的缺点
 * 
 * @author liukai
 * 
 */
public class WindowEventHandler extends WindowAdapter {

	@Override
	public void windowClosing(WindowEvent e) {
		super.windowClosing(e);
	}

}
