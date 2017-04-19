package org.opentutorials.javatutorials.method;

import java.io.*; // 무시

/**
     * <B>Project Name : </B>example02<br/>
     * <B>Package Name : </B>org.opentutorials.javatutorials.method<br/>
     * <B>File Name : </B>MethodDemo7<br/>
     * <B>Description</B>
     * <ul> 
     * <li>여기에 해당 클래스에 대한 개요를 입력합니다.
     * <li>논리적으로 내용이 분리되는 경우 li 태그를 사용하여 개행 합니다.
     * </ul>
     * 
     * @author 노태화
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
         * <li>Developer : 노태화
         * <li>여기에 Method 관련 설명을 기록한다. 
         * </ul>
         * <ul>
         * <li>Date : 2017. 4. 19.
         * <li>Developer : 노태화
         * <li>초기에 Method를 수정하는 경우 위의 ul~/ul 태그를 복사하여 아래에 붙여 넣고 수정된 내용에 대한 기록을 한다.
         * </ul>
         *  
         * @param args
         */
    public static void main(String[] args) {
        String result = numbering(1, 5);
        System.out.println(result);
        try { // 무시
            // 다음 행은 out.txt 라는 파일에 numbering이라는 메소드가 반환한 값을 저장합니다.
            BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
            out.write(result);
            out.close();
        } catch (IOException e) {
        } // 무시
    }
}

