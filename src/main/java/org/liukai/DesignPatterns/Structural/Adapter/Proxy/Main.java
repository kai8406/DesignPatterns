package org.liukai.DesignPatterns.Structural.Adapter.Proxy;

/**
 * subject（抽象主题角色）： 真实主题与代理主题的共同接口。 RealSubject（真实主题角色）： 定义了代理角色所代表的真实对象。
 * Proxy（代理主题角色）： 含有对真实主题角色的引用，代理角色通常在将客户端调用传递给真是主题对象之前或者之后执行某些操作，而不是单纯返回真实的对象。
 * 
 * @author liukai
 * 
 */
public class Main {

	public static void main(String[] args) {
		ProxySubject proxySubject = new ProxySubject();
		proxySubject.sailBook();

	}

}
