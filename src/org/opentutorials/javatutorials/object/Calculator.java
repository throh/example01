package org.opentutorials.javatutorials.object;

public class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	/**
	 * <B>History</B>
	 * <ul>
	 * <li>Date : 2017. 4. 21.
	 * <li>Developer : ����ȭ
	 * <li>���װ� ���װ��� �����ش�
	 * </ul>
	 * <ul>
	 * <li>Date : 2017. 4. 21.
	 * <li>Developer : ����ȭ
	 * <li>�ʱ⿡ Method�� �����ϴ� ��� ���� ul~/ul �±׸� �����Ͽ� �Ʒ��� �ٿ� �ְ� ������ ���뿡 ���� ����� �Ѵ�.
	 * </ul>
	 * 
	 */
	public int sum() {
		int sum = this.left + this.right;
		System.out.println(this.left + this.right);
		return sum;
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}

}
