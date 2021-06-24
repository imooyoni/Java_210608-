package pk4;

public class Example01 {

	public static void main(String[] args) {

		/* 과수원이 있다.
		 * 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5, 7,5개이다.
		 * 과수원에서 하루에 생산되는 총 개수를 출력하고, 시간당 전체 과일의 평균 생산갯수를 출력
		 * 단, 평균값을 담는 변수는 float으로 지정할 것
		 * */
		
		/*내 코드
		 * int p,a,o;
		p=5;
		a=7;
		o=5;
		
		int sum = p + a + o;
		float aver;
		aver = (sum) / 24f;
		
		System.out.println(sum);
		System.out.println(aver);
		*/
		
		// 쌤코드
		int pear = 5;
		int apple=7;
		int orange=5;
		
		int fruitTotal=pear+apple+orange;
		System.out.println("생산된 총 과일의 수 : " + fruitTotal);
		
		float fruitAvg=fruitTotal / 24f;
		System.out.println("시간당 생산된 과일의 평균 : " + fruitAvg);
		//system.err.println 이면 빨간색으로 결과값 도출됨 >> 에러확인용?
	}

}
