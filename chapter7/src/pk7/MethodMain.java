package pk7;

public class MethodMain {
	
	public static void main(String[] args) {

		//�����ϰ� ���� Ŭ������ �޸� ��ü(mh) ����(�⺻ ������ ���)
		
		Method mh = new Method();
		
		mh.makeBread();
		
		System.out.println("-----------------------------");
		mh.makeBread(3);
		
		System.out.println("-----------------------------");
		mh.makeBread(2, "ũ��");
		
	}

}
