package org.liukai.DesignPatterns.creational.AbstractFactory;

/**
 * 具体工厂角色:SQL Server工厂
 * 
 * @author liukai
 * 
 */
public class SQLServerFactory implements IDBFactory {

	public IUser createUser() {
		return new SQLServerOfUser();
	}

	public IDepartment createDepartment() {
		return new SQLServerOfDepartment();
	}

}
