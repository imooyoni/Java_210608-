package pk8;

import java.util.Scanner;

public class MyDate {
	
	public int day;
	public int month;
	public int year;
	
	void Setday(int d) {
		day =d;
	}
	
	void SetMonth(int m) {
		month = m;
	}
	void SetYear(int y) {
		year = y;
	}
	void Disp() {
		System.out.println(year + "년 " + month + "월 " + day + "일");
	}
}
