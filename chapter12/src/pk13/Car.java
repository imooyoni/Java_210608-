package pk13;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	public void clear(){}; //�ʼ��� �ƴ� ����, �߰� ������ ���� ����
	
	//clear�� abstract�� �����ϰ� ������ �������̵��� �ϰ� ���� ��������,
	//ai,manual�� abstractŬ������ �����ϸ������
	//abstractŬ������ �����ϸ� ai, manual��ü�� ���� �� ����!
	
	public void startCar()
	{
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	//template :���� �Ұ��� ������Ʈ�� Ʋ
	final public void run() {
		startCar();
		drive();
		clear();
		stop();
		turnOff();
	}
}
