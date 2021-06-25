package pk14;

public class MyClassTest {

	public static void main(String[] args) {
		
		/*구현메서드 >>재정의된 메서드 사용가능
		MyClass mClass = new MyClass();
		X xClass = mClass; //xClass를 mClass로 자동형변환
		xClass.x();
		Y yClass = mClass;
		yClass.y();
		
		MyInterface iClass = mClass;
		iClass.mymethod();
		
		
		*/
		
		X x = new MyClass();
		x.x();
		
		Y y = new MyClass();
		y.y();
		
		MyInterface mi = new MyClass();
		mi.myMethod();
	}

}
