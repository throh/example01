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
			System.out.println("0���δ� ������ �Ұ��մϴ�. !!!");
			return;
		}
		System.out.println("��� : " + i / j + "�Դϴ�.");
	}

}
