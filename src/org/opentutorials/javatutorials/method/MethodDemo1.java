package org.opentutorials.javatutorials.method;

public class MethodDemo1 {
	
	 /**
	     * <B>History</B>
	     * <ul>
	     * <li>Date : 2017. 4. 19.
	     * <li>Developer : 노태화
	     * <li>여기에 Method 관련 설명을 기록한다. 
	     * </ul>
	     * <ul>
	     * <li>Date : 2017. 4. 19.
	     * <li>Developer : 노태화
	     * <li>초기에 Method를 수정하는 경우 위의 ul~/ul 태그를 복사하여 아래에 붙여 넣고 수정된 내용에 대한 기록을 한다.
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
