package pk11;

public class SportsCar extends Car{

	
	
	@Override
	public void speedUp() {//부모꺼를 사용하는데 거기에 새로운 구현부를 추가하겠다!
		speed += 10;
		System.out.println("speed : " + speed);
	}

	/*
	@Override final 처리된 것은 오버라이딩이 불가함
	public void stop() {
		system.out.println("스포트차를 멈춤")
		speed=0;
	}
	*/
	public static void main(String[] args) {//매개변수가 있는지 없는지 

		SportsCar ac = new SportsCar();
		ac.speedUp();
		ac.stop();
	}

}