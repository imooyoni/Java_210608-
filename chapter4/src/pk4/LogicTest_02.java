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
		flag=(num1>=0 != num2>0); //���� ������ :T , ������ : F
		System.out.println(flag);
		
		//���� (=!) > F
		flag=! (num1>0); // ���迬�� ȸ���� �ݴ�
		System.out.println(flag);
		
	}

}
