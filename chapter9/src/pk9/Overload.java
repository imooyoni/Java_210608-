package pk9;

public class Overload {

	private int age;
	private float height;
	private String name;
	
	public Overload() {//디폴트 생성자 초기화 방법
		age=0;
		height=0.0f;
		name="익명";
	}
	
	public Overload(int a, float h) {
		this.age=a;
		height=h;
		name="익명";
	}
	
	public Overload(int a, float h, String n) {
		this.name=n;
		this.age=a;
		this.height=h;
	}
	
	public void Disp() {
		System.out.println("이름 : " + name);
		System.out.println("나이 :" + age);
		System.out.println("키 : " + height);
	}
}
