package pk4;

public class BitTest_03 {

	public static void main(String[] args) {
		
		int num = 0B00000101; //5
		System.out.println(num);
		
		//20이 되도록 시프트연산하기
		int result = num<<2;
		System.out.println(result);
		
		//1이 되도록 시프트연산하기
		result = num>>2;
		System.out.println(result);
		
		//num=num<<2;
		System.out.println(num);
	}

}
