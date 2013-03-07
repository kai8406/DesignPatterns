package org.liukai.DesignPatterns.creational.AbstractFactory;

public class SQLServerOfUser implements IUser {

	public SQLServerOfUser() {
		System.out.println("SQL Server工厂:在SQL Server中操作User表.");
	}

}
