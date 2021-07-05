package pk20;


interface PrintString{
	void showString(String str);
}

public class TestLambDa {

	public static void showMyString(PrintString p) {
		p.showString("Hi Lambda");
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s + "world");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lambda
		PrintString ps = (a) -> System.out.println(a); //ps가 메서드 이름! 그래서 그 메서드 안에 들은게 '=' 이후의 것이야!
		ps.showString("Hello Lambda");
		
		
		//메서드호출
		showMyString(ps);
		
		//lambda + method
		PrintString a = returnString();
		a.showString("hello ");
		//
	}

}
