package retest;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		boolean run = true;
		
		Scanner scan = new Scanner(System.in);
		EmployeeDAO emp = new EmployeeDAO();
		
		while(run) {
			System.out.print("1. 등록 || ");
			System.out.print("2. 조회 || ");
			System.out.print("3. 삭제 || ");
			System.out.println("4. 종료");
			System.out.print("선택 >> ");
			int selectNum = scan.nextInt();
			
			if(selectNum==1) {
				emp.addEmployee();
			}
			else if(selectNum==2) {
				emp.searchEmployee();
			}else if(selectNum==3) {
				emp.deleteEmployee();
			}else if(selectNum==4) {
				System.out.println("프로그램이 종료되었습니다.");
				run = false;
			}else {
				System.out.println("잘못 선택하셨습니다.");
			}
			
		}
	}

}
