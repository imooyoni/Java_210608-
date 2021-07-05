package pk20;

public class TestStringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "World";
		
		//방법1 : has a
		StringConcatImp concat1 = new StringConcatImp();
		concat1.makeString(s1, s2);
		
		//방법2 : lambda
		StringConcat concat2 = (s, v) -> System.out.println(s+ ", " +v);
		concat2.makeString("Lucky", "Day");
		
		//방법3: 익명의 클래스 //인터페이스이기 때문에!
		StringConcat concat3 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				// TODO Auto-generated method stub
				System.out.println(s1 + ", "+ s2);
			}
			
		};
		concat3.makeString(s1, s2);
		
		
	}

}
