package pk4;

public class BitTest_01 {

	public static void main(String[] args) {
		//Bit 연산
		int num1=5; //0101
		int num2=10;//1010
		//Bit의 OR연산
		int result =num1 | num2;
		System.out.println(result);
		
		//Bit의 AND연산
		result =num1 & num2;
		System.out.println(result);
		
		//Bit의 ^연산
		result =num1 ^ num2;
		System.out.println(result);

		//Bit의 NOT(~)연산
		System.out.println(~num2+1);
		
		
	}

}
