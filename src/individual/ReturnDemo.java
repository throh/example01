package individual;

public class ReturnDemo {

	public static void main(String[] args) {
		rdivide(4, 2);
		rdivide(8, 0);
		rdivide(9, 3);
		//rdivide(8, 0);
	}

	public static void rdivide(int i, int j) {
		if (j == 0) {
			System.out.println("0으로는 나누기 불가합니다. !!!");
			return;
		}
		System.out.println("결과 : " + i / j + "입니다.");
	}

}
