package org.liukai.DesignPatterns.creational.AbstractFactory;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		OracleFactory of = new OracleFactory();
		SQLServerFactory sf = new SQLServerFactory();

		IUser oracleUser = of.createUser();
		IDepartment oracleDept = of.createDepartment();

		IUser sqlUser = sf.createUser();
		IDepartment sqlDept = sf.createDepartment();

	}

}
