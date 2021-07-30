package business;

import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		CompanyService cs = new CompanyService();
		boolean run =true;
		
		while(run) {
			System.out.println("1. 등록");
			System.out.println("2. 검색");
			System.out.println("3. 종료");
			System.out.print(">>>");
			
			int select = scan.nextInt(); 
		
			switch(select){
				case 1: 
					cs.addInfo();
					break;
				case 2:
					cs.searchInfo();
					System.out.println();
					break;
				case 3:
					System.out.println("종료되었습니다.");
					run = false;
					break;
			}
		
	}

}
}