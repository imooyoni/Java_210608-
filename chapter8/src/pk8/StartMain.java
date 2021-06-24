package pk8;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {
		int select;
		String check;
		
		Start updown = new Start();
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("숫자입력 : ");
			select=scan.nextInt();
			
			check=updown.check(select);
			
			if(check.equals("SUCCESS"))
			break;
			
		}
	}

}
