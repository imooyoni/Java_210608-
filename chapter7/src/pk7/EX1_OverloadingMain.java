package pk7;

public class EX1_OverloadingMain {//실행형화일을 만들건데 ex1_overloading에서 가져오고싶어
	
	
	public static void main(String[] args) {
		
		//EX1_Overloading의 객체 => ex
		EX1_Overloading ex = new EX1_Overloading();// ex라는 객체를 사용하고 싶은데, o
		//동적할당, 메모리주기, 객체
		
		ex.getResult('A');
		ex.getResult(1);
		ex.getResult("ABC");
		ex.getResult(3, "가나다");
		
	}
}
