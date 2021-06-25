package pk13;

public abstract class Phone {

	public String owner;//필드
	
	//디폴트 생성자가 선언만 되있고 구현되지 않음 -> 추상생성자(쌤이 만든 사용되지 않는 용어!)로 여김
	
	public Phone(String owner) {//생성자
		this.owner=owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}
	
	
}
