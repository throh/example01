package org.opentutorials.javatutorials.constant3;

/*
class Fruit {
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
} */

enum Fruit { // 위 class Fruit{ }와 동일
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	private String color;

	Fruit(String color) {
		System.out.println("Call Constructor " + this);
		this.color = color;
	}

	String getColor() {
		return this.color;
	}
}

enum Company {
	GOOGLE, APPLE, ORACLE;
}

public class ConstantDemo3 {

	public static void main(String[] args) {
		for (Fruit f : Fruit.values()) {
			System.out.println(f + ", " + f.getColor());
		}
	}
}
