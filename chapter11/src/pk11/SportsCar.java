package pk11;

public class SportsCar extends Car{

	
	
	@Override
	public void speedUp() {//�θ𲨸� ����ϴµ� �ű⿡ ���ο� �����θ� �߰��ϰڴ�!
		speed += 10;
		System.out.println("speed : " + speed);
	}

	/*
	@Override final ó���� ���� �������̵��� �Ұ���
	public void stop() {
		system.out.println("����Ʈ���� ����")
		speed=0;
	}
	*/
	public static void main(String[] args) {//�Ű������� �ִ��� ������ 

		SportsCar ac = new SportsCar();
		ac.speedUp();
		ac.stop();
	}

}
