package pk11;

public class Vegetable {
	
	String sort;
	String season;
	String name;
	
	//�Ϲ� �޼���
	//�޼��带 Ȱ���Ͽ� ������� set
	
	public void Set1(String a, String b, String c) {
		sort = a;
		season =b;
		name = c;
	}
	
	//�޼��带 Ȱ���Ͽ� ������� get
	public void Disp1() {
		System.out.println("�з� : " + sort);
		System.out.println("���� : " + season);
		System.out.println("�̸� : " + name);
		
	}
}
