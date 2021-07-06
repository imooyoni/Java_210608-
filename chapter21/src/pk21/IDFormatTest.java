package pk21;

public class IDFormatTest {

	private String userID;
	
	public String getUserID() {
		return userID;
	}

	public void setUserId(String userID) throws IDFormatException{ 
	//throws를 사용하면 그 클래스 내에 throw가 있는데, idformatexception에 만들어둔 throw가 없으니까 메시지를 만들어 주는 것!

		if(userID == null) {
			//Exception을 발생시키겠다.
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		} else if(userID.length()<8 || userID.length()>20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 생성하세요.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDFormatTest test = new IDFormatTest();
		String userID = null;
		
		try {
			test.setUserId(userID);
		} catch (IDFormatException e) {
			// TODO: handle exception
			//코드와 메시지 출력
			System.out.println(e);
			//getMessage(): java.lang 에서 string타입에 정의되어 있음
			System.out.println(e.getMessage());
		}
		
		userID="1234567";
		
		try {
			test.setUserId(userID);
		} catch (IDFormatException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
