package pks3;

public class Constant {

	public static void main(String[] args) {
		//상수: 변하지 않는 값 선언
		final int MAX_NUM=100; //상수처리 대소문자 상관없음!, 상수값(final처리)은 변경 불가! 
		final int MIN_NUM;
		final double PI=3.14;
		
		MIN_NUM=0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM=1000; //Error: 상수값 즉 한번 선언하면 변경 불가
		//PI=31.4; //Error; 상수선언
		
	}

}
