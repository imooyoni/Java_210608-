package pk11;
//���
public class Fruit {
	
	private String sort;
	private String season;
	
	public void Set1(String a, String b) {
		sort = a;
		season=b;
		
	}

	public void Disp1() {
		System.out.println("�з� : " + sort);
		System.out.println("���� : " + season);
	}

}