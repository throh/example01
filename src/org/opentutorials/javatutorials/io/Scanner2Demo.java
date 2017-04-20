package org.opentutorials.javatutorials.io;

import java.util.Scanner;

/**
     * <B>Project Name : </B>example02<br/>
     * <B>Package Name : </B>org.opentutorials.javatutorials.io<br/>
     * <B>File Name : </B>Scanner2Demo<br/>
     * <B>Description</B>
     * <ul> 
     * <li>���⿡ �ش� Ŭ������ ���� ���並 �Է��մϴ�.
     * <li>�������� ������ �и��Ǵ� ��� li �±׸� ����Ͽ� ���� �մϴ�.
     * </ul>
     * 
     * @author ����ȭ
     * @since 2017. 4. 20.
     */
public class Scanner2Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			System.out.println(sc.nextInt() * 1000);
		}
		sc.close();
	}

}
