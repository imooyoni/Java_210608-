package pk7;

public class Method {
	
	//�ʵ���� = �������
	
	//������ ����(�⺻ �����ڸ� ���)
	
	void makeBread() {
		System.out.println("���� ��������ϴ�.");
	}//method1
	
	void makeBread(int count) {
		//1��° ���� ��������ϴ�.
		//2��° ���� ��������ϴ�.
		
		for(int i=0; i<count; i++) {
			//�Լ��� ȣ���� �� count�� ���ڸ� �ְ� ȣ���� �Ŷ� i<count��� �ϱ�
			System.out.println((i+1)+"��° ���� ��������ϴ�.");
		}
		System.out.println();
		System.out.println("��û�Ͻ�" +count +"���� ���� ��� �ϼ��Ǿ����ϴ�.");
		
	}//method2
	
	void makeBread(int count, String name) {
		//1��° ���� ��������ϴ�.
		//2��° ���� ��������ϴ�.
		
		for(int i=0; i<count; i++) {
			//�Լ��� ȣ���� �� count�� ���ڸ� �ְ� ȣ���� �Ŷ� i<count��� �ϱ�
			System.out.println((i+1)+"��° " +name + "���� ���Խ��ϴ�.");
		}
		System.out.println();
		System.out.println("��û�Ͻ� " +count +"���� "+name+ "���� ��� �ϼ��Ǿ����ϴ�.");
		
	}//method3

}
