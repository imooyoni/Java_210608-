package pk8;

import java.util.Scanner;

public class TimeTableMain {

	public static void main(String[] args) {
		
		int num;
		
		TimesTable tt = new TimesTable();
		
		System.out.print("����� ���� �Է��ϼ���: ");
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		tt.showTable(num);
		
	}

}
