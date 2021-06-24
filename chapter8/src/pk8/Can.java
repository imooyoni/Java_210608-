package pk8;

public class Can {
	Vending vending = new Vending();
	//멤버변수 = 필드= 속성
	private String canName; //음료이름 >>getter setter를 사용하기 위한 큰그림일 수도 있음
	private int price;//음료가격
	
	//생성자
	public Can(String canName, int price) {//가격과 음료를 아예 가지고 들어옴
		this.canName=canName; //this를 명시하지 않으면 가장 가까운 곳으로 접근함
		this.price=price;
	}

	public String getCanName() {
		return canName;
	}

	public void setCanName(String canName) {
		this.canName = canName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
}
