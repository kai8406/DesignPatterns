package org.liukai.DesignPatterns.Structural.Adapter.Default;

import java.awt.event.WindowEvent;
import java.util.EventListener;

/**
 * 实现WindowListener来定义一些视窗事件的处理方式，WindowListener中定义了七个方法
 * 
 * @author liukai
 * 
 */
public interface WindowListener extends EventListener {

	public void windowOpened(WindowEvent e);

	public void windowClosing(WindowEvent e);

	public void windowClosed(WindowEvent e);

	public void windowIconified(WindowEvent e);

	public void windowDeiconified(WindowEvent e);

	public void windowActivated(WindowEvent e);

	public void windowDecativated(WindowEvent e);

}
