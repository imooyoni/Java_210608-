package pk5;

public class ifExample01 {

	public static void main(String[] args) {

		int age=2;
		
		//String res = age>=8 ? "학교에 다닙니다" : "학교에 다니지 않습니다";
		if(age>=8 ) { // {}블럭이라고 부름
			System.out.println("학교에 다닙니다.");
		}	else {
			System.out.println("학교에 다니지 않습니다.");
		}
			
	}

}
