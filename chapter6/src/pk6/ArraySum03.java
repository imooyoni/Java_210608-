package pk6;

public class ArraySum03 {
	
	public static void main(String[] args) {
		//메인(클라이언트)을 깔끔하게 해야함
		//int[] score = {83, 90, 97};
		
		int[] score;
		//score=new int[] {83, 90, 97};
		/*
		int sum=0;
		for(int i=0; i<score.length; i++) {
			sum+=score[i];
		}
	
		System.out.println("총합 : " + sum);
		*/
		int sum2=add(new int[] {83,90,87});
		System.out.println("총합 : " + sum2);
		System.out.println();
	}//main >> 실행파일이 만들어짐
		
	//매개변수 : 메소드(함수)를 컴파일(번역)시에 사용되는 변수 ,ex_int[] score >> 매개변수
	// 더하기를 할 줄 아는 서비스 >> 메인에서 
	public static int add(int[] score) {
		int sum=0;
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
	}
	return sum;
	}//main

}//class
