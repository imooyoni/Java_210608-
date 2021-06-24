package Exam;

public class Example07 {

	public static void main(String[] args) {

		int max=0;
		
		int[] array = {1,2,3,4,5};
		
		//최댓값 알고리즘
		for (int i=0; i<array.length; i++) {//계속 다른 것보다 작은지 물어보자!
			if(max<array[i])//max가 i번째 array보다 작냐?
				max=array[i];//작으면 i번재 array가 max야.
		}
			System.out.println(max);
		
	}

}

//array.size는 String 일때만 사용하는 건가?