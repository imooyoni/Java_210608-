package pk16;

import java.util.Scanner;

public class InStackTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//최대 64개를 push할 수 있도록
		InStack s = new InStack(64);
		Scanner stdIn = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("현재 데이터 수 : " + s.size()+ "/스택의 용량 : " + s.capacity());
			System.out.println("--------------------------------");
			System.out.println("(1)푸시 (2)팝 (3)피크 (4)덤프 (0)종료");
			System.out.println("--------------------------------");
			System.out.println();
			System.out.print("번호를 선택하세요 > ");
			
			int menu = stdIn.nextInt();
			
			if(menu==0)
				break;
			int x;
			
			switch (menu) {
			case 1: //푸시
				System.out.print("데이터 : ");
				x = stdIn.nextInt();
				try {
					s.push(x);
				} catch (InStack.OverflowStackExcation e) {
					// TODO: handle exception
					System.out.println("스택이 가득 찼습니다.");
				}//catch
				break;
				
			case 2: //출력
				try {
					x=s.pop();
					System.out.println("팝한 데이터는 "+ x + "입니다.");
				} catch (InStack.EmptyIntStackExcation e) {
					// TODO: handle exception
					System.out.println("스택이 비어 있습니다.");
				}
				break;
				
			case 3:
				try {
					x=s.peek();
					System.out.println("픽한 데이터는 " + x + "입니다.");
				} catch (InStack.EmptyIntStackExcation e) {
					// TODO: handle exception
					System.out.println("스택을 들여다 봅니다.");
				}
				
			case 4:
				s.clear();
				System.out.println("스택을 모두 비웠습니다.");
			}
			
			
		}
		
		
	}

}
