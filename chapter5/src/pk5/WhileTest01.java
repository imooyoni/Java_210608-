package pk5;

public class WhileTest01 {

	public static void main(String[] args) {
		
		while (true) { //while(true)�� ���ѹݺ��ϱ� ������ break�� �� �ɾ��־�� ��! 
			int num=(int)(Math.random()*6)+1; 	//1���� 6���� �������� �̾Ƽ�
			System.out.println(num); 					// ���ڸ� ����غ�
			if (num == 6) {									//����� ���ڰ� 6�̸�
				break; 										//�׸���
			}
		}
		System.out.println("���α׷� ����");
	}
}
