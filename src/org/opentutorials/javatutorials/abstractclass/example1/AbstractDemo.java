package org.opentutorials.javatutorials.abstractclass.example1;

abstract class A {
	public abstract int b();

	// ��ü�� �ִ� �޼ҵ�� abstract Ű���带 ���� �� ����.
	// public abstract int c(){System.out.println("Hello")} --> ��ü�� �����Ƿ� �߻�Ŭ���� ��� �ȵ�
	// �߻� Ŭ���� ������ �߻� �޼ҵ尡 �ƴ� �޼ҵ尡 ���� �� �� �ִ�.
	public void d() {
		System.out.println("world");
	}
}

class B extends A {
	public int b() {
		return 1;
	}
	
}

public class AbstractDemo {
	public static void main(String[] args) {
		//A obj = new A();
		B obj = new B();
	}
}
