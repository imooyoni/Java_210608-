package pk13;

public class CarExample {

	public static void method(Car car) {
		car.run();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���������� ���� �� �������̵� �� �κи� �ٲ� �� ����!
		System.out.println("---�Ŵ��� ī---");
		Car mc = new ManualCar();
		mc.run();
		System.out.println();
		System.out.println("---���̾��� ī---");
		Car ac = new AICar();
		ac.run();
		
		
		System.out.println("---�Ŵ��� ī---");
		method(new ManualCar());
		System.out.println();
		System.out.println("---���̾��� ī---");
		method(new AICar());
		
		
		
	}

}
