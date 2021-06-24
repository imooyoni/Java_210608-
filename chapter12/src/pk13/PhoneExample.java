package pk13;

public class PhoneExample {
	/*
	public static void method(SmartPhone smartphone) {
		smartphone.owner;
	}
	*/
	public static void main(String[] args) {
		//Phone phone=new Phone(); >> 오버로딩이 되어 기본생성자가 없어서 오류
		//Phone phone = new Phone("홍길동"); 추상클래스이기 때문에 heap 메모리를 사용할 수 없음
		
		SmartPhone smartphone = new SmartPhone("홍길동");
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
	}

}
