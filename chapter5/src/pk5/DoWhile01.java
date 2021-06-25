package pk5;

public class DoWhile01 {
	
	public static void main(String[] args) {
		
		int num=1;				//인덱스 변수 >> 똑같은 변수인데 카운트 하는 것
		int sum=0;
		
		do {							// do~while문의 헤더
			sum += num; 		//1 값을 증가
			num++; 				//2 반복 연산에서 인덱스변수를 위한 명령
			
		} while ( num <=10);//do~while문 조건 비교해서 닫기
		
		//do~while문 종료 후 수행
		System.out.println("1부터 10까지의 합 : " + sum + "입니다.");
	}

}
