package pk21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {

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
			return;
		} finally { // return이 있어도 반환하고 무조건 돌아감
			if(fis!=null) {//null이 아니면 아래 돌려! >> 널포인트 익셉션을 막기 위해서 추가하는 조건문
			try {
				fis.close(); //ERROR : 닫을 것도 없는데 닫으래서 오류
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }//catch
			}//if
			System.out.println("항상 수행되는 구문");
		}
		System.out.println("프로그램 종료");
	}

}
