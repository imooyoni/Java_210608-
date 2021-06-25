package pk9;

public class OverloadMain {

	public static void main(String[] args) {
		Overload o1 = new Overload(38, 184.7f, "이동욱");
		
		o1.Disp();
		System.out.println("-----------------");
		
		Overload o2 = new Overload(20, 178, "Tom");
		o2.Disp();
	}

}
