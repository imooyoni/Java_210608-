package pk7;

import javax.swing.JOptionPane;

public class FunTest06 {

	/*public static String Disp(String A[]) { //str�� �迭���� �־ �迭�� ��������!
		
		String res="";
		for(int i=0; i<A.length; i++) {
			res+=A[i]+"\n";	
			return res;
		}//for
		
		System.out.println(res);
		JOptionPane.showMessageDialog(null/*��ȭ���ڰ� ���� ���� �ʱ�ȭ�Ѵ�, "�迭�� ���Ұ� \n" + res);
	}
	*/
	
	public static void Disp(String A[]) { //str�� �迭���� �־ �迭�� ��������!
		
		String res="";
		for(int i=0; i<A.length; i++) {
			res+=A[i]+"\n";	
		}//for
		
		System.out.println(res);
		JOptionPane.showMessageDialog(null/*��ȭ���ڰ� ���� ���� �ʱ�ȭ�Ѵ�*/, "�迭�� ���Ұ� \n" + res);
	}
	
	public static void main(String[] args) {

		String str[] = {"ab111","cd222","ef333","gh444","ij555"}; //str.length
		/*int res = */ Disp(str);
		
	}//main

}//class
