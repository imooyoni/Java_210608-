package pk4;

public class BitTest_01 {

	public static void main(String[] args) {
		//Bit ����
		int num1=5; //0101
		int num2=10;//1010
		//Bit�� OR����
		int result =num1 | num2;
		System.out.println(result);
		
		//Bit�� AND����
		result =num1 & num2;
		System.out.println(result);
		
		//Bit�� ^����
		result =num1 ^ num2;
		System.out.println(result);

		//Bit�� NOT(~)����
		System.out.println(~num2+1);
		
		
	}

}
