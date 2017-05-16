package individual;

public class ThreeOper {

	public static void main(String[] args) {
		int i = 100;
		int j = 500;

		int first, second;

		first = (i > j) ? i : j;
		System.out.println(first);

		second = (i < j) ? i : j;
		System.out.println(second);

	}

}
