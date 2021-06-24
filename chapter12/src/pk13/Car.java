package pk13;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	public void clear(){}; //필수는 아닌 상태, 추가 구현시 많이 사용됨
	
	//clear를 abstract로 선언하고 싶은데 오버라이딩을 하고 싶지 않을때는,
	//ai,manual을 abstract클래스로 선언하면되지만
	//abstract클래스로 선언하면 ai, manual객체를 만들 수 없다!
	
	public void startCar()
	{
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//template :변경 불가한 프로젝트의 틀
	final public void run() {
		startCar();
		drive();
		clear();
		stop();
		turnOff();
	}
}
