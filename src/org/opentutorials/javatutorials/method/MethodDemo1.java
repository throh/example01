package org.opentutorials.javatutorials.method;

public class MethodDemo1 {
	
	 /**
	     * <B>History</B>
	     * <ul>
	     * <li>Date : 2017. 4. 19.
	     * <li>Developer : ����ȭ
	     * <li>���⿡ Method ���� ������ ����Ѵ�. 
	     * </ul>
	     * <ul>
	     * <li>Date : 2017. 4. 19.
	     * <li>Developer : ����ȭ
	     * <li>�ʱ⿡ Method�� �����ϴ� ��� ���� ul~/ul �±׸� �����Ͽ� �Ʒ��� �ٿ� �ְ� ������ ���뿡 ���� ����� �Ѵ�.
	     * </ul>
	     *  
	     */
	public static void numbering() {
		
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		numbering();
		//numbering();
	}
}
