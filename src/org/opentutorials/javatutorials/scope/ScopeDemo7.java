package org.opentutorials.javatutorials.scope;

class C {
	int v = 10;

	void m() {
		int v = 45600;
		System.out.println(v);
		System.out.println(this.v); //this는 해당객체에 대한 전역의 개념을 가진다.
	}
}

public class ScopeDemo7 {

	public static void main(String[] args) {
		C c1 = new C();
		c1.m();
	}

}
