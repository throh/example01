package org.opentutorials.javatutorials.abstractclass.example3;

/**
     * <B>Project Name : </B>example02<br/>
     * <B>Package Name : </B>org.opentutorials.javatutorials.abstractclass.example3<br/>
     * <B>File Name : </B>Calculator<br/>
     * <B>Description</B>
     * <ul> 
     * <li>강사 의견을 따라 protected를 사용하여 내용 변경함 --> 원본은 아래쪽 주석 참고.
     * <li>논리적으로 내용이 분리되는 경우 li 태그를 사용하여 개행 합니다.
     * </ul>
     * 
     * @author 노태화
     * @since 2017. 5. 8.
     */
abstract class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public abstract void sum();

	public abstract void avg();

	public void run() {
		sum();
		avg();
	}
	
	protected int _sum() {
		return this.left + this.right ;
	}
}

class CalculatorDecoPlus extends Calculator {
	public void sum() {
		System.out.println("+ sum :" + _sum());
	}

	public void avg() {
		System.out.println("+ avg :" + _sum() / 2);
	}
}



class CalculatorDecoMinus extends Calculator {
	public void sum() {
		System.out.println("- sum :" + ("+ sum :" + _sum()));
	}

	public void avg() {
		System.out.println("- avg :" + ("+ avg :" + _sum() / 2));
	}
}



public class CalculatorDemo {
	public static void main(String[] args) {
		CalculatorDecoPlus c1 = new CalculatorDecoPlus();
		c1.setOprands(10, 20);
		c1.run();

		CalculatorDecoMinus c2 = new CalculatorDecoMinus();
		c2.setOprands(10, 20);
		c2.run();
	}

}

/* --> 강의 원본
 package org.opentutorials.javatutorials.abstractclass.example3;
abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    public abstract void sum();  
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
}
class CalculatorDecoPlus extends Calculator {
    public void sum(){
        System.out.println("+ sum :"+(this.left+this.right));
    }
    public void avg(){
        System.out.println("+ avg :"+(this.left+this.right)/2);
    }
} 
class CalculatorDecoMinus extends Calculator {
    public void sum(){
        System.out.println("- sum :"+(this.left+this.right));
    }
    public void avg(){
        System.out.println("- avg :"+(this.left+this.right)/2);
    }
} 
public class CalculatorDemo {
    public static void main(String[] args) { 
        CalculatorDecoPlus c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
        c1.run();
         
        CalculatorDecoMinus c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
        c2.run();
    }
   
}

 */
