package pk8;

public class Bus {
	
	//�������
	int busNumber; 					//������ȣ
	int passengerCount;				//�°��� ��
	int money; 						//������ ����
	
	//�����ڸ� �����ε�(������ȣ�� �Ű������� �޾Ƽ� ��������� ���Կ���)
	
	Bus(int busNumber) {//������ Ÿ�� ���� ���Ŷ�
		this.busNumber=busNumber;
	}
	
	public void take(int money) {	//�°��� �� ���� ����
		this.money+=money;			//������ ������ �����ϸ� �°��� �ڻ��� ������
		passengerCount++;			//�°� �� ����
	}
	
	public void busInfo() {
		System.out.println("���� " + busNumber +"���� �°��� " + passengerCount + "�� �̰�, "
							+ "����� " + money + "�� �Դϴ�.");
	}
	
	
}
