package pk12;

public class Computer extends Calculator{

	@Override
	double areaCircle(double r) {
		
		System.out.println("Computer °´Ã¼ÀÇ areaCircle() ½ÇÇàµÊ");
		System.out.println(Math.PI);
		
		return Math.PI*r*r;
	}
	
	

}
