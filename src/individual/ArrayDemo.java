package individual;

public class ArrayDemo {

	public static void main(String[] args) {
		String[] demo = { "throh", "lions" };

		// System.out.println(demo[0]);
		// System.out.println(demo.length);
		/*
		 * for (int i =0; i < demo.length; i++) { String demos = demo[i];
		 * System.out.println(demo[i] + "가 작성했습니다.!!!");
		 */

		for (String e : demo) {
			System.out.println(e + "가 작성했습니다.!!!");
		}

	}

}
