package pk4;

public class Condition_02 {

	public static void main(String[] args) {
		
		int x,y,z;
		
		x=10;
		y=20;
		
		//x�� y���� ũ�� x �ƴϸ� y
		z=( x > y ) ? x : y;
		System.out.println(z);
		
		//y�� x���� ũ�� x �ƴϸ� y
		z=( x < y ) ? x : y;
		System.out.println(z);
	}

}
