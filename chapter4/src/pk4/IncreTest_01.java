package pk4;

public class IncreTest_01 {

	public static void main(String[] args) {
		
		int a,b,c;
		a=10;
		b=20;
		c=3;
		
		System.out.println("++a : " + (++a)); //a=11
		System.out.println("a++ : " + (a++)); //11
		System.out.println("후위계산 : "+ a); //a=12
		System.out.println("========");
		System.out.println("c++ : " + (c++)); //3
		System.out.println("후위계산 : "+ c); //4
		System.out.println("========");
		//a전위계산 + b후위계산의 결과값
		//#1
		System.out.println("a전위계산 + b후위계산의 결과값 : " + ((++a) + (b++))); //13 + 20
		System.out.println("후위계산 : " + b); // b=21
		System.out.println("========");
		//#2
		System.out.println("++a : " + (++a)); //a=13
		System.out.println("b++ : " + (b++)); //b=21
		System.out.println("a + b : " + (a+b)); //a+b=34
		
		
	}

}
