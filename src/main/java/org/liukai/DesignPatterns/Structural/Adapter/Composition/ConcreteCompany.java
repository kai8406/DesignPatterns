package org.liukai.DesignPatterns.Structural.Adapter.Composition;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {

	private List<Company> cList;

	public ConcreteCompany() {

		cList = new ArrayList<Company>();
	}

	public ConcreteCompany(String name) {
		super(name);
		cList = new ArrayList<Company>();
	}

	@Override
	protected void add(Company company) {
		cList.add(company);
	}

	@Override
	protected void romove(Company company) {
		cList.remove(company);

	}

	@Override
	protected void display(int depth) {

		StringBuilder sb = new StringBuilder("");

		for (int i = 0; i < depth; i++) {
			sb.append("-");
		}

		System.out.println(sb.toString() + this.getName());

		for (Company c : cList) {
			c.display(depth + 2);
		}

	}

}