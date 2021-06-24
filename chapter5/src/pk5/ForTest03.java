package pk5;

public class ForTest03 {
	
	public static void main(String[] args) {
		
		int i;
		int sum=0;
		
		for (i=1; i<=100; i++) {
			// 1    o       1(+1)
			sum+=i;
		}
		System.out.println("1부터 100까지의 합은 : " + sum + "입니다.");
	}
//for(i=1; i<=10; i++) :한눈에 무슨 작업을 하고 있는지 볼수 있는게 좋은 코드
}
