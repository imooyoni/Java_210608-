package pk4;

public class Condition_03 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 15;
		boolean result;
		
		result = ++a >= b ? true : false;
		
		System.out.println(result);
		
		int n1=10;
		int n2=20;
		char result2;
		
		//n1에 1을 더하면 n2와 같은지 연산 같으면 'O' 다르면 'X'
		result2 = ++n1 == n2 ? 'O' : 'X';
		//result2 = (n1 += n1) == n2? 'O' : 'X';
		
		System.out.println(n1);
		System.out.println(result2);
	}

}
