package pk4;

public class Example01 {

	public static void main(String[] args) {

		/* �������� �ִ�.
		 * ��, ���, �������� Ű��� �ִµ� �Ϸ翡 ����Ǵ� ���� ���� 5, 7,5���̴�.
		 * ���������� �Ϸ翡 ����Ǵ� �� ������ ����ϰ�, �ð��� ��ü ������ ��� ���갹���� ���
		 * ��, ��հ��� ��� ������ float���� ������ ��
		 * */
		
		/*�� �ڵ�
		 * int p,a,o;
		p=5;
		a=7;
		o=5;
		
		int sum = p + a + o;
		float aver;
		aver = (sum) / 24f;
		
		System.out.println(sum);
		System.out.println(aver);
		*/
		
		// ���ڵ�
		int pear = 5;
		int apple=7;
		int orange=5;
		
		int fruitTotal=pear+apple+orange;
		System.out.println("����� �� ������ �� : " + fruitTotal);
		
		float fruitAvg=fruitTotal / 24f;
		System.out.println("�ð��� ����� ������ ��� : " + fruitAvg);
		//system.err.println �̸� ���������� ����� ����� >> ����Ȯ�ο�?
	}

}
