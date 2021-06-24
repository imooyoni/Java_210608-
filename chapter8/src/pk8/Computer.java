package pk8;

public class Computer {
	int sum1(int[] values) {
		int sum=0;
		for(int i=0; i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
	
	int sum2(int ...values) { // ...이 배열이라는 의미! values라는 이름의 int타입 배열을 sum2에서 받음
		int sum=0;
		for(int i=0; i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
}
