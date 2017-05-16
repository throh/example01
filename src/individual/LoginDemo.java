package individual;

public class LoginDemo {

	public static void main(String[] args) {
		String id = args[0];
		String pw = args[1];

		if (id.equals("throh")) {

			if (pw.equals("kkkkk")) {
				System.out.println("반갑습니다");
			} else {
				System.out.println("Password를 확인해주세요");
			}
		} else {
			System.out.println("ID를 확인해주세요");
		}
	}
}
