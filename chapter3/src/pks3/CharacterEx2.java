package pks3;

public class CharacterEx2 {

	public static void main(String[] args) {
		
		//int a=65; // 대문자 A
		int a=97; // 소문자 a
		System.out.println(a); //묵시적 형변환, 명시적 형변환 등 있음
		System.out.println((char)a); //숫자를 찍고 문자로 바꿔서 하시면 되잖아요 > 형변환(ASCII코드)
		
		System.out.println("===========================");
		//int와 char는 호환이 가능하지만 음수는 호환되지 않는다
		int b=-66;
		System.out.println(b);
		System.out.println((char)b);
		
		System.out.println("===========================");
		char a2=65;
		//char b2=-66; // Error ASCII코드에 명시되어 있지 않은 값이기 때문에 오류!
		System.out.println(a2);
		System.err.println((int)a2);
		
		System.out.println("===========================");
		
		
		
	}

}
