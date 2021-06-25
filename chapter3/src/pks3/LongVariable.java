package pks3;

public class LongVariable {

	public static void main(String[] args) {
		
		//int num1=12345678900;
		long num2=12345678900L;
		long num3=1000; //int 범위 내의 수는 끝에 L 을 붙이지 않더라도 오류가 나지 않는다.
		
		System.out.println(num2+num3);
	}

}
