package pk13;

public class SmartPhone extends Phone{

	//생성자
	public SmartPhone(String owner) {//생성자 안에 생성자 호출
		//상속을 받은 경우! 부모클래스의 생성자를 반드시 사용해야 함!
		super(owner); //super(owner) = Phone(owner)
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다");
	}
	
}
