package pk7;

public class EX1_OverloadingMain {//������ȭ���� ����ǵ� ex1_overloading���� ��������;�
	
	
	public static void main(String[] args) {
		
		//EX1_Overloading�� ��ü => ex
		EX1_Overloading ex = new EX1_Overloading();// ex��� ��ü�� ����ϰ� ������, o
		//�����Ҵ�, �޸��ֱ�, ��ü
		
		ex.getResult('A');
		ex.getResult(1);
		ex.getResult("ABC");
		ex.getResult(3, "������");
		
	}
}
