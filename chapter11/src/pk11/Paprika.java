package pk11;

public class Paprika extends Vegetable{
		
	private String color;
	private int price;
	private String name;
	
	
	//��������� set
	public void Set3(String a, int b, String c) {
		color = a;
		price = b;
		name =c;
	}
	public void Disp2() {
		System.out.println("���� : " + color);
		System.out.println("���� : " + price);
		System.out.println("�̸� : " + super.name); //super : �⺻ �����ڸ� ���ؼ� ��ü�� ������(�θ�����ڿ� ����)
	}
	
	//��������� Disp3
	public void Disp3() {
		System.out.println("���� : " + color);
		System.out.println("���� : " + price);
		System.out.println("�̸� : " + name);
	}
		

}
