package pk9;

import javax.swing.JOptionPane;

public class ThisTestMain {

	public static void main(String[] args) {

		//�⺻ �����ڷ� ��ü�� ����� ��ü�� �̸��� R1(Move 2��, RAge)
		ThisTest R1 = new ThisTest();
		R1.Move();
		R1.Move();
		R1.RAge();
		
		System.out.println("===��ü2===");
		
		//swing(JOptoinPane)���� �Է��� �޾Ƽ� �κ��� �ӵ��� ����, �̸�, �κ���ȣ�� �Է� �޾Ƽ� ���
		//ThisTest�� ��� �޼��� ���
		int R_speed=Integer.parseInt(JOptionPane.showInputDialog("�ӵ��� �Է��ϼ��� : "));
		int R_age=Integer.parseInt(JOptionPane.showInputDialog("���̸� �Է��ϼ��� : "));
		String R_name=JOptionPane.showInputDialog("�̸��� �Է��ϼ��� : ");
		String R_num=JOptionPane.showInputDialog("�κ���ȣ�� �Է��ϼ��� : ");
		
		ThisTest R2 = new ThisTest(R_speed, R_age, R_name, R_num);
		
		R2.Move();
		R2.Move();
		R2.Stop();
		R2.RAge();
		R2.RName();
		R2.RNum();
		//����2
		boolean run = true;

		System.out.println("==��ü2==");
		// swing���� �Է��� �޾Ƽ� �κ��� �ӵ��� ���̸� ���
		while (run) {			
			String str = JOptionPane.showInputDialog("�Է�");
			outer:
			if (str.equals("������")) {
				R1.Move();
				break outer;
			} else if (str.equals("����")) {
				R1.Stop();
				break outer;
			} else if (str.equals("����")) {
				R1.RAge();
				break outer;
			} else if (str.equals("�̸�")) {
				R1.RName();
				break outer;
			} else if (str.equals("�κ���ȣ")) {
				R1.RNum();
				break outer;
			} else if (str.equals("����")) {
				run = false;
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, "Ʋ������");
			}
		}
	}
		
}

