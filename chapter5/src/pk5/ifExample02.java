package pk5;

import javax.swing.JOptionPane;

public class ifExample02 {

	public static void main(String[] args) {
		//10의 배수 판별법
		int dat;		
		dat=Integer.parseInt(JOptionPane.showInputDialog("값입력 : "));//JOptionPane 암기하기
		
		//System.out.println(dat);
		
		if(dat%10 == 0) { 
			System.out.println(dat + "은(는) 10의 배수입니다.");
		}else {
			System.out.println(dat + "은(는) 10의 배수가 아닙니다.");
		}
		
	}

}
