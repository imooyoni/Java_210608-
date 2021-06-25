package pk11;

public class InheritanceTest {

	public static void main(String[] args) {
			
		StrawBerry obj = new StrawBerry();
		
		obj.Set1("베리류","여름");
		obj.Set2("소", "딸기");
		obj.Set3("빨강", 5000);
		
		obj.Disp1();
		System.out.println("--------------------");
		obj.Disp2();
		System.out.println("--------------------");
		obj.Disp3();
		
	}

}
