package pk9;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {
		int side;
		int height;
		int area;
		String str="";
		
		Encapsulation en = new Encapsulation();
		Scanner scan = new Scanner(System.in);
		
		side=Integer.parseInt(JOptionPane.showInputDialog("밑변"));
		height=Integer.parseInt(JOptionPane.showInputDialog("높이"));
		
		area=en.Cal_Area(side, height);//void가 아닌데 받았네 cal_area는 return값을 가지고 있네라고 판단하기
		str ="사각형의 넓이는 " + area + "입니다.";
		
		System.out.println(str);
		JOptionPane.showMessageDialog(null, str);
		
	}

}
