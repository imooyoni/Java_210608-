package pk21;

public class AutoCloseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (AutoCloseObj obj2 = new AutoCloseObj()){
			throw new Exception();//예외 발생
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외 발생 부분");
		}
		
		//자바9버전부터 밖에서 선언해도 사용가능함!
		AutoCloseObj obj2 = new AutoCloseObj();
		try (obj2){
			throw new Exception();//예외 발생
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외 발생 부분");
		}
		
	}

}
