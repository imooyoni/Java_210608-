package pk5;

public class ForTest07 {
	
	public static void main(String[] args) {
		
		//continue
		
		int total=0;
		int num;
		
		for (num=0; num<=100; num++) {
			//¦���� �����ϰ� ���ϱ�
			if (num % 2 == 0)
			//�׳� ������ �ǳʶٱ� ������� �ʱ�
			continue; // if���� true�϶� ����
			
			total += num;
		}
		System.out.println("1���� 100������ Ȧ���� ���� " + total + "�Դϴ�");
		
	}

}
