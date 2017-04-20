package org.opentutorials.javatutorials.object;

/** --- 내가 만든 소스
 * public class ClaculatorDemo3 { 
 * 
 * public static void avg(int left, int right) {
 * 
 * System.out.println((left + right)/2); }
 * 
 * public static void main(String[] args) { 
 * avg(10, 20);
 * 
 * } }
 */

/**
     * <B>Project Name : </B>example02<br/>
     * <B>Package Name : </B>org.opentutorials.javatutorials.object<br/>
     * <B>File Name : </B>ClaculatorDemo3<br/>
     * <B>교재 소스</B>
     * <ul> 
     * <li>여기에 해당 클래스에 대한 개요를 입력합니다.
     * <li>논리적으로 내용이 분리되는 경우 li 태그를 사용하여 개행 합니다.
     * </ul>
     * 
     * @author 노태화
     * @since 2017. 4. 20.
     */
/**
     * <B>Project Name : </B>example02<br/>
     * <B>Package Name : </B>org.opentutorials.javatutorials.object<br/>
     * <B>File Name : </B>ClaculatorDemo3<br/>
     * <B>Description</B>
     * <ul> 
     * <li>여기에 해당 클래스에 대한 개요를 입력합니다.
     * <li>논리적으로 내용이 분리되는 경우 li 태그를 사용하여 개행 합니다.
     * </ul>
     * 
     * @author 노태화
     * @since 2017. 4. 20.
     */
public class ClaculatorDemo3 {

	public static void avg(int left, int right) {
		System.out.println((left + right) / 2);
	}

	public static void sum(int left, int right) {
		System.out.println(left + right);
	}

	public static void main(String[] args) {
        int left, right;
 
        left = 10;
        right = 20;
 
        sum(left, right);
        avg(left, right);
 
        left = 20;
        right = 40;
 
        sum(left, right);
        avg(left, right);
    }
}