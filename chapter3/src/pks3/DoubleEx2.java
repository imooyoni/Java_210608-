package pks3;

public class DoubleEx2 {

	public static void main(String[] args) {

		double dnum=1;
		
		/* ctrl+shift+"/" : 다중 주석처리, ctrl+shift+"\": 여러줄 주석해제, ctrl+"/": 한줄 주석처리
		 * dnum=dnum + 0.1; 
		 * System.out.println(dnum);
		 */
		

		for(int i=0; i<=10000; i++) { //for문 반복문 : 정수를 선언해서 
			dnum=dnum + 0.1;
		}
		
		System.out.println(dnum);
	}

}
