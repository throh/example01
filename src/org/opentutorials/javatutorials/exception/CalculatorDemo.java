package org.opentutorials.javatutorials.exception;

class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}

	public String toString() {
		return "left : " + this.left + ", right : " + this.right;
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		System.out.println(c1);
		System.out.println(c1.toString());
	}

}


/*
class DivideException extends Exception {
	DivideException() {
		super();
	}

	DivideException(String message) {
		super(message);
	}
}

class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void divide() throws DivideException {
		if (this.right == 0) {
			throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
		}
		System.out.print(this.left / this.right);
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		try {
			c1.divide();
		} catch (DivideException e) {
			e.printStackTrace();
		}
	}
}*/

/*
class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void divide() {
		System.out.print("계산결과는 ");
		System.out.print(this.left / this.right);
		System.out.print(" 입니다.");
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		c1.divide();
	}
}
*/
