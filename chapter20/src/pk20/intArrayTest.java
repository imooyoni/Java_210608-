package pk20;

import java.util.Arrays;
import java.util.stream.IntStream;

public class intArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};

		//stream 생성
		IntStream stream = Arrays.stream(arr);
		//stream을 sum에서 사용
		int sum = stream.sum();
		System.out.println(sum);
		
		//stream 사용 count()에 사용하려면 재선언해야함
		//이미 사용했으므로 소멸된 stream이다.
		//int count = (int) stream.count();//ERROR
		//System.out.println(count);
		
		//stream 객체 생성 후 연산 수행하는 코드
		//IntStream stream2 = Arrays.stream(arr);
		//int cnt = (int)stream2.count();
		
		int count = (int)Arrays.stream(arr).count();
		System.out.println(count);
		
		//반복적인 연산을 만들어 놓고 사용하는 건데, 사용할 때마다 소멸함!
		System.out.println(Arrays.stream(arr).reduce(0, (a,b) -> a+b));
	}

}
