package pk13;

public class CarExample {

	public static void method(Car car) {
		car.run();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//유지보수를 봤을 때 오버라이딩 된 부분만 바꿀 수 있음!
		System.out.println("---매뉴얼 카---");
		Car mc = new ManualCar();
		mc.run();
		System.out.println();
		System.out.println("---에이아이 카---");
		Car ac = new AICar();
		ac.run();
		
		
		System.out.println("---매뉴얼 카---");
		method(new ManualCar());
		System.out.println();
		System.out.println("---에이아이 카---");
		method(new AICar());
		
		
		
	}

}
