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
		
		side=Integer.parseInt(JOptionPane.showInputDialog("�غ�"));
		height=Integer.parseInt(JOptionPane.showInputDialog("����"));
		
		area=en.Cal_Area(side, height);//void�� �ƴѵ� �޾ҳ� cal_area�� return���� ������ �ֳ׶�� �Ǵ��ϱ�
		str ="�簢���� ���̴� " + area + "�Դϴ�.";
		
		System.out.println(str);
		JOptionPane.showMessageDialog(null, str);
		
	}

}
