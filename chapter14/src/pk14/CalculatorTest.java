package pk14;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 =5;
		
		Calc calc1=new ComputerCalc();
		//추상클래스 X
		//Calc calc2=new Calculator();//ERROR : 추상클래스이기 때문에
			
		//calc1.showInfo가 되지 않는 이유는 Calc 타입인데 Calc 클래스에는 showInfo가 구현되어 있지 않기 때문
	
		System.out.println("-----디폴트 메서드-----");
		calc1.description();
		System.out.println();
		
		System.out.println("-----static 메서드-----");
		int[] arr= {1,2,3,4,5};
		System.out.println(Calc.total(arr)); //인스턴스에는 객체 진입이 불가! 믈래스로 불러야함
		System.out.println();
		
		System.out.println("-----인스턴스 메서드(추상) 호출-----");
		System.out.println(calc1.add(num1, num2));
		System.out.println(calc1.substract(num1, num2));
		System.out.println(calc1.divide(num1, num2));
		System.out.println(calc1.times(num1, num2));
		
		System.out.println("===== chile Metho 호출 =====");
		ComputerCalc calc = new ComputerCalc();
		calc.showInfo();
	}

}
