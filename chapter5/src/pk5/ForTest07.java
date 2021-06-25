package pk5;

public class ForTest07 {
	
	public static void main(String[] args) {
		
		//continue
		
		int total=0;
		int num;
		
		for (num=0; num<=100; num++) {
			//짝수는 제외하고 더하기
			if (num % 2 == 0)
			//그냥 가세요 건너뛰기 계산하지 않기
			continue; // if문이 true일때 실행
			
			total += num;
		}
		System.out.println("1부터 100까지의 홀수의 합은 " + total + "입니다");
		
	}

}
