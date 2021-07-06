package input;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("알파벳 여러개를 쓰고[Enter]를 누르세요 > ");
		int i;
		
		try {
			while((i=System.in.read()) != '\n') {
				System.out.print((char)i);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
	}

}
