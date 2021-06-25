package pk7;

import java.util.Scanner;

public class MethodTest {
	
	int[] bread = null;
	
	int selectNo = 0;
	int sum = 0;
	
	void makeBread() {
		System.out.println("빵 완성!!");
	}
	
	void makeBread(int count) {
		bread = new int[count];
		
		for (int i=0; i<count; i++) {
			System.out.println( (i+1) +"번 빵 완성!!!");
		}
		
		System.out.println("요청하신 " +count + "개의 빵이 모두 완성되었습니다.");
	}
	
	void makeBread(int count, String name) {
		bread = new int[count];
		
		for(int i=0; i<count; i++) {
			System.out.println( (i+1) + "번째 " + name + " 완성!!");
		}
		System.out.println("요청하신" + count +"개의 " + name +"이 모두 완성되었습니다.");
	}

	void order(int count) {//메소드에서 다른 메소드를 불러와서 사용할 수 있음!
	
	boolean run = true;
	
	int a=0;
	String b=null;

	Scanner scan = new Scanner(System.in);
	
	while (run) {
		System.out.println("-------------------------------------------------------------");
		System.out.println("1. 빵 개수만 선택 | 2. 빵 개수와 종류 선택 | 3. 종료");
		System.out.println("-------------------------------------------------------------");
		System.out.print("선택 > ");
		
		selectNo = scan.nextInt();
		
		if (selectNo ==1 ) {
			System.out.print("주문할 빵 개수 : ");
			a = scan.nextInt();
			makeBread(a);
		} 
		else if(selectNo == 2 ) {
			for(int i=0; i<count; i++) {
			System.out.print("빵 갯수 : ");
			a=scan.nextInt();
			
			System.out.print("빵 이름 : ");
			b=scan.next();
			
			makeBread(a, b);
			}
		} 
		else if(selectNo == 3) {
			System.out.println("프로그램 종료");
			break;		
		}
	}
	}
}
