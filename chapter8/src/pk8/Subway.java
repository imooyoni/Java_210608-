package pk8;

public class Subway {

	String lineNumber;
	int passengerCount;
	int money;
	
	Subway(String lineNumber) {
		this.lineNumber=lineNumber;
	}
	
	public void take(int money) {
		this.money+=money;
		passengerCount++;
	}
	
	public void subInfo() {
		System.out.println("����ö " + lineNumber +"�� �°��� " + passengerCount + "�� �̰�, "
							+ "����� " + money + "�� �Դϴ�.");
	}
}
