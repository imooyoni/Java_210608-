package pk12;
		//CalMinusŬ������ ����� CalculatorŬ������ ��ӹ�������.
		//�������̵��� �̿��Ͽ� Calculator�� getResult()�Լ���
		//���ڷ� ���� n1�� n2�� ���ִ� �Լ��� ����ϴ�.
public class CalMainus extends CalculatorExam{

	@Override
	public int getResult(int n1, int n2) {
		if (n1<n2) {
			int temp;
			temp=n1;
			n1 = n2;
			n2=temp;
		}
		int mainus = n1 - n2;
		return mainus;
	}
	
	

}
