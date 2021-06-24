package pk7;

public class FunTest02 {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		int sum = addNum(n1,n2); //메소드 호출
		System.out.println(n1+"+"+n2+"="+sum);
	}
	
	public static int addNum(int a, int b) {
		int result = a+b;
		return result;
	}

}
