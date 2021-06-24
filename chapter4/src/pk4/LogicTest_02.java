package pk4;

public class LogicTest_02 {

	public static void main(String[] args) {

		int num1=10;
		int num2=20;
		
		boolean flag=(num1>0) && ( num2>0);//true
		System.out.println(flag);
		
		//&& > F
		flag=(num1>num2) && (num2>0);//false
		System.out.println(flag);
		
		//|| > T
		flag=(num1>0) || (num2<0);
		System.out.println(flag);
		
		//!= > F
		flag=(num1>=0 != num2>0); //같지 않으면 :T , 같으면 : F
		System.out.println(flag);
		
		//부정 (=!) > F
		flag=! (num1>0); // 관계연산 회로의 반대
		System.out.println(flag);
		
	}

}
