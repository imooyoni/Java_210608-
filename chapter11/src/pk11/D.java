package pk11;

//���� ��Ű���� �ƴ� ��� public �����ڸ� ��������
public class D extends A{

	public D() {
		super();
		//A a = new A();
		this.field="value";//���⼭ this�� ����Ű�� ���� super!
		this.method();
	}
	
	public static void main(String[] args) {
		D d = new D();
		d.method();
	}

}
