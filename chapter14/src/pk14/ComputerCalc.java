package pk14;

public class ComputerCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if (num2 != 0)
			return num1 / num2;
		else
			return Calc.ERROR; //static�� Ŭ������ �����̹Ƿ� Ŭ���������� ���
	}
	
	//���� �޼���
	public void showInfo() {
		System.out.println("Calc �������̽� ������" );
	}
	
	//�������̵��� ������ ������ �ʼ��� �ƴ�
	@Override
	public void description() {
		System.out.println("�Ϻ��� ���� �Դϴ�.");
	}

	
}
