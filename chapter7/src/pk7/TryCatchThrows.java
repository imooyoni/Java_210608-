package pk7;

public class TryCatchThrows {
	
	public static void fun() throws Exception{
		try {
			System.out.println("fun()�޼���");
			throw new Exception();// �޸𸮰� �������
			
		} catch (RuntimeException e) {//�����߿� �߻��Ǵ� ����
			System.out.println("���ܹ߻�");//���������� ���������� ������ �ڹٰ� �˰� �ִ� ����
			
		} finally {//catch�� ������ �Ǵ��� ������(err�� ���� ���ϴ���) ������ ������ �Ǵ� ��
			System.out.println("finally ����");
		}
	}

	public static void main(String[] args) {
		
		//fun();
		try {
			fun();
		} catch (Exception e) {
			System.err.println("main()�� catch�� ����");
		}
	}//main

}
