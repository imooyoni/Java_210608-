package pk12;

public class Computer extends Calculator{

	@Override
	double areaCircle(double r) {
		
		System.out.println("Computer ��ü�� areaCircle() �����");
		System.out.println(Math.PI);
		
		return Math.PI*r*r;
	}
	
	

}