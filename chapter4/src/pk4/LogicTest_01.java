package pk4;

public class LogicTest_01 {

	public static void main(String[] args) {
		
		char a,b;
		boolean c;
		
		a='A'; // 65
		b='B'; // 66
		
		c = true || true && false; //&&���� ���� �����ϰ� || ���� �����
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
