package pk12;
		//CalPlusŬ������ ����� CalculatorŬ������ ��ӹ�������.
		//�������̵��� �̿��Ͽ� Calculator�� getResult()�Լ���
		//���ڷ� ���� n1�� n2�� �����ִ� �Լ��� ����ϴ�.
		//���� ���ϰ��� -1�̸� �ȵǰ���??
public class CalPlus extends CalculatorExam{

	@Override
	public int getResult(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}
	
	

}
