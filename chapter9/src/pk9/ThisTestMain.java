package pk9;

import javax.swing.JOptionPane;

public class ThisTestMain {

	public static void main(String[] args) {

		//기본 생성자로 객체를 만들되 객체의 이름은 R1(Move 2번, RAge)
		ThisTest R1 = new ThisTest();
		R1.Move();
		R1.Move();
		R1.RAge();
		
		System.out.println("===객체2===");
		
		//swing(JOptoinPane)으로 입력을 받아서 로봇의 속도와 나이, 이름, 로봇번호를 입력 받아서 출력
		//ThisTest의 모든 메서드 사용
		int R_speed=Integer.parseInt(JOptionPane.showInputDialog("속도를 입력하세요 : "));
		int R_age=Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요 : "));
		String R_name=JOptionPane.showInputDialog("이름을 입력하세요 : ");
		String R_num=JOptionPane.showInputDialog("로봇번호를 입력하세요 : ");
		
		ThisTest R2 = new ThisTest(R_speed, R_age, R_name, R_num);
		
		R2.Move();
		R2.Move();
		R2.Stop();
		R2.RAge();
		R2.RName();
		R2.RNum();
		//유형2
		boolean run = true;

		System.out.println("==객체2==");
		// swing으로 입력을 받아서 로봇의 속도와 나이를 출력
		while (run) {			
			String str = JOptionPane.showInputDialog("입력");
			outer:
			if (str.equals("움직여")) {
				R1.Move();
				break outer;
			} else if (str.equals("멈춰")) {
				R1.Stop();
				break outer;
			} else if (str.equals("나이")) {
				R1.RAge();
				break outer;
			} else if (str.equals("이름")) {
				R1.RName();
				break outer;
			} else if (str.equals("로봇번호")) {
				R1.RNum();
				break outer;
			} else if (str.equals("종료")) {
				run = false;
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, "틀린문자");
			}
		}
	}
		
}

