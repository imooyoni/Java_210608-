package Exam;

public class Example13 {

	public static void main(String[] args) {

		/*2차원 배열을 만들고 아래와같이 공간을 채워넣는다.

		int arr[][] = {{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20}};

		2차원 배열 arr에 담긴 모든 값의 총 합과 평균을 구하는 프로그램을 완성해보자.*/
		
		int arr[][] = {{1, 2, 3, 4, 5},
							  {6, 7, 8, 9, 10},
							  {11, 12, 13, 14, 15},
							  {16, 17, 18, 19, 20}};
		
		int total = 0;
		float average = 0;
		int count = 0;
			
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				total+=arr[i][j];
				count++;
			}//infor
			//여기에 평균을 구하면 초기화 해야함!  tcount/taverage/ttotal >> 개별 평균, 총합 구하기
		}//outfor
		
		average = (float)total / count;
		System.out.print("평균 :" + average + " / ");
		System.out.println("총합 : " +  total);
		
		
		
	}

}
