package pk4;

public class Example03 {

	public static void main(String[] args) {

		//���� �����ڸ� �̿��Ͽ� score�� 90���� ũ�� 'A'�̰� score�� 80���� ũ�� 'B'
		int score;
		score=70;
		char result1, result2;
		
		result1 = (score > 90) ? 'A' : 'B';
		System.out.println("������ : " + result1);
		
		//���� �����ڸ� �̿��Ͽ� score�� 90���� ũ�� 'A'�̰� score�� 80���� ũ�� 'B'�̰� �� ���ϴ� ��� 'C'�� �����Ѵ�.
		result2 = (score > 90) ? 'A' : (score > 80) ? 'B' : 'C';
		
		System.out.println("������ : " + result2);		
		
	}

}
