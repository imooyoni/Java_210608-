package pk5;

public class SwitchCase06 {
	
	public static void main(String[] args) {
		
		int num=(int)(Math.random()*8)+1;
		
		switch (num) {
		
		/*
		 * case 1:
		 * system.out.println("1���� ���Խ��ϴ�."); 
		 * break;
		 * 
		 * case 2: 
		 * system.out.println("2���� ���Խ��ϴ�.");
		 * break; 
		 * 
		 * case 3: 
		 * system.out.println("3���� ���Խ��ϴ�.");
		 * break; 
		 * 
		 * case 4: break;
		 * 
		 * case 5: break;
		 * 
		 * case 6: break;
		 * 
		 * default : System.out.println("��ȿ���� ���� �����Դϴ�.");
		 */
						
			case 1, 2, 3, 4, 5, 6:
				break;
			
			default :
				System.out.println("��ȿ���� ���� �����Դϴ�.");
				break;
				
		}
		System.out.println(num + "�� ȹ��");
	}
}
