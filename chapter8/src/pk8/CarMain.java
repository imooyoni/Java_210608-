package pk8;

public class CarMain {

	public static void main(String[] args) {

		Car c = new Car();
		
		System.out.println("제작회사 : " + c.company);
		System.out.println("모델명 : " + c.model);
		System.out.println("색깔 : " + c.color);
		System.out.println("최고속도 : " + c.maxSpeed);
		//c.SetSpeed(0);
		System.out.println("현재속도 : " + c.speed);
		System.out.println("===속도 변경 후 출력===");
		c.SetSpeed(60);
		System.out.println("수정된 속도 : " + c.speed);
		
	}

}
