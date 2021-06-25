package pk7;

import javax.swing.JOptionPane;

public class FunTest01 {
	
	public static void sum(int a, int b) {//메인이 static이면 다른 메소드에도 static만 입력되어야 함!
		System.out.println(a+","+b+ "="+(a+b));
	}
	public static void main(String[] args) {
		int n1, n2;
		
		n1=Integer.parseInt(JOptionPane.showInputDialog("값1 : ")); //2
		n2=Integer.parseInt(JOptionPane.showInputDialog("값2 : ")); //5
		sum(n1, n2);
	}

}
