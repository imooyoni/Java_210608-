package other;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("/Users/yomi/Desktop/Screen Shot 2021-06-25 at 4.11.30 PM.png");//mac 경로 복사 : command option c
		file.createNewFile();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath()); //절대경로
		System.out.println(file.getPath()); //상대경로
		//현재 위치에서 한단계위 >> ..
		//현재 위치에서 두단계 위 >> ..\\..
		
		System.out.println(file.canRead()); //읽어!
		System.out.println(file.canWrite()); //써봐!
		
	}

}
//IO의 경우 : byte 단위이기 때문에 reader 보조스트림을 이용해서 읽어와야함!