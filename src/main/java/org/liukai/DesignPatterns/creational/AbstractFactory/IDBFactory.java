package org.liukai.DesignPatterns.creational.AbstractFactory;

/**
 * 抽象工厂角色:工厂接口<br>
 * 
 * 抽象工厂模式（Abstract Factory） 针对多个产品等级的情况，而工厂方法模式针对单一产品等级的情况。 <br>
 * 
 * <pre>
 * 
 * 抽象工厂模式优点：
 * 
 * 1.易于交换产品系列，由于具体工厂类，例如IDBFactory factory = new OracleFactory()，在一个应用中只需要在初始化的时候出现一次.
 * 这就使得改变一个应用的具体工厂变得非常容易，只需要改变具体工厂即可使用不同的产品配置。
 * 
 * 2.它让具体的创建实例与客户端分离，客户端是通过它们的抽象接口操纵实例，产品的具体类名也被具体工厂的实现分离，不会出现在客户端代码中。
 * </pre>
 * 
 * @author liukai
 * 
 */
public interface IDBFactory {

	public IUser createUser();

	public IDepartment createDepartment();

}
