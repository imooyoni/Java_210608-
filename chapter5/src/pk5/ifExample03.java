package pk5;

import javax.swing.JOptionPane;

public class ifExample03 {

	public static void main(String[] args) {
		
		int JumSu;
		char grade;
		
		JumSu = Integer.parseInt(JOptionPane.showInputDialog("�����Է� : "));
		
		if(JumSu >= 90) {
			grade = 'A';
		}else if(JumSu >= 80) {
			grade='B';
		}else if(JumSu >=70) {
			grade='C';
		}else if(JumSu >= 60) {
			grade='D';
		}else if(JumSu >= 50) {
			grade='E';
		}else { //�׹ۿ�
			grade = 'F';
		}
		
		System.out.println(JumSu + "���� " + grade + " �����Դϴ�.");
	}

}
