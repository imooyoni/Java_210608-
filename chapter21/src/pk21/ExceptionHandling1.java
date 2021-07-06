package pk21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis=null;//파일이 없을지도 몰라! 그러니까 try-catch문과 같이 사용해!
		//>> try 밖에 선언하지 않으면 지역변수 취급되서 try, finally마다 선언해야 한다!
		
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();//구문이 길어서 생략하고 주로다른 걸로 대체해서 사용함
			System.out.println(e);
		} finally {
			try {
				fis.close(); //ERROR : 닫을 것도 없는데 닫으래서 오류
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("finally");
		}
		System.out.println("end");
	}

}
