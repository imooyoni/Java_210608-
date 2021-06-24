package pk5;

public class WhileTest01 {

	public static void main(String[] args) {
		
		while (true) { //while(true)는 무한반복하기 때문에 break를 꼭 걸어주어야 함! 
			int num=(int)(Math.random()*6)+1; 	//1부터 6까지 랜덤으로 뽑아서
			System.out.println(num); 					// 숫자를 출력해봐
			if (num == 6) {									//출력한 숫자가 6이면
				break; 										//그만해
			}
		}
		System.out.println("프로그램 종료");
	}
}
