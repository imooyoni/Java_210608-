package pk21;

public class IDFormatException extends Exception{

	public IDFormatException(String message) {
		super(message); //부모클래스인 exception에 메세지 등록! 
		//idformattest의 throw에 입력한 내가 만든 메세지를 등록하는 것!
	}
}
