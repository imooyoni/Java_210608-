package review;

//outclass 생성
class OutClass {
//접근지정자가 private인 num, sNum, InClass타입 inclass 맴버변수 생성
	private int num;
	private static int sNum;
	private InClass inClass;
	
//생성자를 통해서 outclass 생성시 내부 클래스 inClass 객체를 생성
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass {
		int inNum = 100;
		
		//메서드?
		void inTest() {
			System.out.println("OutClass의 num : " + num + "외부클래스 인스턴스 변수(객체변수)");
			System.out.println("OutClass의 sNum : " + sNum + "외부클래스 전역 변수(클래스변수)");
			System.out.println("InClass의 inNum : " + inNum + "내부클래스 인스턴스 변수(객체변수)");
			System.out.println();
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	//내부 정적 클래스
	//InStaticClass 생성 후 inNum 인스턴스 변수, sinNum 객체변수 선언
	static class InStaticClass {
		int inNum;
		static int sinNum;
		//inTest 메서드 생성 후 inNum, sinNum, sNum 객체변수 초기화 후 출력
		void inTest() {
			inNum=200;
			sinNum=300;
			sNum=500;
			
			System.out.println("InStaticClass의 inNum : " + inNum + "내부 인스턴스 변수");
			System.out.println("InStaticClass의 sinNum : " + sinNum + "내부 객체 변수");
			System.out.println("OutClass의 sNum : " + sNum + "외부 객체 변수");
			System.out.println();
		}
		
		//전역 메서드 sTest 리턴값 없음 생성 후 sinNum, sNum 객체 변수 초기화 후 출력
		static void sTest() {
			sinNum=200;
			sNum=300;
			
			System.out.println("InStaticClass의 sinNum : "+ sinNum+"내부 객체 변수");
			System.out.println("OutClass의 sNum : "+ sNum+"외부 객체 변수");
			System.out.println();
		}
	}
	
}




public class InnerTest_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("private으로 변수 접근시 호출");
		//OuterClass 객체 생성 > InClass 객체 생성
		OutClass outer = new OutClass();
		OutClass.InClass outer2 = outer.new InClass();
		
		
		System.out.println("외부클래스 먼저 생성 후 내부클래스 호출");
		

	}

}

