package pk14;

public class MyClassTest {

	public static void main(String[] args) {
		
		/*�����޼��� >>�����ǵ� �޼��� ��밡��
		MyClass mClass = new MyClass();
		X xClass = mClass; //xClass�� mClass�� �ڵ�����ȯ
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
