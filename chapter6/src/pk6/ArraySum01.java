package pk6;

public class ArraySum01 {

	public static void main(String[] args) {

		int[] score = {83, 90, 87};
		
		System.out.println("score[0]: " + score[0]);
		System.out.println("score[1]: " + score[1]);
		System.out.println("score[2]: " + score[2]);
		
		int sum = 0;
		
		for (int i=0; i<3; i++) {
			sum+=score[i];
		}
		
		System.out.println("총합 : " + sum);
		double avg=(double)sum/3;
		
		//String.format : 문자열 형식으로 바꿔줌
		System.out.println( String.format("평균 : %.2f",avg));// f타입인데 소수점 2자리
		
		//반올림
		System.out.println("평균 : " + Math.round(avg));
	}

}
