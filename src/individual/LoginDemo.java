package individual;

public class LoginDemo {

	public static void main(String[] args) {
		String id = args[0];
		String pw = args[1];

		if (id.equals("throh")) {

			if (pw.equals("kkkkk")) {
				System.out.println("�ݰ����ϴ�");
			} else {
				System.out.println("Password�� Ȯ�����ּ���");
			}
		} else {
			System.out.println("ID�� Ȯ�����ּ���");
		}
	}
}
