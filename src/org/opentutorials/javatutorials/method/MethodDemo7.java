package org.opentutorials.javatutorials.method;

import java.io.*; // ����

/**
     * <B>Project Name : </B>example02<br/>
     * <B>Package Name : </B>org.opentutorials.javatutorials.method<br/>
     * <B>File Name : </B>MethodDemo7<br/>
     * <B>Description</B>
     * <ul> 
     * <li>���⿡ �ش� Ŭ������ ���� ���並 �Է��մϴ�.
     * <li>�������� ������ �и��Ǵ� ��� li �±׸� ����Ͽ� ���� �մϴ�.
     * </ul>
     * 
     * @author ����ȭ
     * @since 2017. 4. 19.
     */
public class MethodDemo7 {
    public static String numbering(int init, int limit) {
        int i = init;
        String output = "";
        while (i < limit) {
			output += i;
			i++;
		}
        return output;
    }
 
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
         * @param args
         */
    public static void main(String[] args) {
        String result = numbering(1, 5);
        System.out.println(result);
        try { // ����
            // ���� ���� out.txt ��� ���Ͽ� numbering�̶�� �޼ҵ尡 ��ȯ�� ���� �����մϴ�.
            BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
            out.write(result);
            out.close();
        } catch (IOException e) {
        } // ����
    }
}

