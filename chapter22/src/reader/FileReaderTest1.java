package reader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//한글깨짐!
		FileInputStream fis = null;
		fis=new FileInputStream("reader.txt");
		
		int i;
		
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		System.out.println();
		fis.close();
		System.out.println("end");
	}

}
