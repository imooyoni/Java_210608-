package pk5;

import javax.swing.JOptionPane;

public class IfExample04 {

	public static void main(String[] args) {

		int age;
		int charge;
		
		age=Integer.parseInt(JOptionPane.showInputDialog("����"));
		
		if (age<8) {
			charge = 1000;
			System.out.println("�� ���� �Ƶ��Դϴ�.");
		}else if (age<14) {
			charge = 2000;
			System.out.println("�ʵ��л� �Դϴ�.");
		}else if (age<20) {
			charge = 2200;
			System.out.println("��,����л� �Դϴ�.");
		}else {
			charge = 2100;
			System.out.println("���� �Դϴ�.");
		}System.out.println("������ "+charge+"�� �Դϴ�.");
	}

}
