package pk4;

public class LogicTest_03 {

	public static void main(String[] args) {

		int num1=10;
		int i=2;
		//AND������ ���� �����̸� ������ �����̹Ƿ� �ڴ� �������� ����
//		boolean value=((num1+=10)<10) && ((i+=2)<10);//i=2, num1=20
		boolean value=((i+=2)<10) && ((num1+=10)<10);//i=4, num1=20
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		//OR������ ���� ���̸� ������ ���̹Ƿ� �ڴ� �������� ����
//		value=((num1+=10)>10) || ((i+=2)<10); //i=2, num1=20
		value=((i+=2)>10) || ((num1+=10)>10);// i=4, num1=30
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}

}
