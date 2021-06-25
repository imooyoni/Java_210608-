package pk5;

import javax.swing.JOptionPane;

public class DoWhile02 {
	
	public static void main(String[] args) {
		//do~while : 무조건 한번 실행하고 반복시작됨

		int Num1, Num2;
		// do/while >> 값을 먼저 입력 받고 그것이 같은지 다른지 비교하는 코드 예)가위바위보 
		do {
			Num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
			Num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
			
			if (Num1 == Num2) {
				System.out.println("Same!!");
				break;
		
			}
			System.out.print("Num1 : " + Num1 + "/");
			System.out.println(" Num2 : " +Num2);
			System.out.println("different!!");
		}while(Num1 != Num2);
		
	}

}
//데이터 프로젝트 이중포문
//조건을 줘서 제한을 걸어야 겠다 싶으면  if 혹은 switch

/* 취소하면 오류가 남 >> 취소 한 이후 동작 코딩이 없어서 그럼 
Exception in thread "main" java.lang.NumberFormatException: null
at java.base/java.lang.Integer.parseInt(Integer.java:614)
at java.base/java.lang.Integer.parseInt(Integer.java:770)
at pk5.DoWhile02.main(DoWhile02.java:13) */
