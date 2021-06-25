package pk7;

import javax.swing.JOptionPane;

public class FunTest06 {

	/*public static String Disp(String A[]) { //str에 배열방이 있어서 배열로 정의해줌!
		
		String res="";
		for(int i=0; i<A.length; i++) {
			res+=A[i]+"\n";	
			return res;
		}//for
		
		System.out.println(res);
		JOptionPane.showMessageDialog(null/*대화상자가 나올 곳을 초기화한다, "배열의 원소값 \n" + res);
	}
	*/
	
	public static void Disp(String A[]) { //str에 배열방이 있어서 배열로 정의해줌!
		
		String res="";
		for(int i=0; i<A.length; i++) {
			res+=A[i]+"\n";	
		}//for
		
		System.out.println(res);
		JOptionPane.showMessageDialog(null/*대화상자가 나올 곳을 초기화한다*/, "배열의 원소값 \n" + res);
	}
	
	public static void main(String[] args) {

		String str[] = {"ab111","cd222","ef333","gh444","ij555"}; //str.length
		/*int res = */ Disp(str);
		
	}//main

}//class
