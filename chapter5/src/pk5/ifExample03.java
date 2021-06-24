package pk5;

import javax.swing.JOptionPane;

public class ifExample03 {

	public static void main(String[] args) {
		
		int JumSu;
		char grade;
		
		JumSu = Integer.parseInt(JOptionPane.showInputDialog("점수입력 : "));
		
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
		}else { //그밖에
			grade = 'F';
		}
		
		System.out.println(JumSu + "점은 " + grade + " 학점입니다.");
	}

}
