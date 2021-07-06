package pk21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException2 {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {//특정 파일이랑 특정 클래스를 여는 걸로 구현해 볼 예정
		
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);//메서드 컨스트럭션 확인하고 싶어!
		
		return c;
	}
	
public static void main(String[] args) {
	
	ThrowsException2 test = new ThrowsException2();
	
		try {
			test.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace(); //구문이 복잡시러워서 죽임
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		} catch(Exception e) {//위에서 못잡았을때 오류가 나면 그냥 최종보스(exception)가 잡아줘!
			System.out.println(e);
		}
		System.out.println("end");
	}
}
