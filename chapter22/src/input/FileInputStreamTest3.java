package input;

import java.io.FileInputStream;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileInputStream fis = new FileInputStream("input2.txt")){
			
			//버퍼역할을 함!(담어서 가!)
			byte[] bs = new byte[10]; //바이트 단위 bs 배열방 10개
			int i;
			
			while((i=fis.read(bs))!=-1) {
				//버퍼읽기 10개씩 가베지값 출력 >> 한번 읽고 나면 끗! 사라짐! bs는 heap메모리 객체!
				//버퍼가 덮어쓰기 기능이기 때문에 열개를 기억하고 있다가 뒤에 남은거 덮어쓰고 6개 읽고 모지란 만큼은 이전 거에서 그대로 출력됨!
				for (int j=0; j<i; j++) {
					System.out.print((char)bs[j] +" ");
				}
				System.out.println(":"+i+"바이트 읽음");
			}
			System.out.println("end");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
