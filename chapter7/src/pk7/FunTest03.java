package pk7;

import javax.swing.JOptionPane;

public class FunTest03 {

	public void sum(int a, int b) { //받아서 복사해주는게 2번
		
		System.out.println(a +" + "+b+ " = " + (a+b));
	} 
	//C언어:call by value a(value)=0(값);
	//정렬, 교체 등의 경우 call by value가 아닌 "*(pointer)"(call by reference)가 들어가야함
	

	//void는 리턴값을 가질 수 없다
	public static void main(String[] args) {
		int num1, num2;
		num1=Integer.parseInt(JOptionPane.showInputDialog("값1 :" )); // 값 받는게 1번
		num2=Integer.parseInt(JOptionPane.showInputDialog("값2 :" ));
		
	//	sum(num1,num2);
		
		//static에서 호출되지 않았으므로 컴파일 할 수 없음 >> static이 없는 경우 main과 속도 차이가 발생함!
		
		//public void sum erro 이유: static은 static만 사용할 수 있음! sum메소드가 static이 아니기 때문에 오류남!
		//sum에서 리턴값을 주려면 main에 받을 값이 있어야 함ex int result 같이 별도 설정이 있어야함
		
		FunTest03 Obj = new FunTest03();
		Obj.sum(num1, num2); // 메소드에 static을 입력하지 않은 경우, 객체(Obj)를 만들어서 강제로 호출
		
	}

}
