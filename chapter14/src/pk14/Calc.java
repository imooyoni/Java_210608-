package pk14;

public interface Calc {
	//�������̽������� static�� final�� �����͸޸𸮰� �ƴ� ���޸𸮿� ��ġ!
	//interface�� �����ϸ� �ƹ��͵� �������� �ʾƵ� public (static final) double PI=3.14;
	
	double PI=3.14;
	int ERROR=-99999999;
	
	//method
	/*public abstract ������ ��Ȳ*/ 
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	//�������̽����� �����޼��尡 ���� �� ������ ����Ʈ �޼���� ����!
	//�����ǰ� ������(��ӹ޴� Ŭ�������� ������ ����)
	default void description() {
		System.out.println("���� ���� �Դϴ�.");
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i:arr) {//=int i=0; i<arr.length; i++
			total+=i;
		}
		return total;
	}
	
	private void myMethod() {
		System.out.println("private �޼��� �Դϴ�.");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static �޼��� �Դϴ�.");
	}
}

//�������̽��� �߰� ���(��, �ڹٹ��� 8�̻���� ����)

/*
-����Ʈ �޼���: �⺻������ ������ �޼���ν� ����Ŭ�������� �����ǰ� ������
-����(static) : �ν��Ͻ� �������� ������� Ŭ���� Ÿ������ ��� ����
- private : ������ �޼���ν� Ŭ���� ���ο����� ��밡�� /��, ������(�籸��)�� �� �����ϴ�. 
*/
