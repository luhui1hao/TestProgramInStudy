package com.test;

class Zi extends Fu implements JieKou{
	public static String str1 = "static Zi str";
	public String str2 = "Zi str";
	
	public static void print1() {
		System.out.println("static Zi print()");
	}
	
	public void print2(){
		System.out.println("Zi print()");
	}
	
	public void print3(){
		super.print2();
	}

	public void printJ() {
		System.out.println("JieKou");
	}
}