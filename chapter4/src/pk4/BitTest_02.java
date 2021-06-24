package pk4;

public class BitTest_02 {

	public static void main(String[] args) {
		
		int a,b,c;
		a=30;
		b=25;
		
		//&
		c= a & b;
		System.out.println("a&B : " + c);//a 11110 / b 11001
		//|
		c= a | b;
		System.out.println("a|b : " + c);
		//^
		c=a^b;
		System.out.println("a^b : " + c);
		//~
		c=~(-1);
		System.out.println(c);
	}

}
