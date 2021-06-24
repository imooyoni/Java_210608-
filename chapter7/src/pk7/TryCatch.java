package pk7;

import javax.swing.JOptionPane;

public class TryCatch {

	public static void main(String[] args) {
		int num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		try {//해당 작업을 구현
			System.out.println(num1/num2);
		} catch (ArithmeticException e) {
			//에러가 나면 >> 수학적인 오류(ArithmeticException)가 발생하면!
			System.out.println("숫자 0를 입력하시면 안됩니다.");//에러시 수행될 행위 
		} //try 내에서 에러가 나도 try에서 멈추지 않고 끝까지 이후 컴파일을 함
		
		System.out.println("Error 후 컴파일 => 프로그램 수행 끝");
	}

}
