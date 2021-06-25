package pk11;

public class Paprika extends Vegetable{
		
	private String color;
	private int price;
	private String name;
	
	
	//멤버변수에 set
	public void Set3(String a, int b, String c) {
		color = a;
		price = b;
		name =c;
	}
	public void Disp2() {
		System.out.println("색깔 : " + color);
		System.out.println("가격 : " + price);
		System.out.println("이름 : " + super.name); //super : 기본 생성자를 통해서 객체를 생성함(부모생성자와 같음)
	}
	
	//멤버변수에 Disp3
	public void Disp3() {
		System.out.println("색깔 : " + color);
		System.out.println("가격 : " + price);
		System.out.println("이름 : " + name);
	}
		

}