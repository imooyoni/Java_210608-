package pk16;

class OutClass2{
	private int num=0;
	private static int sNum=20;
	private InClass inClass;
	
	public OutClass2() {
		inClass = new InClass();
	}
	
	class InClass {
		int inNum=100;
		
		void inTest() {
			System.out.println("OutClass의 Num : " + num + "외부클래스 인스턴스 변수");
			System.out.println("OutClass의 sNum : " + sNum + "외부클래스 전역 변수");
			System.out.println("InClass의 inNum : " + inNum + "내부클래스 인스턴스 변수");
			System.out.println();
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStaticClass {
		int inNum = 100;
		static int sinNum = 200;
		
		void inTest() {
			inNum=100;
			sinNum=200;
			sNum=300;
			
			System.out.println("InStaticClass의 inNum : " + inNum + "내부 인스턴스 변수");
			System.out.println("InStaticClass의 sinNum : " + sinNum + "내부 Static 변수");
			System.out.println();
		}
		
		static void sTest() {
			sinNum=200;
			sNum=300;
			
			System.out.println("OutClass num : " + sinNum + "");
			System.out.println("OutClass num : " + sNum +"");
			System.out.println();
		}
	}
}

public class InnerTest_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("private으로 변수 접근시 호출");
		
		OutClass2 obj1 = new OutClass2();
		OutClass2.InClass obj2 = obj1.new InClass();
		
		obj2.inTest();
		obj1.usingClass();
		
		System.out.println("외부클래스 먼저 생성 후 내부클래스 호출");
		OutClass2 obj3 = new OutClass2();

	}

}

