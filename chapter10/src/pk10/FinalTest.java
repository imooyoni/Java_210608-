package pk10;

import javax.swing.JOptionPane;

public class FinalTest {

	private static final int MAX=3; //클래스 > 프라이빗 변수는 메서드를 통해서 올림 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		for (int i=0; i<MAX;i++) {
			
			num=Integer.parseInt(JOptionPane.showInputDialog("값입력"));
			
			if (num>MAX)
				System.out.println("입력값이 3보다 큽니다"); //입력값이 중심이 되는 값
			else
				System.out.println("입력값이 3보다 크지 않습니다");
			
			
		}
	}

}