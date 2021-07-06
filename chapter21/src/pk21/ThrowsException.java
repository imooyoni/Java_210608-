package pk21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {//특정 파일이랑 특정 클래스를 여는 걸로 구현해 볼 예정
		
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);//메서드 컨스트럭션 확인하고 싶어!
		
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("end");
	}

}
