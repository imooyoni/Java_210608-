package pk7;

import javax.swing.JOptionPane;

public class FunTest03 {

	public void sum(int a, int b) { //�޾Ƽ� �������ִ°� 2��
		
		System.out.println(a +" + "+b+ " = " + (a+b));
	} 
	//C���:call by value a(value)=0(��);
	//����, ��ü ���� ��� call by value�� �ƴ� "*(pointer)"(call by reference)�� ������
	

	//void�� ���ϰ��� ���� �� ����
	public static void main(String[] args) {
		int num1, num2;
		num1=Integer.parseInt(JOptionPane.showInputDialog("��1 :" )); // �� �޴°� 1��
		num2=Integer.parseInt(JOptionPane.showInputDialog("��2 :" ));
		
	//	sum(num1,num2);
		
		//static���� ȣ����� �ʾ����Ƿ� ������ �� �� ���� >> static�� ���� ��� main�� �ӵ� ���̰� �߻���!
		
		//public void sum erro ����: static�� static�� ����� �� ����! sum�޼ҵ尡 static�� �ƴϱ� ������ ������!
		//sum���� ���ϰ��� �ַ��� main�� ���� ���� �־�� ��ex int result ���� ���� ������ �־����
		
		FunTest03 Obj = new FunTest03();
		Obj.sum(num1, num2); // �޼ҵ忡 static�� �Է����� ���� ���, ��ü(Obj)�� ���� ������ ȣ��
		
	}

}
