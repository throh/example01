/**
 * 
 */
package org.opentutorials.javatutorials.interfaces.example2;

/**
     * <B>Project Name : </B>example02<br/>
     * <B>Package Name : </B>org.opentutorials.javatutorials.interfaces.example2<br/>
     * <B>File Name : </B>Calculatable<br/>
     * <B>Description</B>
     * <ul> 
     * <li>여기에 해당 클래스에 대한 개요를 입력합니다.
     * <li>논리적으로 내용이 분리되는 경우 li 태그를 사용하여 개행 합니다.
     * </ul>
     * 
     * @author 노태화
     * @since 2017. 5. 10.
     */
public interface Calculatable {
	
	public void setOprands(int first, int second, int third);

	public int sum();

	public int avg();

}
