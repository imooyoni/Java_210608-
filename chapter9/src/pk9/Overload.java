package pk9;

public class Overload {

	private int age;
	private float height;
	private String name;
	
	public Overload() {//����Ʈ ������ �ʱ�ȭ ���
		age=0;
		height=0.0f;
		name="�͸�";
	}
	
	public Overload(int a, float h) {
		this.age=a;
		height=h;
		name="�͸�";
	}
	
	public Overload(int a, float h, String n) {
		this.name=n;
		this.age=a;
		this.height=h;
	}
	
	public void Disp() {
		System.out.println("�̸� : " + name);
		System.out.println("���� :" + age);
		System.out.println("Ű : " + height);
	}
}
