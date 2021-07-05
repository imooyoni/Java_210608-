package pk20;

public class AddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구현부를 미리 만들어두고 사용하는 것!
		Add addF = (x, y) -> x + y; //>add 타입의 변수
		
		//------------------------------
		System.out.println(addF.add(3, 5));
		System.out.println(addF.add(5, 23));
		
		
	}

}
