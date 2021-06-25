package pk7;

public class FunTest04 {

	//call by value
	public static void swap(int x, int y) {
		//swap 알고리즘
		int temp = x;
		x=y;
		y=temp;
		
		System.out.println("swap() 결과값 : x= " + x + ", y= "+y);
	}
	
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("swap() 호출 전 : a= " + a + ", b= "+b);
		System.out.println("====================");
		
		swap(a,b);//복사값을 넘겨준 것이라 a,b가 변하지 않음!
		
		System.out.println("====================");
		System.out.println("swap() 호출 후 : a= " + a + ", b= "+b);
		
		//FunTest05 f5 = new FunTest05(5);
		//System.out.println(f5);
	}
	 
	//funtest05라는 데이터를 만들건데 숫자 하나가 반드시 들어와야함!
	
}
