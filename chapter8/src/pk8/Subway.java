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
		System.out.println("지하철 " + lineNumber +"의 승객은 " + passengerCount + "명 이고, "
							+ "요금은 " + money + "원 입니다.");
	}
}
