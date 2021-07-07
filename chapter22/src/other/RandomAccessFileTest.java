package other;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100); //4byte
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
		
		rf.writeDouble(3.14);//8byte
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
		
		rf.writeUTF("안녕하세요");//한글 한글자당 3byte >> 3*5+2 = 17byte
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
		
		rf.seek(0);
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer()); //포인터를 0에 가져다둠!
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println("------------------------------");
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
	}

}
