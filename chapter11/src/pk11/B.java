package pk11;

public class B {
//같은 패키지 안이므로 객체생성하여 참조
	public void method() {
		A a = new A(); //상속 관계에서는 super();로 대체해 사용한다.
		a.field = "value";
		a.method();
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		b.method();
	}
}