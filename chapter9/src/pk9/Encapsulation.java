package pk9;

public class Encapsulation {
	
	private int Side;
	private int Height;
	
	//둘다 0,0으로 초기화 하는 생성자
	public Encapsulation() {
		Side=0;
		Height=0;
	}
	
	public int Cal_Area(int s, int h) {
		Side = s;
		Height=h;
		
		return(s*h);
	}
}
