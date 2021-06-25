package pk5;

public class SwitchCase07 {

	public static void main(String[] args) {
		
		int time = (int)(Math.random()*4)+8; // double > int // +뒤의 숫자는 시작 숫자를 의미함!
		System.out.println("[현재시간: " + time + "시]"); // [현재시간: N시]
		
		switch (time) {
		
		case 9:
			System.out.println("출근합니다.");
			break;
		case 10:
			System.out.println("커피를 마시고 쉽니다.");
			break;
		case 11:
			System.out.println("점심을 먹습니다.");
			break;
		
		default:
			System.out.println("탄력근무를 합니다.");
			break;
		}
		
	}
}
