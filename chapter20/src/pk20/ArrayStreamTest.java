package pk20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("----------");
		
		Arrays.stream(arr).forEach(s->System.out.print(s+" "));
		//stream을 사용할 때 기본형으로 Arrays로 불러오는데, 새로운 객체 생성해서 배열을 새로
		//모든 컬랙션에서는 스트림을 제공함! >> 어레이즈를 통해서 컬랙션화 시켜줌!
		
		/*
		 * IntStream stream = Arrays.stream(arr);
		 * stream.forEach(s->System.out.print(s+" "));
		 * 
		 * Arrays.stream(arr).sorted().forEach(s-> system.out.print(s+""));
		 */
		System.out.println();
		System.out.println("----------");
		
		int sum = Arrays.stream(arr).sum(); //Array.stream >> 일반배열방에서 가져온 것이구나!
		System.out.println(sum);
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		/*
		 collection에서 합을 구하는 법은 reduce와 sum 두가지가 존재
		 단, stream에서의 sum()은 IntStream, DoubleStream, LongStream과 같은 
		 기본형(primitive)으로 특화 스트림이라고 함
		 보통의 방법은 mapToInt, mapToDouble, mapToLong의 메서드로 사용
		 */
		//intValue() : Integer -> int로 unBoxing
		int sum2 = list.stream().mapToInt(n->n.intValue()).sum();
		System.out.println("-----mapToInt-----");
		System.out.println(sum2);
		
		
	}

}
