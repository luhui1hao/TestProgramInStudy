package com.test;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test test = new Test();
		Zi zi = new Zi();
		
		//静态方法
		System.out.println("静态方法：");
		zi.print1();
		((Fu) zi).print1();
		System.out.println("静态变量：");
		System.out.println(zi.str1);
		System.out.println(((Fu)zi).str1);
		System.out.println("非静态方法：");
		zi.print2();
		((Fu) zi).print2();
		System.out.println("非静态变量：");
		System.out.println(zi.str2);
		System.out.println(((Fu)zi).str2);
		
		System.out.println("在Zi中调用super.print2()");
		zi.print3();
		
		
		/**
		 * 结论：在继承中  变量（不管是不是静态）和 静态方法 会被隐藏（转为父类还可以调用到）
		 * 而 非静态方法 会被覆盖（就算转型为父类也只能调用子类方法）
		 */

//		((JieKou) zi).print();
	}

}
