package org.liukai.DesignPatterns.creational.AbstractFactory;

/**
 * 具体工厂角色:Oracle工厂
 * 
 * @author liukai
 * 
 */
public class OracleFactory implements IDBFactory {

	public IUser createUser() {
		return new OracleOfUser();
	}

	public IDepartment createDepartment() {
		return new OracleOfDepartment();
	}

}
