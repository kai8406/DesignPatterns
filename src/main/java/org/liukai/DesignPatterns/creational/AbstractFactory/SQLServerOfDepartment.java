package org.liukai.DesignPatterns.creational.AbstractFactory;

public class SQLServerOfDepartment implements IDepartment {

	public SQLServerOfDepartment() {
		System.out.println("SQL Server工厂:在SQL Server中操作Department表.");
	}

}
