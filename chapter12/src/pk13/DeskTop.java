package pk13;

public class DeskTop extends Computer{//상속받은 추상클래스를 모두 사용한경우 클래스에 abstract임을 명시해주지 않아도 됨

	//추상클래스를 상속받을 때는 반드시 추상클래스의 구현부를 완성하여야 한다.
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop Display");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop Typing");
		
	}

}
