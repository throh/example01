package org.opentutorials.javatutorials.object;

/** --- ���� ���� �ҽ�
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
     * <B>���� �ҽ�</B>
     * <ul> 
     * <li>���⿡ �ش� Ŭ������ ���� ���並 �Է��մϴ�.
     * <li>�������� ������ �и��Ǵ� ��� li �±׸� ����Ͽ� ���� �մϴ�.
     * </ul>
     * 
     * @author ����ȭ
     * @since 2017. 4. 20.
     */
/**
     * <B>Project Name : </B>example02<br/>
     * <B>Package Name : </B>org.opentutorials.javatutorials.object<br/>
     * <B>File Name : </B>ClaculatorDemo3<br/>
     * <B>Description</B>
     * <ul> 
     * <li>���⿡ �ش� Ŭ������ ���� ���並 �Է��մϴ�.
     * <li>�������� ������ �и��Ǵ� ��� li �±׸� ����Ͽ� ���� �մϴ�.
     * </ul>
     * 
     * @author ����ȭ
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