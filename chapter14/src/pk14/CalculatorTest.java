package pk14;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 =5;
		
		Calc calc1=new ComputerCalc();
		//�߻�Ŭ���� X
		//Calc calc2=new Calculator();//ERROR : �߻�Ŭ�����̱� ������
			
		//calc1.showInfo�� ���� �ʴ� ������ Calc Ÿ���ε� Calc Ŭ�������� showInfo�� �����Ǿ� ���� �ʱ� ����
	
		System.out.println("-----����Ʈ �޼���-----");
		calc1.description();
		System.out.println();
		
		System.out.println("-----static �޼���-----");
		int[] arr= {1,2,3,4,5};
		System.out.println(Calc.total(arr)); //�ν��Ͻ����� ��ü ������ �Ұ�! �ɷ����� �ҷ�����
		System.out.println();
		
		System.out.println("-----�ν��Ͻ� �޼���(�߻�) ȣ��-----");
		System.out.println(calc1.add(num1, num2));
		System.out.println(calc1.substract(num1, num2));
		System.out.println(calc1.divide(num1, num2));
		System.out.println(calc1.times(num1, num2));
		
		System.out.println("===== chile Metho ȣ�� =====");
		ComputerCalc calc = new ComputerCalc();
		calc.showInfo();
	}

}
