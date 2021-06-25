package pk11;

public class SuperTest {

	public static void main(String[] args) {
		Paprika obj = new Paprika();
		
		obj.Set1("야채", "여름", "노란파프리카");
		obj.Set3("빨강", 2000, "빨간파프리카");
		
		obj.Disp1();
		System.out.println("--------------------");
		obj.Disp2();
		System.out.println("--------------------");
		obj.Disp3();
	}

}