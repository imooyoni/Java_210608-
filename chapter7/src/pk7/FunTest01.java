package pk7;

import javax.swing.JOptionPane;

public class FunTest01 {
	
	public static void sum(int a, int b) {//������ static�̸� �ٸ� �޼ҵ忡�� static�� �ԷµǾ�� ��!
		System.out.println(a+","+b+ "="+(a+b));
	}
	public static void main(String[] args) {
		int n1, n2;
		
		n1=Integer.parseInt(JOptionPane.showInputDialog("��1 : ")); //2
		n2=Integer.parseInt(JOptionPane.showInputDialog("��2 : ")); //5
		sum(n1, n2);
	}

}
