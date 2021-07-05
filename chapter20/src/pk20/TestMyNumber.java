package pk20;

public class TestMyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber max = (x,y) -> (x>=y)? x: y;
		
		System.out.println(max.getMax(3, 7)); 
		
		// 원래 기본 문법 대로라면 매개변수 입력하고 구현의 순서이지만 람다의 경우 구현을 해놓고 매개변수 줌!
		
		/*
		int i= 1000;
		
		MyNumber aa = new MyNumber() {
			//i = 1000; 
			//int i는 스택 메모리 사용중, aa객체 내에 있는 i는 힙메모리 사용하기 때문에 생존주기가 더 길수도 있어서 사용이 안됨
			@Override
			public int getMax(int num1, int num2) {
				// TODO Auto-generated method stub
				
				int res = (num1 > = num2)?num1:num2;
				return res;
			}
		};
		*/
	}

}
