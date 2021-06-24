package pk13;

public abstract class NoteBook extends Computer{
	//상속받은 추상클래스 중에서 하나라도 오버라이딩 하지 않은 경우 추상메서드 구현부가 남아 있다는 의미!
	//일부만 오버라이딩 하는 경우 추상클래스임을 모르기 때문에 abstract를 클래스 앞에 명시해줌! 

	@Override
	public void display() {
		System.out.println("NoteBook Display");		
	}


}
