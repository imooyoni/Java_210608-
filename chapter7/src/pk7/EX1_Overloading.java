package pk7;

public class EX1_Overloading {

	//�ʵ�=�������
	
	//������ ����(�� �ǹ̴� ����Ʈ�����ڸ� ����� ����!)
	
	//�޼��屸��
	//�޼��� �ߺ����=Overloading : Ŭ������ ������ �̸��� �޼��尡 ����.
	//Overloading(������) : �հ��ε� �Ҽ������� �հ� �����������հ� �Ǽ��������հ� �� �������� ������ ȿ������ �ش�ȭ.
	
	public void getResult(int n) {
		System.out.println(n + "��(��) int�Դϴ�.");
	}
	
	
	public void getResult(char n) {
		System.out.println(n + "��(��) char�Դϴ�.");
	}
		
	public void getResult(String n) {
		System.out.println(n + "��(��) String�Դϴ�.");
	}
	
	public void getResult(int n, String str) {
		System.out.println(n + "��(��) int�̰�, "+str+"��(��) String�Դϴ�.");
	}
}
