package pk11;

public class SuperTest {

	public static void main(String[] args) {
		Paprika obj = new Paprika();
		
		obj.Set1("��ä", "����", "���������ī");
		obj.Set3("����", 2000, "����������ī");
		
		obj.Disp1();
		System.out.println("--------------------");
		obj.Disp2();
		System.out.println("--------------------");
		obj.Disp3();
	}

}
