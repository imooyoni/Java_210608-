package pk16;

class OutClass {
	
	//외부 클래스 멤버변수
	private int num=0;
	private static int sNum=20;
	private InClass inClass;//선언만 해둠
	
	//생성자를 통해서 내부 클래스의 객체를 생성한다.
	public OutClass() { //>아웃클래스의 객체를 만들면 자동으로 인클래스 객체가 생성됨!
		// TODO Auto-generated constructor stub
		inClass=new InClass(); //내부클래스의 객체 생
	}
	//내부클래스
	class InClass {//외부클래스의 static멤버변수는 가져다 사용하지 못한다.
		int inNum=100;
		
		void inTest() {
			System.out.println("OutClass의 Num : "+ num + "외부클래스 인스턴스 변수");
			System.out.println("OutClass의 sNum : "+ sNum + "외부클래스 전역 변수");
			System.out.println("InClass의 inNum : "+ inNum +"내부클래스 인스턴스 변수");
			System.out.println();
		}
	}
	//private 멤버변수시 사용권장
	public void usingClass() {
		inClass.inTest();
	}
	
	//내부 정적(static) 클래스
	static class InStaticClass {
		int inNum=100;
		static int sinNum=200;
		//num=500; << 객체가 있어야 사용가능
		
		void inTest() {
			//num =500; <<객체가 있어야 사용가능
			inNum=101;
			sinNum=201;//InStaticClass
			sNum=301; //외부
			
			System.out.println("InStaticClass의 inNum : "+ inNum + "내부 인스턴스 변수");
			System.out.println("InStaticClass의 sinNum : "+ sinNum + "내부 Static 변수");
			System.out.println("InStaticClass의 sNum : "+ sNum +"내클래스 static 변수");
			System.out.println();
		}
		
		static void sTest() {
			sinNum=200;
			sNum=300;
			//inNum=100; > 메모리 위치가 틀려서 안됨! 생명주기가 틀림
			
			System.out.println("OutClass num : " + sinNum + "");
			System.out.println("OutClass num : " + sNum + "");
			System.out.println();
		}
	}
}

//내부 인스턴스 클래스(개체가 있어야만 진입이 가능함)
public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("private으로 변수 접근시 호출");
		
		OutClass obj1 = new OutClass();
		OutClass.InClass obj2 = obj1.new InClass();
		
		/*
		obj2.inTest();
		//obj2.sNum;
		//obj2.num; 노출되지 않음! private 변수이기 때문!
		obj1.usingClass();
		
		System.out.println("외부클래스 먼저 생성 후 내부클래스 호출");
		OutClass outClass2 = new OutClass();
		OutClass.InClass inClass = outClass2.new InClass();
		
		inClass.inTest();
		*/
		//외부클래스를 생성하지 않고 바로 정적 내부 클래스 생성
		OutClass.InStaticClass isc = new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스의 일반 메서드");
		isc.inTest();
		/*
		System.out.println("정적 내부 클래스의 static 메서드");
		isc.sTest();
		
		System.out.println("클래스명으로 직접 접근이 가능");
		OutClass.InStaticClass.sTest();
		*/
	}
	

}