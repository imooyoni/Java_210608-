package pk4;

public class RelaTest_04 {

	public static void main(String[] args) {

		int num1=5;
		int num2=3;
		//boolean값 코드
		boolean value1=(num1>num2);
		System.out.println(value1);
		
		boolean value2=(num1<num2);
		System.out.println(value2);
		
		boolean value3=(num1>num2);
		System.out.println(value3);
		
		boolean value4=(num1>num2);
		System.out.println(value4);
		
		System.out.println("n1>=n2 : " + (num1>=num2)); //true
		System.out.println("n1<=n2 : " + (num1<=num2)); //false
		System.out.println("n1=n2 : " + (num1==num2)); //false
		System.out.println("n1!=n2 : " + (num1!=num2)); //true
		
	}

}
