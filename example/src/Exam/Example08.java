package Exam;

public class Example08 {

	public static void main(String[] args) {

		int[][]array= {{95,86},{83,92,96},{78,83,93,87,88}};
		
		int sum=0;
		double avg=0.0;
		int total=0;
		
		int count=0;
		int tcount=0;
				
		//outer
		for (int i=0; i<array.length; i++) { //총 3번 반복, 0/1/2
			//inner
			for(int j=0; j<array[i].length; j++) { //열2,3,5
					sum+=array[i][j]; // sum에 array[i][j]를 더해
					count++;
			}//inner
			
			avg=(double)sum/count;
			System.out.println("sum : "+sum);
			System.out.println("avg : "+avg);
			
			total += sum;//각 행 sum 의 총합, 초기화 전에 누적
			tcount += count;// 초기화 전에 누적
			
			sum=0;//sum, avg 버리고 outer로 돌아가 >> 스레기값 비우기
			avg=0.0;
			count=0;
			
			System.out.println("--------------------");
		}//outer
		
		System.out.println("--최종 총합과 평균--");
		double avgf=(double)total/tcount;
		
		System.out.println("sum : " + total);
		System.out.println("avg : " + avgf);
	}
	//main
}//class
