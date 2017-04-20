package org.opentutorials.javatutorials.io;

import java.util.Scanner;

/**
     * <B>Project Name : </B>example02<br/>
     * <B>Package Name : </B>org.opentutorials.javatutorials.io<br/>
     * <B>File Name : </B>Scanner2Demo<br/>
     * <B>Description</B>
     * <ul> 
     * <li>여기에 해당 클래스에 대한 개요를 입력합니다.
     * <li>논리적으로 내용이 분리되는 경우 li 태그를 사용하여 개행 합니다.
     * </ul>
     * 
     * @author 노태화
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
