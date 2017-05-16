package individual;

public class MethodDemo {

	// public static void numbering(int start, int end) {
	/*
	 * for (int i = 0; i < 10; i++) { System.out.println(i); }
	 * 
	 * int i = start; while (i < end) { System.out.println(i); i++; }
	 */

	// }

	public static String numbering(int start, int end) {
		String output = "";
		int i = start;
		while (i < end) {
			output += i;
			i++;
		}
		return output;
	}

	public static void main(String[] args) {
		String result = numbering(1, 7);
		System.out.println(result);
	}

}
