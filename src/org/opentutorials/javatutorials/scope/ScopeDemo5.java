package org.opentutorials.javatutorials.scope;

public class ScopeDemo5 {

	static int  i = 555;

	public static void main(String[] args) {

		for ( i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		System.out.println(i);
		
	}

}
