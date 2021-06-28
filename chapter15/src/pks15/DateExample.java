package pks15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date now = new Date();
		System.out.println(now);
		
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");//y소문자 m대문자(m분과 겹쳐서 대문자로 씀)
		String strNow2 = sdf.format(now);
		
		System.out.println(strNow2);
		

	}

}
