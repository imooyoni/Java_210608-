package decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.in >> byte단위로 입력됨
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
		int i;
		while((i = isr.read()) != -1) {//보조스트림
			System.out.print((char)i);
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//채팅이나 이런거 연결할때 구현하는 방법 socket
		Socket socket = new Socket();
		try {
			//바이트 단위 > 문자단위로 읽어와서 문자가 깨지지 않도록
			InputStreamReader br = new InputStreamReader(socket.getInputStream());
			//한줄씩 읽어들이기 > 속도가 빨라짐!
			//BufferedReader br2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			br.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("end");
	}

}
