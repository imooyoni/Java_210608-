package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//BufferedInputStream, BufferedOutputStream : 컴파일 속도를 향상시켜주는 보조 스트림!
public class FileCopyTest2 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long millisecond = 0;
		
		try(FileInputStream fis = new FileInputStream("awt.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip");//fis 돌때 같이 돎!
					BufferedInputStream bis = new BufferedInputStream(fis);
						BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			millisecond = System.currentTimeMillis(); //현재시간 불러오기!
			
			int i;
			while ((i=bis.read())!= -1) {
				bos.write(i);
				
			}
			millisecond = System.currentTimeMillis()-millisecond; //소요시간 계산하기!
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("파일을 복사하는데 " + millisecond + "의 millisecond가 소요되었습니다.");
	}

}
