package input;

import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileInputStream fis = null;
		//한글깨짐 방지법 >> 문자단위로 읽어야 함!
		//문자 단위로 가져오려면 filereader로 가져와야됨
		
		FileReader fis = null;
		try {
			
			fis = new FileReader("input.txt");
			int i;
			//fis.read(); // 끝까지 읽고나면 -1을 반환함!
			
			while((i=fis.read())!=-1) {//stream, output은 byte단위로 읽어옴! >> 문자 단위의 입출력으로 해야함!
				System.out.print((char)i + " ");
			}
			System.out.println();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			try {
				fis.close();//일단 닫아!
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e);
			} catch (NullPointerException e) { //null값 오류일때 이거!
				System.out.println(e);
			}
		}
		System.out.println("end");

	}

}
