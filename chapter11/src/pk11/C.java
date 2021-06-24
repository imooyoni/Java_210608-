package pk11;

//A라이브러리가 들어왔다. (다른 패키지에 있는 것)

public class C {

	public void method() {
		A a=new A();
		a.field = "value";
		a.method();
				
	}
	
	public static void main(String[] args) {
		C c=new C();
		c.method();
	}

}
