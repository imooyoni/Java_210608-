package pk4;

public class IncreTest_01 {

	public static void main(String[] args) {
		
		int a,b,c;
		a=10;
		b=20;
		c=3;
		
		System.out.println("++a : " + (++a)); //a=11
		System.out.println("a++ : " + (a++)); //11
		System.out.println("������� : "+ a); //a=12
		System.out.println("========");
		System.out.println("c++ : " + (c++)); //3
		System.out.println("������� : "+ c); //4
		System.out.println("========");
		//a������� + b��������� �����
		//#1
		System.out.println("a������� + b��������� ����� : " + ((++a) + (b++))); //13 + 20
		System.out.println("������� : " + b); // b=21
		System.out.println("========");
		//#2
		System.out.println("++a : " + (++a)); //a=13
		System.out.println("b++ : " + (b++)); //b=21
		System.out.println("a + b : " + (a+b)); //a+b=34
		
		
	}

}
