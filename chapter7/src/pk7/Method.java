package pk7;

public class Method {
	
	//필드생량 = 멤버변수
	
	//생성자 생략(기본 생성자를 사용)
	
	void makeBread() {
		System.out.println("빵을 만들었습니다.");
	}//method1
	
	void makeBread(int count) {
		//1번째 빵을 만들었습니다.
		//2번째 빵을 만들었습니다.
		
		for(int i=0; i<count; i++) {
			//함수를 호출할 때 count에 숫자를 넣고 호출할 거라서 i<count라고 하기
			System.out.println((i+1)+"번째 빵을 만들었습니다.");
		}
		System.out.println();
		System.out.println("요청하신" +count +"개의 빵이 모두 완성되었습니다.");
		
	}//method2
	
	void makeBread(int count, String name) {
		//1번째 빵을 만들었습니다.
		//2번째 빵을 만들었습니다.
		
		for(int i=0; i<count; i++) {
			//함수를 호출할 때 count에 숫자를 넣고 호출할 거라서 i<count라고 하기
			System.out.println((i+1)+"번째 " +name + "빵이 나왔습니다.");
		}
		System.out.println();
		System.out.println("요청하신 " +count +"개의 "+name+ "빵이 모두 완성되었습니다.");
		
	}//method3

}
