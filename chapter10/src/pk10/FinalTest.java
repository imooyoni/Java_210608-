package pk10;

import javax.swing.JOptionPane;

public class FinalTest {

	private static final int MAX=3; //Ŭ���� > �����̺� ������ �޼��带 ���ؼ� �ø� 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		for (int i=0; i<MAX;i++) {
			
			num=Integer.parseInt(JOptionPane.showInputDialog("���Է�"));
			
			if (num>MAX)
				System.out.println("�Է°��� 3���� Ů�ϴ�"); //�Է°��� �߽��� �Ǵ� ��
			else
				System.out.println("�Է°��� 3���� ũ�� �ʽ��ϴ�");
			
			
		}
	}

}