package pk11;

public class B {
//���� ��Ű�� ���̹Ƿ� ��ü�����Ͽ� ����
	public void method() {
		A a = new A(); //��� ���迡���� super();�� ��ü�� ����Ѵ�.
		a.field = "value";
		a.method();
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		b.method();
	}
}
