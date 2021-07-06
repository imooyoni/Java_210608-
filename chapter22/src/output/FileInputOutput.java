package output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput {

	public static void main(String[] args) throws IOException{
		
		FileOutputStream fos = null;
		
		fos = new FileOutputStream("output5.txt", true);
		
		fos.write(65);
		fos.write(66);
		fos.write(67);
		fos.write(68);
		
		fos.flush();//출력버퍼 비울때 버퍼에 있던것을 한번 보여주고 비움!(메모리 관리할때 쓰는 기능)
		fos.close();
		
		System.out.println("파일이 생성되었습니다."); //flush 내려버리는 기능!
		
	}

}
