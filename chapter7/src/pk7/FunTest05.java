package pk7;
//레퍼런스 참조
public class FunTest05 {

	int value; //멤버변수 a=10
	
	//public FunTest05() {} //디폴트 메소드를 변형했더라도 디폴트를 선언 해주면 그대로 사용가능함.
	
	//오버로딩 된 생성자는 디폴트 생성자가 반드시 명시되어야 한다. 
	//단, 디폴트 메소드를 쓰지 않을 경우 없어도 됨
		FunTest05() {} //디폴트 생성자 > 클래스를 만드는 순간! 자동 생성되어 있음!
	
	//	FunTest05() { value=a;}
	
	//this 해석 : this는 클래스에 있는 
	//생성자 : 클래스의 초기화
	/*(public)*/ FunTest05(int value) {//매개변수가 있고 없고에 따라 다른것으로 인식해서 중복나지 않음(오버로딩) 
		this/*클래스에 있는*/.value=value; //python 에서 self
	}

	
	public static void swap(FunTest05 x, FunTest05 y) {
		//swap 알고리즘
		int temp = x.value;
		x.value=y.value;
		y.value=temp;
		
		System.out.println("swap() 결과값 : x= " + x.value + ", y= "+y.value);
	}
	
	public static void main(String[] args) {

		
		FunTest05 a = new FunTest05(10);
		System.out.println(a); //pk7.FunTest05@41a4555e = 10
		FunTest05 b = new FunTest05(20);
		System.out.println(b);//pk7.FunTest05@3830f1c0 = 20
		
		System.out.println("swap() 호출 전 : a= " + a.value + ", b= "+b.value);
		System.out.println("====================");
		
		//객체로 접근하여 호출
		swap(a,b);//복사값을 넘겨준 것이라 a,b가 변하지 않음!
		
		System.out.println("====================");
		//heap메모리 참조후 값이므로 바뀜
		System.out.println("swap() 호출 후 : a= " + a.value + ", b= "+b.value);
		
	}

}
