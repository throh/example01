package individual;

public class ArrayDemo {

	public static void main(String[] args) {
		String[] demo = { "throh", "lions" };

		// System.out.println(demo[0]);
		// System.out.println(demo.length);
		/*
		 * for (int i =0; i < demo.length; i++) { String demos = demo[i];
		 * System.out.println(demo[i] + "�� �ۼ��߽��ϴ�.!!!");
		 */

		for (String e : demo) {
			System.out.println(e + "�� �ۼ��߽��ϴ�.!!!");
		}

	}

}
