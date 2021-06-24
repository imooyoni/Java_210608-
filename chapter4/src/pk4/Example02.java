package pk4;

public class Example02 {

	public static void main(String[] args) {

		//원의 넓이를 구하시오 (반지름 ^2 * 3.14, 반지름:10)
		//int > double : Double.parseDouble
		//String > int : Integer.parseInt
		
		/*
		int r =10;
		float pi = 3.14f;
		
		float a;
		a=(r * r) * pi;
		
		System.out.println(a);
		*/
		//int > double : 
		int var1=10;
		int var2=3;
		int var3=14;
		
		double value=3.14;
		
		double result = var1 * var1 * value; // 묵시적 형변환
		//double result = var1 * var1 * Double.parsedouble(var2 + "." + var3); //Double 대문자로 시작하면 클래스, 
		System.out.println("원의 넓이는 : " + result);
		
		
	}

}
