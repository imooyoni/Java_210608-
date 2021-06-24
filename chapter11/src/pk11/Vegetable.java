package pk11;

public class Vegetable {
	
	String sort;
	String season;
	String name;
	
	//일반 메서드
	//메서드를 활용하여 멤버변수 set
	
	public void Set1(String a, String b, String c) {
		sort = a;
		season =b;
		name = c;
	}
	
	//메서드를 활용하여 멤버변수 get
	public void Disp1() {
		System.out.println("분류 : " + sort);
		System.out.println("계절 : " + season);
		System.out.println("이름 : " + name);
		
	}
}
