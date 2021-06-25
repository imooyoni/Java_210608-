package pk7;

public class TryCatchThrows {
	
	public static void fun() throws Exception{
		try {
			System.out.println("fun()메서드");
			throw new Exception();// 메모리가 만들어짐
			
		} catch (RuntimeException e) {//실행중에 발생되는 에러
			System.out.println("예외발생");//정상적으로 실행하지는 않지만 자바가 알고 있는 에러
			
		} finally {//catch가 실행이 되던지 말던지(err를 잡지 못하더라도) 무조건 실행이 되는 것
			System.out.println("finally 문장");
		}
	}

	public static void main(String[] args) {
		
		//fun();
		try {
			fun();
		} catch (Exception e) {
			System.err.println("main()의 catch문 문장");
		}
	}//main

}
