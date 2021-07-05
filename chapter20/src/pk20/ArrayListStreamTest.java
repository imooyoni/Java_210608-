package pk20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	
	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		//lambda
		//sList의 요소들이 stream클래스로 입력
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		//확장 포문
		System.out.println("----------확장 for----------");
		for(String s: sList) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("---------정렬 후 출력-----------");
		
		//ArrayList에 있는 요소들을 스트림으로 정렬하여 출력
		sList.stream().sorted().forEach(s -> System.out.print(s + " ")); //slist를 가져와서 foreach해!
		System.out.println();
		System.out.println("---------메서드 매핑-----------"); //>글자가 몇 글자 인지!
		sList.stream().map(s->s.length()).forEach(n -> System.out.print(n)); //slist를 가져와서 foreach해!
		System.out.println();
		//컬랙션의 맵과 스트림의 맵의 차이점!
		
		System.out.println("---------필터(filter)-----------"); //글자수가 5이상의 요소만 출력 >> treeset 한것과 동일한 효과
		sList.stream().filter(s->s.length()>=5).forEach(n -> System.out.print(n + " ")); //slist를 가져와서 foreach해!
		
	}
}
