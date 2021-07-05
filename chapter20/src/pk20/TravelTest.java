package pk20;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<TravelCustomer> customerlist = new ArrayList<>();
		
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
		
		customerlist.add(customerLee);
		customerlist.add(customerKim);
		customerlist.add(customerHong);
		
		//각 개체의 요소 중 이름만 mapping하여 출력
		System.out.println("==고객 명단 추가된 순서대로 출력==");
		//customerlist.stream().forEach(n -> System.out.println(n.getName() + " "));
		customerlist.stream().map(s->s.getName()).forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		//price만 mapping하여 sum()로 합계 출력
		int sum = customerlist.stream().mapToInt(n -> n.getPrice()).sum();
		System.out.println("총 여행비용 : " + sum + "입니다.");
		
		System.out.println("--20세 이상의 고객을 정렬하여 출력--");
		customerlist.stream().filter(n -> n.getAge()>=20).map(s -> s.getName()).sorted().forEach(n -> System.out.print(n + " "));
	}

}
