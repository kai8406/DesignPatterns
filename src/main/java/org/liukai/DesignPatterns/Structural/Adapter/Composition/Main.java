package org.liukai.DesignPatterns.Structural.Adapter.Composition;

/**
 * 意图：将对象组合成树形结构以表示“部分-整体”的层次结构，使得用户对单个对象和组合对象的使用具有一致性。
 * 
 * 应用：组合图形、文件目录、GUI容器等。 心得：
 * 
 * 用户（Client）通过抽象类（Component）提供的公用接口统一操作基本对象（Leaf）和组合对象（Composite）。
 * 抽象对象应该拥有操作基本对象和组合对象的所有接口
 * ，但是基本对象应该屏蔽某些组合对象特有的操作，如添加删除等。组合对象聚合了多个抽象对象，这种一对多的关系和继承关系正好描述了一种树形的组合结构。
 * 
 * 举例：
 * 
 * 抽象对象看作抽象出来的文件，Leaf看作具体的文件，Composite看作文件夹。那么这个模式描述的是用户通过操纵一个抽象的文件对象，
 * 而不用关系这个对象是文件还是文件夹。文件对象是不允许添加子文件操作的，文件夹对象可以包含多个抽象的文件，即可以是文件也可以子文件夹。
 * 
 * @author liukai
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Company root = new ConcreteCompany();
		root.setName("北京总公司");
		root.add(new HRDepartment("总公司人力资源部"));
		root.add(new FinanceDepartment("总公司财务部"));

		Company shandongCom = new ConcreteCompany("山东分公司");
		shandongCom.add(new HRDepartment("山东分公司人力资源部"));
		shandongCom.add(new FinanceDepartment("山东分公司账务部"));

		Company zaozhuangCom = new ConcreteCompany("枣庄办事处");
		zaozhuangCom.add(new FinanceDepartment("枣庄办事处财务部"));
		zaozhuangCom.add(new HRDepartment("枣庄办事处人力资源部"));

		Company jinanCom = new ConcreteCompany("济南办事处");
		jinanCom.add(new FinanceDepartment("济南办事处财务部"));
		jinanCom.add(new HRDepartment("济南办事处人力资源部"));
		shandongCom.add(jinanCom);
		shandongCom.add(zaozhuangCom);

		Company huadongCom = new ConcreteCompany("上海华东分公司");
		huadongCom.add(new HRDepartment("上海华东分公司人力资源部"));
		huadongCom.add(new FinanceDepartment("上海华东分公司账务部"));

		Company hangzhouCom = new ConcreteCompany("杭州办事处");
		hangzhouCom.add(new FinanceDepartment("杭州办事处财务部"));
		hangzhouCom.add(new HRDepartment("杭州办事处人力资源部"));

		Company nanjingCom = new ConcreteCompany("南京办事处");
		nanjingCom.add(new FinanceDepartment("南京办事处财务部"));
		nanjingCom.add(new HRDepartment("南京办事处人力资源部"));
		huadongCom.add(hangzhouCom);
		huadongCom.add(nanjingCom);

		root.add(shandongCom);
		root.add(huadongCom);
		root.display(0);

	}

}
