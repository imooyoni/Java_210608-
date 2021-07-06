package output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamTest2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//바이트 단위 출력 >> write는 덮어쓰기가 되지 않음!
		
		/*
		 자바9 버전 이전 버전은 ("output.txt", false) : 덮어쓰기가 됨 > ABC -> GHI
		 */
		FileOutputStream fos = new FileOutputStream("output2.txt",true);
		
		fos.write(71);
		fos.write(72);
		fos.write(73);
		
		try (fos){//객체생성을 밖으로 빼는 이런 문법도 자바 9부터 가능!
			//여기서 내보내는 거!
			byte[] bs = new byte[26];
			byte data = 65;
			for(int i = 0; i<bs.length; i++) {
				bs[i]=data;
				data++;
			}
			fos.write(bs);
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
