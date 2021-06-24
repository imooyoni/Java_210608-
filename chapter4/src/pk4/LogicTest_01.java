package pk4;

public class LogicTest_01 {

	public static void main(String[] args) {
		
		char a,b;
		boolean c;
		
		a='A'; // 65
		b='B'; // 66
		
		c = true || true && false; //&&연산 먼저 진행하고 || 연산 진행됨
		//c=true||false
		System.out.println(c);
		
		System.out.println("--------");
		c = a<b && (a==b);
		System.out.println(c);
		
		System.out.println("--------");
		c = a<b || (a==b);
		System.out.println(c);
		
		
	}

}
