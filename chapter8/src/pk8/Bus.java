package pk8;

public class Bus {
	
	//멤버변수
	int busNumber; 					//버스번호
	int passengerCount;				//승객의 수
	int money; 						//버스의 수입
	
	//생성자를 오버로딩(버스번호를 매개변수로 받아서 멤버변수에 대입연산)
	
	Bus(int busNumber) {//버스를 타면 돈을 내거라
		this.busNumber=busNumber;
	}
	
	public void take(int money) {	//승객이 낸 돈을 받음
		this.money+=money;			//버스의 수입이 증가하면 승객의 자산이 감소함
		passengerCount++;			//승객 수 증가
	}
	
	public void busInfo() {
		System.out.println("버스 " + busNumber +"번의 승객은 " + passengerCount + "명 이고, "
							+ "요금은 " + money + "원 입니다.");
	}
	
	
}
