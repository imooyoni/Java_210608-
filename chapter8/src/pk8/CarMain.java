package pk8;

public class CarMain {

	public static void main(String[] args) {

		Car c = new Car();
		
		System.out.println("����ȸ�� : " + c.company);
		System.out.println("�𵨸� : " + c.model);
		System.out.println("���� : " + c.color);
		System.out.println("�ְ�ӵ� : " + c.maxSpeed);
		//c.SetSpeed(0);
		System.out.println("����ӵ� : " + c.speed);
		System.out.println("===�ӵ� ���� �� ���===");
		c.SetSpeed(60);
		System.out.println("������ �ӵ� : " + c.speed);
		
	}

}
