package com.test;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test test = new Test();
		Zi zi = new Zi();
		
		//��̬����
		System.out.println("��̬������");
		zi.print1();
		((Fu) zi).print1();
		System.out.println("��̬������");
		System.out.println(zi.str1);
		System.out.println(((Fu)zi).str1);
		System.out.println("�Ǿ�̬������");
		zi.print2();
		((Fu) zi).print2();
		System.out.println("�Ǿ�̬������");
		System.out.println(zi.str2);
		System.out.println(((Fu)zi).str2);
		
		System.out.println("��Zi�е���super.print2()");
		zi.print3();
		
		
		/**
		 * ���ۣ��ڼ̳���  �����������ǲ��Ǿ�̬���� ��̬���� �ᱻ���أ�תΪ���໹���Ե��õ���
		 * �� �Ǿ�̬���� �ᱻ���ǣ�����ת��Ϊ����Ҳֻ�ܵ������෽����
		 */

//		((JieKou) zi).print();
	}

}
