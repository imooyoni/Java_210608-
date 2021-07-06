package output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//바이트 단위 출력 >> write는 덮어쓰기가 되지 않음!
		
		/*
		 자바9 버전 이전 버전은 ("output.txt", false) : 덮어쓰기가 됨 > ABC -> GHI
		 */
		
		try (FileOutputStream fos = new FileOutputStream("output.txt",true)){//인코딩을 해야해서 true 옵션을 가급적 항상 주기
			//여기서 내보내는 거!
			fos.write(71);
			fos.write(72);
			fos.write(73);
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
