package pk11;

public class InheritanceTest {

	public static void main(String[] args) {
			
		StrawBerry obj = new StrawBerry();
		
		obj.Set1("Berry��", "����");
		obj.Set2("����", "��");
		obj.Set3("����", 5000);
		
		obj.Disp1();
		System.out.println("--------------------");
		obj.Disp2();
		System.out.println("--------------------");
		obj.Disp3();
		
	}

}
