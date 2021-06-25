package pk5;

public class SwitchCase06 {
	
	public static void main(String[] args) {
		
		int num=(int)(Math.random()*8)+1;
		
		switch (num) {
		
		/*
		 * case 1:
		 * system.out.println("1번이 나왔습니다."); 
		 * break;
		 * 
		 * case 2: 
		 * system.out.println("2번이 나왔습니다.");
		 * break; 
		 * 
		 * case 3: 
		 * system.out.println("3번이 나왔습니다.");
		 * break; 
		 * 
		 * case 4: break;
		 * 
		 * case 5: break;
		 * 
		 * case 6: break;
		 * 
		 * default : System.out.println("유효하지 않은 숫자입니다.");
		 */
						
			case 1, 2, 3, 4, 5, 6:
				break;
			
			default :
				System.out.println("유효하지 않은 숫자입니다.");
				break;
				
		}
		System.out.println(num + "번 획득");
	}
}
