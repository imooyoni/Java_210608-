package pk5;

public class DoWhile01 {
	
	public static void main(String[] args) {
		
		int num=1;				//�ε��� ���� >> �Ȱ��� �����ε� ī��Ʈ �ϴ� ��
		int sum=0;
		
		do {							// do~while���� ���
			sum += num; 		//1 ���� ����
			num++; 				//2 �ݺ� ���꿡�� �ε��������� ���� ���
			
		} while ( num <=10);//do~while�� ���� ���ؼ� �ݱ�
		
		//do~while�� ���� �� ����
		System.out.println("1���� 10������ �� : " + sum + "�Դϴ�.");
	}

}
