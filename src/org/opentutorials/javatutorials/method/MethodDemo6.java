package org.opentutorials.javatutorials.method;
 
/**
     * <B>Project Name : </B>example02<br/>
     * <B>Package Name : </B>org.opentutorials.javatutorials.method<br/>
     * <B>File Name : </B>MethodDemo6<br/>
     * <B>Description</B>
     * <ul> 
     * <li>���ڸ� ������� ����ϴ� Ŭ�����Դϴ�.
     * <li>���������� ������ �и��Ǵ� ��� li �±׸� ����Ͽ� ���� �մϴ�.
     * </ul>
     * 
     * @author ����ȭ
     * @since 2017. 4. 19.
     */
public class MethodDemo6 {
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
         * @param init : �ʱ� ���۰�
         * @param limit : �Ѱ谪
         * @return
         */
    public static String numbering(int init, int limit) {
        int i = init;
        // ��������� ���ڵ��� output�̶�� ������ ��� ���ؼ� ������ �� ���� �־���.
        String output = "";
        while (i < limit) {
            // ���ڸ� ȭ�鿡 ����ϴ� ��� ���� output�� ��Ҵ�.
            output += i;
            i++;
        }
        // �߿�!!! output�� ��� �ִ� ���ڿ��� �޼ҵ� �ܺη� ��ȯ�Ϸ��� �Ʒ��� ���� return Ű���� �ڿ� ��ȯ�Ϸ��� ����
        // ��ġ�ϸ� �ȴ�.
        return output;
    }
 
    public static void main(String[] args) {
        // �޼ҵ� numbering�� ������ ���� ���� result�� ����.
        String result = numbering(3, 7);
        // ���� result�� ���� ȭ�鿡 ����Ѵ�.
        System.out.println(result);
    }
}