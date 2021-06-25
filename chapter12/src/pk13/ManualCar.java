package pk13;

public class ManualCar extends Car{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		// 사용자에 의해 주행을 시작합니다.
		System.out.println("사용자에 의해 주행을 시작합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		// 사용자가 주행을 종료합니다.
		System.out.println("사용자가 주행을 종료합니다.");
	}
	
	

}
