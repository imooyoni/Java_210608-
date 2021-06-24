package pk8;

import java.util.Scanner;

public class TimeTableMain {

	public static void main(String[] args) {
		
		int num;
		
		TimesTable tt = new TimesTable();
		
		System.out.print("출력할 단을 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		tt.showTable(num);
		
	}

}
