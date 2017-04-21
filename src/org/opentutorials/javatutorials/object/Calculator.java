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
	 * <li>Developer : 노태화
	 * <li>좌항과 우항값을 더해준다
	 * </ul>
	 * <ul>
	 * <li>Date : 2017. 4. 21.
	 * <li>Developer : 노태화
	 * <li>초기에 Method를 수정하는 경우 위의 ul~/ul 태그를 복사하여 아래에 붙여 넣고 수정된 내용에 대한 기록을 한다.
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
