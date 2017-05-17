package org.opentutorials.javatutorials.constant2;

import org.opentutorials.javatutorials.constant3.Company;
import org.opentutorials.javatutorials.constant3.Fruit;

class Fruit {
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
}

class Company {
	public static final Company GOOGLE = new Company();
	public static final Company APPLE = new Company();
	public static final Company ORACLE = new Company();
}

public class ConstantDemo2 {

	public static void main(String[] args) {
		if (Fruit.APPLE == Fruit.APPLE) {
			System.out.println("���� ���ð� ȸ�� ������ ����.");
		}
	}
}
