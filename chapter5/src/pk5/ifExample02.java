package pk5;

import javax.swing.JOptionPane;

public class ifExample02 {

	public static void main(String[] args) {
		//10�� ��� �Ǻ���
		int dat;		
		dat=Integer.parseInt(JOptionPane.showInputDialog("���Է� : "));//JOptionPane �ϱ��ϱ�
		
		//System.out.println(dat);
		
		if(dat%10 == 0) { 
			System.out.println(dat + "��(��) 10�� ����Դϴ�.");
		}else {
			System.out.println(dat + "��(��) 10�� ����� �ƴմϴ�.");
		}
		
	}

}
