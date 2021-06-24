package pks3;

public class IntegerVariable {

	public static void main(String[] args) {
		
		short sVal=10;
		byte bVal=20;
		//구조가 달라도 계산가능! 단, 각 구조에 맞는 값 입력해야 함!
		int result=sVal+bVal;
		System.out.println("두수의 합은 : " + result);
		System.out.println("두수의 합은 : " + (sVal+bVal));
	}

}
