package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {
	static int i; //전역변수

	static void a() {
		i = 0;
	}

	public static void main(String[] args) {
		
		for (i = 0; i < 5; i++) { // 변수 i를 선언하지 않았으므로, 전역변수 사용하고 있음
			a();
			System.out.println(i);
		}
	}

}
