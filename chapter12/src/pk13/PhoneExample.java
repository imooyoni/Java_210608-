package pk13;

public class PhoneExample {
	/*
	public static void method(SmartPhone smartphone) {
		smartphone.owner;
	}
	*/
	public static void main(String[] args) {
		//Phone phone=new Phone(); >> �����ε��� �Ǿ� �⺻�����ڰ� ��� ����
		//Phone phone = new Phone("ȫ�浿"); �߻�Ŭ�����̱� ������ heap �޸𸮸� ����� �� ����
		
		SmartPhone smartphone = new SmartPhone("ȫ�浿");
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
	}

}
