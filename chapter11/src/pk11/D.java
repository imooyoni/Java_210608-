package pk11;

//같은 패키지가 아닌 경우 public 생성자만 참조가능
public class D extends A{

	public D() {
		super();
		//A a = new A();
		this.field="value";//여기서 this가 가르키는 것은 super!
		this.method();
	}
	
	public static void main(String[] args) {
		D d = new D();
		d.method();
	}

}
