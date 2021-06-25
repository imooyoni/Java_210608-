package review;

import java.util.Scanner;

public class Chap10_Tour {

	public static void main(String[] args) {
		/*
		결과 : 
		관광객 수 : 2 (사용자가 입력)
		관광객 등록
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("관광객 수를 입력하세요. >");
		int n = scan.nextInt();
		
		Chap10_Guide guide = new Chap10_Guide(n);
		
		for(int i=0; i<n; i++) {
			System.out.print((i+1)+". 이름 : ");
			guide.guest[i].setName(scan.next());
			
			System.out.print((i+1)+". 성별 : ");
			guide.guest[i].setGender(scan.next());
			System.out.println("--------------------");
		}
		System.out.println("관광객 " + n + " 명 등록 완료!");
		
		
		boolean run=true;
		while(run) {
			
			System.out.println("--------------------");
			System.out.println("1. 관광객 정보 \n2. 목적지 변경\n3. 종료");
			System.out.println("--------------------");
			System.out.println();
			System.out.print("원하는 작업 번호를 선택하세요. >");
			int select = scan.nextInt();
			
			switch(select) {
				case 1:
					for (int i=0; i<n; i++) {
					guide.showGuestInfo(i);
					}//for
					break;
					
				case 2:
					System.out.println();
					System.out.print("현재 목적지는 " +guide.point + "입니다.\n변경하실 목적지를 입력하세요.>");
					guide.point=scan.next();
					System.out.println("목적지가 " + guide.point + "로 변경되었습니다.");
					break;
					
				case 3:
					System.out.println("작업을 종료합니다.");
					run=false;
					break;
			}//switch
		}//while
		
	}//main

}//class

/*
1. 이름 : 홍길동
1. 성별 : 남
--------------------------
2. 이름 : 홍길순
2. 성별 : 여

1. 관광객 정보
2. 목적지 변경
3. 종료

선택 >> 1
1. 이름 : 홍길동
1. 성별 : 남
1. 목적지 : 가거도
--------------------------------------
2. 이름 : 홍길순
2. 성별 : 여
2. 목적지 : 가거도
========================================
1. 관광객 정보
2. 목적지 변경
3. 종료

선택 >> 2	
어디로 변경하시겠습니까 : 오이도
오이도로 목적지 변경
========================================
1. 관광객 정보
2. 목적지 변경
3. 종료
선택 >> 3
종료
*/