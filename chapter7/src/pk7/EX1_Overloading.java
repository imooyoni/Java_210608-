package pk7;

public class EX1_Overloading {

	//필드=멤버변수
	
	//생성자 생략(의 의미는 디폴트생성자만 사용할 것임!)
	
	//메서드구현
	//메서드 중복허용=Overloading : 클래스에 동일한 이름의 메서드가 존재.
	//Overloading(다형성) : 합계인데 소수에대한 합계 정수에대한합계 실수에대한합계 등 유지보수 관리의 효율성을 극대화.
	
	public void getResult(int n) {
		System.out.println(n + "은(는) int입니다.");
	}
	
	
	public void getResult(char n) {
		System.out.println(n + "은(는) char입니다.");
	}
		
	public void getResult(String n) {
		System.out.println(n + "은(는) String입니다.");
	}
	
	public void getResult(int n, String str) {
		System.out.println(n + "은(는) int이고, "+str+"은(는) String입니다.");
	}
}
