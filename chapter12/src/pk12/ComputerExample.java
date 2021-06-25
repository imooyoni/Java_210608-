package pk12;

public class ComputerExample {

	public static void main(String[] args) {
		Calculator cl1 = new Calculator();
		Calculator cl2 = new Computer();
		int r=10;
		
		
		System.out.println("원의 넓이 : " + cl1.areaCircle(r));
		System.out.println();
		System.out.println("원의 넓이 : " + cl2.areaCircle(r));
	}

}
