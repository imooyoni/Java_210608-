package pk5;

import javax.swing.JOptionPane;

public class IfExample07 {
		
		public static void main(String[] args) {
			
			int Num1, Num2;
			
			Num1=Integer.parseInt(JOptionPane.showInputDialog("값1")); //if문은 경우의 수 -1개
			Num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
			
			/*
			 * //Num1이 Num2보다 크면 Num1이 더 큽니다. 
			 * if (Num1>Num2) { 
			 * System.out.println(Num1 + "(이)가 더 큽니다."); //한줄인 경우 중괄호(블럭) 생략이 가능함. 
			 * //Num2이 Num1보다 크면 Num2가 더 큽니다. }
			 * else if (Num2>Num1) { 
			 * System.out.println(Num2 + "가 더 큽니다."); //두 값이 같습니다. 
			 * } else { System.out.println("두 값이 같습니다."); 
			 * }
			 */
			
			//쌤 코딩
			if (Num1>Num2) 
				System.out.println(Num1 + "(이)가 더 큽니다.");
			else if (Num2>Num1) 
				System.out.println(Num2 + "가 더 큽니다.");
			else 
				System.out.println("두 값이 같습니다.");
			
		}

}
