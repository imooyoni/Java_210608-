package pk5;

import javax.swing.JOptionPane;

public class DoWhile02 {
	
	public static void main(String[] args) {
		//do~while : ������ �ѹ� �����ϰ� �ݺ����۵�

		int Num1, Num2;
		// do/while >> ���� ���� �Է� �ް� �װ��� ������ �ٸ��� ���ϴ� �ڵ� ��)���������� 
		do {
			Num1=Integer.parseInt(JOptionPane.showInputDialog("��1"));
			Num2=Integer.parseInt(JOptionPane.showInputDialog("��2"));
			
			if (Num1 == Num2) {
				System.out.println("Same!!");
				break;
		
			}
			System.out.print("Num1 : " + Num1 + "/");
			System.out.println(" Num2 : " +Num2);
			System.out.println("different!!");
		}while(Num1 != Num2);
		
	}

}
//������ ������Ʈ ��������
//������ �༭ ������ �ɾ�� �ڴ� ������  if Ȥ�� switch

/* ����ϸ� ������ �� >> ��� �� ���� ���� �ڵ��� ��� �׷� 
Exception in thread "main" java.lang.NumberFormatException: null
at java.base/java.lang.Integer.parseInt(Integer.java:614)
at java.base/java.lang.Integer.parseInt(Integer.java:770)
at pk5.DoWhile02.main(DoWhile02.java:13) */
